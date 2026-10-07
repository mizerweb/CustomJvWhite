package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class ooh extends byh {
    public final boolean c;

    public ooh(String str, rmh rmhVar) {
        super(str, rmhVar);
        String str2 = rmhVar.a;
        boolean z = false;
        if (str2 != null && r5h.V0(str2, "auto", 0, false, 6) == -1) {
            z = true;
        }
        this.c = !z;
    }

    public final boolean b() {
        return this.c;
    }

    public final String toString() {
        return "TextTrack(format: " + ((rmh) this.b) + ")";
    }
}
