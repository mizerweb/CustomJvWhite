package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class cui implements cmi, v68, gqh {
    public static final bh0 b = new bh0("camerax.video.VideoCapture.videoOutput", u2j.class, null);
    public static final bh0 c = new bh0("camerax.video.VideoCapture.videoEncoderInfoFinder", bwi.class, null);
    public static final bh0 d = new bh0("camerax.video.VideoCapture.forceEnableSurfaceProcessing", Boolean.class, null);
    public final dhc a;

    public cui(dhc dhcVar) {
        qyj.i(dhcVar.a.containsKey(b));
        this.a = dhcVar;
    }

    @Override // defpackage.n8e
    public final t94 getConfig() {
        return this.a;
    }

    @Override // defpackage.n68
    public final int getInputFormat() {
        return 34;
    }
}
