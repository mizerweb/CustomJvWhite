package defpackage;

import android.util.Size;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class rya implements uti {
    public final String b;
    public final nf2 c;
    public final ifh d;

    public rya(String str, nf2 nf2Var, bwi bwiVar) {
        this.b = str;
        this.c = nf2Var;
        this.d = new ifh(new vx9(bwiVar, 11, this));
    }

    @Override // defpackage.uti
    public final Size a(pi0 pi0Var, fx5 fx5Var) {
        ifh ifhVar = this.d;
        if (mvl.b(fx5Var, ((qya) ifhVar.getValue()).a)) {
            return (Size) ((qya) ifhVar.getValue()).b.get(pi0Var);
        }
        return null;
    }

    @Override // defpackage.uti
    public final List b(fx5 fx5Var) {
        ifh ifhVar = this.d;
        return mvl.b(fx5Var, ((qya) ifhVar.getValue()).a) ? ww3.T1(((qya) ifhVar.getValue()).b.keySet()) : r66.a;
    }

    public final String toString() {
        return "MimeMatchedVideoCapabilities(mime=" + this.b + ", cameraInfo=" + this.c + ')';
    }
}
