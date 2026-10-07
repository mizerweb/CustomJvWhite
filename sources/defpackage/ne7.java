package defpackage;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ne7 implements e68 {
    public static final ifh c = new ifh(new i94(26));
    public static final ifh d = new ifh(new i94(27));
    public final ny8 a;
    public final ny8 b;

    public ne7(ny8 ny8Var, ny8 ny8Var2) {
        this.a = ny8Var;
        this.b = ny8Var2;
    }

    public static int b(lge lgeVar, String str) {
        List listA;
        tn9 tn9VarA = lge.a(lgeVar, str);
        String str2 = (tn9VarA == null || (listA = tn9VarA.a()) == null) ? null : (String) ((sn9) listA).get(1);
        Integer numValueOf = str2 != null ? Integer.valueOf(Integer.parseInt(str2)) : null;
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        String name = ne7.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return 100;
        }
        je9 je9Var = je9.f;
        if (!a4cVar.b(je9Var)) {
            return 100;
        }
        a4cVar.c(je9Var, name, "Can't determine SVG size by regex " + lgeVar, null);
        return 100;
    }

    @Override // defpackage.e68
    public final xt3 a(p76 p76Var, int i, i1e i1eVar, d68 d68Var) throws IOException {
        bbd bbdVar = (bbd) this.a.getValue();
        if (bbdVar.e == null) {
            abd abdVar = bbdVar.a;
            bbdVar.e = new mx6(abdVar.d, abdVar.c);
        }
        g95 g95VarA = bbdVar.e.a(i);
        try {
            Object objK = g95VarA.K();
            byte[] bArr = (byte[]) objK;
            Arrays.fill(bArr, 0, bArr.length, (byte) 0);
            byte[] bArr2 = (byte[]) objK;
            ((cba) au3.A(p76Var.a).K()).E(0, 0, i, bArr2);
            String str = new String(bArr2, 0, i, pt2.a);
            g95VarA.close();
            boolean z = d68Var instanceof eeh;
            int iB = z ? ((eeh) d68Var).b() : b((lge) c.getValue(), str);
            int iA = z ? ((eeh) d68Var).a() : b((lge) d.getValue(), str);
            au3 au3VarC = ((k2d) this.b.getValue()).c(iB, iA, d68Var.a);
            try {
                Bitmap bitmap = (Bitmap) au3VarC.K();
                bitmap.eraseColor(0);
                int[] iArrB = wtl.b(iB, iA, str);
                if (iArrB != null) {
                    bitmap.setPixels(iArrB, 0, iB, 0, 0, iB, iA);
                }
                CloseableStaticBitmap closeableStaticBitmapOf = CloseableStaticBitmap.of(au3VarC, i1eVar, 0);
                au3VarC.close();
                return closeableStaticBitmapOf;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    rx8.n(au3VarC, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                rx8.n(g95VarA, th3);
                throw th4;
            }
        }
    }
}
