package us.apmac.unifiedlocation

import android.content.Context
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import org.unifiedpush.android.connector.MessagingReceiver

class CustomReceiver: MessagingReceiver() {
    override fun onMessage(context: Context, message: ByteArray, instance: String) {
        Toast.makeText(context, message.toString(), Toast.LENGTH_SHORT).show()
    }

    override fun onNewEndpoint(context: Context, endpoint: String, instance: String) {
        // Called when a new endpoint is to be used for sending push messages
        // You should send the endpoint to your application server
        // and sync for missing notifications.
    }

    override fun onRegistrationFailed(context: Context, instance: String) {
        // called when the registration is not possible, eg. no network
    }

    override fun onUnregistered(context: Context, instance: String){
        // called when this application is unregistered from receiving push messages
    }
}