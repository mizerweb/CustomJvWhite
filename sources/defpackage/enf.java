package defpackage;

import ru.ok.android.externcalls.sdk.sessionroom.internal.participant.SessionRoomParticipantsDataProviderImpl;
import ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class enf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cf7 b;

    public /* synthetic */ enf(int i, cf7 cf7Var) {
        this.a = i;
        this.b = cf7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        cf7 cf7Var = this.b;
        switch (i) {
            case 0:
                SessionRoomParticipantsDataProviderImpl.resolveParticipantIds$lambda$1(cf7Var);
                break;
            case 1:
                StereoRoomManagerImpl.revokeRoles$lambda$1(cf7Var);
                break;
            case 2:
                StereoRoomManagerImpl.grantAdmin$lambda$0$1(cf7Var);
                break;
            default:
                StereoRoomManagerImpl.revokeAdmin$lambda$0$1(cf7Var);
                break;
        }
    }
}
