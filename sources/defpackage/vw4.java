package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class vw4 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public vw4(File file, Bitmap bitmap, qdb qdbVar) {
        this.a = 2;
        this.c = file;
        this.d = bitmap;
        this.b = qdbVar;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                xw4 xw4Var = (xw4) obj;
                boolean zF = q3m.f(((Context) xw4Var.d.getValue()).getContentResolver(), Uri.fromFile(new File((String) obj2)));
                String str = zF ? "png" : "jpg";
                ju6 ju6Var = (ju6) xw4Var.b.getValue();
                ju6Var.getClass();
                File fileP = ju6Var.p(null, str);
                q3m.g(fileP.getAbsolutePath(), (Bitmap) obj3, ((g5d) xw4Var.b()).n(), zF ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG);
                return fileP;
            case 1:
                return q3m.b((String) obj2, (Rect) obj3, ((g5d) ((xw4) obj).b()).l());
            case 2:
                q3m.g(((File) obj).getAbsolutePath(), (Bitmap) obj3, ((g5d) ((gjf) ((qdb) obj2).d.getValue())).n(), Bitmap.CompressFormat.JPEG);
                return sbi.a;
            case 3:
                return q3m.b((String) obj2, (Rect) obj, ((g5d) ((gjf) ((qdb) obj3).d.getValue())).l());
            default:
                r5f r5fVar = (r5f) obj3;
                w5f w5fVar = (w5f) obj2;
                j5f j5fVar = (j5f) obj;
                if (j5fVar.getParent() != null) {
                    w5fVar.removeView(j5fVar);
                }
                if (r5fVar == r5f.a) {
                    w5fVar.addView(j5fVar, w5fVar.getChildCount());
                } else {
                    w5fVar.addView(j5fVar, 0);
                }
                w5f.a(r5fVar, w5fVar.h, w5fVar.i, new os1(j5fVar, w5fVar, r5fVar, 19));
                return Boolean.TRUE;
        }
    }

    public /* synthetic */ vw4(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
    }

    public vw4(String str, Rect rect, xw4 xw4Var) {
        this.a = 1;
        this.b = str;
        this.d = rect;
        this.c = xw4Var;
    }

    public vw4(String str, Rect rect, qdb qdbVar) {
        this.a = 3;
        this.b = str;
        this.c = rect;
        this.d = qdbVar;
    }
}
