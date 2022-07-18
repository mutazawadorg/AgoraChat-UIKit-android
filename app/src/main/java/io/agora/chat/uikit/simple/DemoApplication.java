package io.agora.chat.uikit.simple;

import android.app.Application;

import io.agora.chat.ChatOptions;
import io.agora.chat.uikit.EaseUIKit;
import io.agora.chat.uikit.options.EaseReactionOptions;

public class DemoApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        boolean isAgreementAccepted = getAgreementStateFromSP();
        if(isAgreementAccepted) {
            initAgoraChatSDK();
        }
    }

    private boolean getAgreementStateFromSP() {
        return true;
    }

    public void initAgoraChatSDK() {
        ChatOptions options = new ChatOptions();
        options.setAppKey("Your appkey");
        EaseUIKit.getInstance().init(this, options);

        EaseReactionOptions easeReactionOptions = new EaseReactionOptions();
        easeReactionOptions.setOpen(true);
        EaseUIKit.getInstance().setReactionOptions(easeReactionOptions);
    }
}
