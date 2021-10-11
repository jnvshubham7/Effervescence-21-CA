//package com.example.effe_21ca;
//
//
//import android.annotation.SuppressLint;
//import android.content.Context;
//import android.content.Intent;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//
//import com.example.effe_21ca.models.Users;
//import com.example.effe_21ca.user.UserFragment;
//import com.google.firebase.auth.FirebaseAuth;
//import com.google.firebase.database.DataSnapshot;
//import com.google.firebase.database.DatabaseError;
//import com.google.firebase.database.FirebaseDatabase;
//import com.google.firebase.database.ValueEventListener;
//
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Date;
//
//public class Users_Adapter extends RecyclerView.Adapter<Users_Adapter.UsersViewHolder> {
//
//    Context context;
//    ArrayList<Users> users;
//
//    public Users_Adapter(Context context, ArrayList<Users> users) {
//        this.context = context;
//        this.users = users;
//    }
//
//    @NonNull
//    @Override
//    public UsersViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(context).inflate(R.layout.list_item_leaderboard, parent, false);
//
//        return new UsersViewHolder(view);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull UsersViewHolder holder, int position) {
//        Users user = users.get(position);
//
//
//
//
//
//
//       holder.userName.setText(user.getUserName());
//
//
//        holder.itemView.setOnClickListener(v -> {
//            Intent intent = new Intent(context, UserFragment.class);
//            intent.putExtra("name", user.getUserName());
//
//            intent.putExtra("uid", user.getUid());
//            context.startActivity(intent);
//        });
//    }
//
//    @Override
//    public int getItemCount() {
//        return users.size();
//    }
//
//    public static class UsersViewHolder extends RecyclerView.ViewHolder {
//
//        binding;
//
//        public UsersViewHolder(@NonNull View itemView) {
//            super(itemView);
//          //  binding = RowConversationBinding.bind(itemView);
//        }
//    }
//
//}
//








package com.example.effe_21ca;


import static android.content.Context.MODE_PRIVATE;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;


import com.example.effe_21ca.models.Users;
import com.example.effe_21ca.user.UserFragment;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Users_Adapter extends RecyclerView.Adapter<Users_Adapter.UsersViewHolder> {

    Context context;
    ArrayList<Users> users;
    private boolean isFragment;

    public Users_Adapter(Context context, ArrayList<Users> users, boolean isFragment) {
        this.context = context;
        this.users = users;
        this.isFragment = isFragment;
    }

    public Users_Adapter(Context context, ArrayList<Users> users) {
        this.context = context;
        this.users = users;
    }

    @NonNull
    @Override
    public UsersViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item_leaderboard, parent, false);

        return new UsersViewHolder(view);
    }



    @Override
    public void onBindViewHolder(@NonNull UsersViewHolder holder, int position) {


        Users user = users.get(position);
        holder.userName.setText(user.getUserName());
        holder.score.setText(String.valueOf(user.getScore()));
        // TextView.setText(String.valueOf(int)).
        holder.srNoTextView.setText(String.valueOf(position+1));


//        holder.itemView.setOnClickListener(view -> {
//            if (isFragment) {
//                SharedPreferences.Editor editor = context.getSharedPreferences("PREFS", MODE_PRIVATE).edit();
//                editor.putString("profileid", user.getUserId());
//                editor.apply();
//
//                ((FragmentActivity) context).getSupportFragmentManager().beginTransaction().replace(R.id.container,
//                        new UserFragment()).commit();
//            } else {
//                Intent intent = new Intent(context, Bottom_Navigation_Activity.class);
//                intent.putExtra("publisherid", user.getUserId());
//                context.startActivity(intent);
//            }
//        });



//        final Information current = users.get(position);
//        holder.name.setText(current.name);
//        holder.job.setText(current.job);
//
//        FragmentB fragmentB=new FragmentB();
//        Bundle bundle=new Bundle();
//        bundle.putString("NAME",current.name);
//        bundle.putString("JOB",current.job);
//        fragmentB.setArguments(bundle);





    }

//    @Override
//    public void onBindViewHolder(final UsersViewHolder holder, final int position) {
//
//
//
//    }



//                        Log.i("score",score.toString());
//}
//    @Override
//    public void onCancelled(DatabaseError databaseError) {
//        //handle databaseError
//    }
//});


//        holder.itemView.setOnClickListener(v -> {
//            Intent intent = new Intent(context, UserFragment.class);
//            intent.putExtra("name", user.getUserName());
//
//            intent.putExtra("uid", user.getUid());
//            context.startActivity(intent);
//        });
 //   }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public static class UsersViewHolder extends RecyclerView.ViewHolder {

        TextView userName,srNoTextView,score;;

        public UsersViewHolder(@NonNull View itemView) {
            super(itemView);
            userName = itemView.findViewById(R.id.name1);
            srNoTextView=itemView.findViewById(R.id.srNoTextView);
            score=itemView.findViewById(R.id.Score);

            //  binding = RowConversationBinding.bind(itemView);
        }
    }

}