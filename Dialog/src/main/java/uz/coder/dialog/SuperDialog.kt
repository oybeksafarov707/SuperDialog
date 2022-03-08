package uz.coder.dialog

import android.app.AlertDialog
import android.app.Dialog
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import com.google.android.material.bottomsheet.BottomSheetDialog

class SuperDialog(context: Context) : Dialog(context) {

    fun showPermissionDialog(onClick: OnClick) {

        AlertDialog.Builder(context).setTitle("Use Google`s Location Service?")
            .setMessage("Let google help apps determine location. This means sending anonymous location data to Google, even when no apps are running.")
            .setPositiveButton(
                "Agree"
            ) { p0, _ ->
                p0.cancel()
                onClick.click("Agree")

            }
            .setNegativeButton(
                "Disagree"
            ) { p0, _ ->
                p0.cancel()

                onClick.click("DisAgree")

            }.show()

    }



    fun showSwitchDialog(onClick: OnClick) {


        val dialog = AlertDialog.Builder(context).setPositiveButton(
            "Choose"
        ) { p0, _ ->
            p0.cancel()

            onClick.click("Selected")

        }.create()
        dialog.setTitle("Social Networks")
        val view = LayoutInflater.from(context).inflate(R.layout.switch_dialog, null, false)

        dialog.setView(view)
        dialog.setContentView(view)
        dialog.show()

    }


    fun showDateDialog(onClick: OnClick) {

        val dialog = AlertDialog.Builder(context).setPositiveButton(
            "Choose"
        ) { p0, _ -> p0.cancel() }.create()
        dialog.setTitle("Select data and time")
        val view = LayoutInflater.from(context).inflate(R.layout.date_dialog, null, false)

        val time = view.findViewById<View>(R.id.time)
        val timeBtn = view.findViewById<View>(R.id.time_btn)
        val date = view.findViewById<View>(R.id.date)
        val dateBtn = view.findViewById<View>(R.id.date_btn)

        timeBtn.setOnClickListener {
            date.visibility = View.VISIBLE
            time.visibility = View.GONE
        }
        dateBtn.setOnClickListener {
            time.visibility = View.VISIBLE
            date.visibility = View.GONE
        }

        dialog.setView(view)
        dialog.setContentView(view)
        dialog.show()


    }


    fun showWiFiDialog(onClick: OnClick) {

        val dialog = BottomSheetDialog(context)
        val view = LayoutInflater.from(context).inflate(R.layout.wifi_dialog, null, false)


        view.findViewById<TextView>(R.id.tv1).setOnClickListener { onClick.click("Canceled") }
        view.findViewById<TextView>(R.id.tv2).setOnClickListener { onClick.click("Connected") }

        dialog.setContentView(view)
        dialog.show()


    }


    interface OnClick {
        fun click(m: String)
    }


}