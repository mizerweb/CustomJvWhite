package defpackage;

import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.asr.internal.commands.AsrCommandsExecutorImpl;
import ru.ok.android.externcalls.sdk.chat.internal.command.ChatCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.feature.internal.commands.ConversationFeatureCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.feedback.internal.commands.FeedbackCommandsExecutorImpl;
import ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.participant.state.internal.ParticipantStatesManagerImpl;
import ru.ok.android.externcalls.sdk.urlsharing.external.internal.commands.UrlSharingCommandsExecutorImpl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ox implements n4g {
    public final /* synthetic */ int a;
    public final /* synthetic */ cf7 b;

    public /* synthetic */ ox(int i, cf7 cf7Var) {
        this.a = i;
        this.b = cf7Var;
    }

    @Override // defpackage.n4g
    public final void onResponse(JSONObject jSONObject) {
        int i = this.a;
        cf7 cf7Var = this.b;
        switch (i) {
            case 0:
                AsrCommandsExecutorImpl.startRecord$lambda$1(cf7Var, jSONObject);
                break;
            case 1:
                AsrCommandsExecutorImpl.stopRecord$lambda$1(cf7Var, jSONObject);
                break;
            case 2:
                ChatCommandExecutorImpl.sendMessage$lambda$2(cf7Var, jSONObject);
                break;
            case 3:
                ConversationFeatureCommandExecutorImpl.enableFeatureForRoles$lambda$2(cf7Var, jSONObject);
                break;
            case 4:
                FeedbackCommandsExecutorImpl.sendFeedback$lambda$1(cf7Var, jSONObject);
                break;
            case 5:
                MediaMuteCommandExecutorImpl.requestToEnableMedia$lambda$1(cf7Var, jSONObject);
                break;
            case 6:
                MediaMuteCommandExecutorImpl.updateMediaOptions$lambda$1(cf7Var, jSONObject);
                break;
            case 7:
                ParticipantStatesManagerImpl.lowerHandForAll$lambda$1(cf7Var, jSONObject);
                break;
            case 8:
                UrlSharingCommandsExecutorImpl.start$lambda$1(cf7Var, jSONObject);
                break;
            default:
                UrlSharingCommandsExecutorImpl.stop$lambda$1(cf7Var, jSONObject);
                break;
        }
    }
}
