package defpackage;

import one.video.player.BaseVideoPlayer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dt0 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ dt0(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        String str;
        int i = this.a;
        int i2 = this.b;
        switch (i) {
            case 0:
                wx wxVar = BaseVideoPlayer.C;
                if (i2 == 1) {
                    str = "OFF";
                } else if (i2 != 2) {
                    str = i2 != 3 ? "null" : "ALL";
                } else {
                    str = "ONE";
                }
                return "RepeatMode set to ".concat(str);
            case 1:
                return new mj9(i2);
            case 2:
                return i2 + " bytes written";
            case 3:
                return i2 + " bytes read";
            default:
                return "state set to ".concat(v0h.n(i2));
        }
    }
}
