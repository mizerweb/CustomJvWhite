package defpackage;

import org.apache.http.conn.params.ConnManagerParams;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.asr.internal.commands.AsrCommandsExecutorImpl;
import ru.ok.android.externcalls.sdk.chat.internal.command.ChatCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.feature.internal.commands.ConversationFeatureCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.feedback.internal.commands.FeedbackCommandsExecutorImpl;
import ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.participant.state.internal.ParticipantStatesManagerImpl;
import ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomAdminCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.stereo.internal.command.StereoRoomCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.urlsharing.external.internal.commands.UrlSharingCommandsExecutorImpl;
import ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandExecutorImpl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nx implements n4g {
    public final /* synthetic */ int a;
    public final /* synthetic */ af7 b;

    public /* synthetic */ nx(int i, af7 af7Var) {
        this.a = i;
        this.b = af7Var;
    }

    @Override // defpackage.n4g
    public final void onResponse(JSONObject jSONObject) {
        int i = this.a;
        af7 af7Var = this.b;
        switch (i) {
            case 0:
                AsrCommandsExecutorImpl.startRecord$lambda$0(af7Var, jSONObject);
                break;
            case 1:
                AsrCommandsExecutorImpl.stopRecord$lambda$0(af7Var, jSONObject);
                break;
            case 2:
                ChatCommandExecutorImpl.sendMessage$lambda$1(af7Var, jSONObject);
                break;
            case 3:
                ConversationFeatureCommandExecutorImpl.enableFeatureForRoles$lambda$1(af7Var, jSONObject);
                break;
            case 4:
                FeedbackCommandsExecutorImpl.sendFeedback$lambda$0(af7Var, jSONObject);
                break;
            case 5:
                MediaMuteCommandExecutorImpl.requestToEnableMedia$lambda$0(af7Var, jSONObject);
                break;
            case 6:
                MediaMuteCommandExecutorImpl.updateMediaOptions$lambda$0(af7Var, jSONObject);
                break;
            case 7:
                ParticipantStatesManagerImpl.lowerHandForAll$lambda$0(af7Var, jSONObject);
                break;
            case 8:
                SessionRoomAdminCommandExecutorImpl.switchRoom$lambda$0(af7Var, jSONObject);
                break;
            case 9:
                SessionRoomAdminCommandExecutorImpl.updateRooms$lambda$0(af7Var, jSONObject);
                break;
            case 10:
                SessionRoomCommandExecutorImpl.joinRoom$lambda$0(af7Var, jSONObject);
                break;
            case 11:
                SessionRoomCommandExecutorImpl.leaveRoom$lambda$0(af7Var, jSONObject);
                break;
            case 12:
                SessionRoomCommandExecutorImpl.requestAttention$lambda$0(af7Var, jSONObject);
                break;
            case 13:
                StereoRoomCommandExecutorImpl.requestPromotion$lambda$0(af7Var, jSONObject);
                break;
            case 14:
                StereoRoomCommandExecutorImpl.acceptPromotion$lambda$0(af7Var, jSONObject);
                break;
            case 15:
                StereoRoomCommandExecutorImpl.promoteParticipant$lambda$0(af7Var, jSONObject);
                break;
            case 16:
                UrlSharingCommandsExecutorImpl.start$lambda$0(af7Var, jSONObject);
                break;
            case 17:
                UrlSharingCommandsExecutorImpl.stop$lambda$0(af7Var, jSONObject);
                break;
            case 18:
                WatchTogetherCommandExecutorImpl.resume$lambda$0(af7Var, jSONObject);
                break;
            case 19:
                WatchTogetherCommandExecutorImpl.setVolume_F2PwOSs$lambda$0(af7Var, jSONObject);
                break;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                WatchTogetherCommandExecutorImpl.pause$lambda$0(af7Var, jSONObject);
                break;
            case 21:
                WatchTogetherCommandExecutorImpl.setPosition$lambda$0(af7Var, jSONObject);
                break;
            case 22:
                WatchTogetherCommandExecutorImpl.play_yj_a6ag$lambda$0(af7Var, jSONObject);
                break;
            case 23:
                WatchTogetherCommandExecutorImpl.setMuted$lambda$0(af7Var, jSONObject);
                break;
            default:
                WatchTogetherCommandExecutorImpl.stop$lambda$0(af7Var, jSONObject);
                break;
        }
    }
}
