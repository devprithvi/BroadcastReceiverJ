package com.dev.prithvi.broadcastreceiverj;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class BroadcastReceiver extends android.content.BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        if (Intent.ACTION_AIRPLANE_MODE_CHANGED.equals(intent.getAction())) {
            Toast.makeText(context, "ACTION_AIRPLANE_MODE_CHANGED", Toast.LENGTH_SHORT).show();
        }
    }
}
