package defpackage;

import android.widget.ImageView;

/* JADX INFO: loaded from: classes2.dex */
public final class ji0 {
    public int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public ki0 a() {
        String strConcat = this.a == 0 ? " registrationStatus" : "";
        if (((Long) this.f) == null) {
            strConcat = strConcat.concat(" expiresInSecs");
        }
        if (((Long) this.g) == null) {
            strConcat = strConcat.concat(" tokenCreationEpochInSecs");
        }
        if (strConcat.isEmpty()) {
            return new ki0(this.a, ((Long) this.f).longValue(), ((Long) this.g).longValue(), (String) this.b, (String) this.c, (String) this.d, (String) this.e);
        }
        ore.k("Missing required properties:".concat(strConcat));
        return null;
    }

    public ImageView b() {
        return (ImageView) ((ny8) this.g).getValue();
    }

    public void c(boolean z) {
        b().setVisibility(z ? 0 : 8);
    }
}
