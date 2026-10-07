package defpackage;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes.dex */
@mif
public final class ozd implements a4b {
    public static final nzd Companion = new nzd();
    public static final ny8[] d = {rx8.P(2, new tyd(4)), null, null};
    public final syd a;
    public final String b;
    public final fzd c;

    public /* synthetic */ ozd(int i, syd sydVar, String str, fzd fzdVar) {
        if (7 != (i & 7)) {
            shl.b(i, 7, mzd.a.d());
            throw null;
        }
        this.a = sydVar;
        this.b = str;
        this.c = fzdVar;
    }

    @Override // defpackage.a4b
    public final void a(yia yiaVar) throws IOException {
        fzd fzdVar = this.c;
        yiaVar.I(fzdVar != null ? 3 : 2);
        yiaVar.P("type");
        yiaVar.P(this.a.a);
        yiaVar.P(ApiProtocol.KEY_TOKEN);
        yiaVar.P(this.b);
        if (fzdVar != null) {
            yiaVar.P("pushOptions");
            yiaVar.E(fzdVar.a);
        }
    }

    public final String b() {
        return this.b;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0033  */
    public final String toString() {
        String strK;
        StringBuilder sb = new StringBuilder("PushToken{type=");
        sb.append(this.a.a);
        sb.append(",token=");
        boolean zC = gm0.c();
        Object obj = this.b;
        if (zC) {
            strK = obj.toString();
        } else if (obj instanceof Collection) {
            Collection collection = (Collection) obj;
            if (collection.isEmpty()) {
                strK = "[]";
            } else {
                strK = c0a.k(collection.size(), "[**", "**]");
            }
        } else if (obj instanceof Map) {
            Map map = (Map) obj;
            strK = map.isEmpty() ? "{}" : c0a.k(map.size(), "{**", "**}");
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length == 0) {
                strK = "[]";
            } else {
                strK = c0a.k(objArr.length, "[**", "**]");
            }
        } else if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            if (iArr.length == 0) {
                strK = "[]";
            } else {
                strK = c0a.k(iArr.length, "[**", "**]");
            }
        } else if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            if (fArr.length == 0) {
                strK = "[]";
            } else {
                strK = c0a.k(fArr.length, "[**", "**]");
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            if (jArr.length == 0) {
                strK = "[]";
            } else {
                strK = c0a.k(jArr.length, "[**", "**]");
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            if (dArr.length == 0) {
                strK = "[]";
            } else {
                strK = c0a.k(dArr.length, "[**", "**]");
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            if (sArr.length == 0) {
                strK = "[]";
            } else {
                strK = c0a.k(sArr.length, "[**", "**]");
            }
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (bArr.length == 0) {
                strK = "[]";
            } else {
                strK = c0a.k(bArr.length, "[**", "**]");
            }
        } else if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            if (cArr.length == 0) {
                strK = "[]";
            } else {
                strK = c0a.k(cArr.length, "[**", "**]");
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            if (zArr.length == 0) {
                strK = "[]";
            } else {
                strK = c0a.k(zArr.length, "[**", "**]");
            }
        } else {
            strK = "***";
        }
        sb.append(strK);
        sb.append(",pushOptions=");
        fzd fzdVar = this.c;
        return zo5.u(sb, fzdVar != null ? fzdVar.a : -1L, '}');
    }

    public ozd(syd sydVar, String str, fzd fzdVar) {
        this.a = sydVar;
        this.b = str;
        this.c = fzdVar;
    }
}
