package com.example.codenextchat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import de.hdodenhof.circleimageview.CircleImageView;

public class MessageAdapter extends ArrayAdapter<Message> {
    public MessageAdapter(Context context, ArrayList<Message> list) {
        super(context, 0, list);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.message_list_item, parent, false);
        Message chatMessage = getItem(position);
        TextView messageTextView = convertView.findViewById(R.id.messageTextView);
        messageTextView.setText(chatMessage.getText());
        TextView usernameTextView = convertView.findViewById(R.id.usernameTextView);
        usernameTextView.setText(chatMessage.getName());
        //Use a cool circular ImageView for the profile pic. This comes from the library dependecy you imported.
        CircleImageView profilePicImageview = convertView.findViewById(R.id.messengerImageView);

        //if there is a profile pic from the authenticated user, load that.
        //otherwise, load the default profile icon.
        if(chatMessage.getProfilePic() != null) {
            Picasso.get().load(chatMessage.getProfilePic()).into(profilePicImageview);
        } else {
            profilePicImageview.setImageResource(R.drawable.ic_account_circle_black_36dp);
        }

        return convertView;
    }
}