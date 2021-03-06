package nl.computerhok.send2mpd;

import org.acra.ACRA;
import org.acra.ReportingInteractionMode;
import org.acra.annotation.ReportsCrashes;

import android.app.Application;

@ReportsCrashes(formKey = "", mailTo = "harry.metske@gmail.com", mode = ReportingInteractionMode.TOAST, resToastText = R.string.crash_toast_text)
public class Send2MPDApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // The following line triggers the initialization of ACRA
        ACRA.init(this);
    }
}