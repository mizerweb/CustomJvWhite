package defpackage;

import ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zkg implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StereoRoomManagerImpl b;
    public final /* synthetic */ af7 c;
    public final /* synthetic */ cf7 d;

    public /* synthetic */ zkg(StereoRoomManagerImpl stereoRoomManagerImpl, af7 af7Var, cf7 cf7Var, int i) {
        this.a = i;
        this.b = stereoRoomManagerImpl;
        this.c = af7Var;
        this.d = cf7Var;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        cf7 cf7Var = this.d;
        af7 af7Var = this.c;
        StereoRoomManagerImpl stereoRoomManagerImpl = this.b;
        yt1 yt1Var = (yt1) obj;
        switch (i) {
            case 0:
                return StereoRoomManagerImpl.promoteParticipant$lambda$0(stereoRoomManagerImpl, af7Var, cf7Var, yt1Var);
            default:
                return StereoRoomManagerImpl.unpromoteParticipantImpl$lambda$0(stereoRoomManagerImpl, af7Var, cf7Var, yt1Var);
        }
    }
}
