package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w03 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ w03(long j, icg icgVar, jcg jcgVar) {
        this.a = 3;
        this.b = j;
        this.c = icgVar;
        this.d = jcgVar;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00e2  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        Object layerDrawable;
        jcg jcgVar;
        int i = this.a;
        boolean z = false;
        long j = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                e13 e13Var = (e13) obj3;
                ny8 ny8Var = e13Var.h;
                fda fdaVar = (fda) obj2;
                e70 e70Var = (e70) obj;
                Context context = e13Var.b;
                float fK = gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
                eve eveVar = new eve();
                eveVar.c = new float[8];
                Arrays.fill(eveVar.c, fK);
                y60 y60Var = e70Var.a;
                int i2 = y60Var == null ? -1 : b13.$EnumSwitchMapping$0[y60Var.ordinal()];
                q78 q78Var = null;
                vki vkiVar = null;
                if (i2 == 1) {
                    byte b = e70Var.d.b == 2;
                    Uri uriA = ((t75) ny8Var.getValue()).a(e70Var);
                    vki vkiVar2 = uriA != null ? new vki(context, ((t75) ny8Var.getValue()).b(e70Var, cqk.B(e70Var, fdaVar)), uriA.toString()) : null;
                    if (b != false) {
                        eveVar = eve.a();
                    }
                    if (vkiVar2 != null) {
                        vkiVar2.h(eveVar);
                    }
                    layerDrawable = new LayerDrawable(new Drawable[]{vkiVar2, new InsetDrawable((Drawable) e13Var.y.getValue(), 0.2f)});
                } else {
                    if (i2 != 2) {
                        Uri uriA2 = ((t75) ny8Var.getValue()).a(e70Var);
                        if (uriA2 != null) {
                            o60 o60Var = e70Var.b;
                            if (o60Var != null) {
                                q78Var = new q78(this.b, fdaVar.a.b, o60Var.i);
                            }
                            vkiVar = new vki(context, uriA2.toString(), ((t75) ny8Var.getValue()).b(e70Var, cqk.B(e70Var, fdaVar)), q78Var);
                        }
                        if (vkiVar == null) {
                            return vkiVar;
                        }
                        vkiVar.h(eveVar);
                        return vkiVar;
                    }
                    w60 w60VarW = fdaVar.a.w();
                    String strF = w60VarW != null ? w60VarW.f() : null;
                    if (strF == null) {
                        ore.p("Required value was null.");
                        return null;
                    }
                    layerDrawable = new vki(context, strF);
                }
                return layerDrawable;
            case 1:
                ConcurrentHashMap concurrentHashMap = ((jk3) obj2).o;
                Long l = (Long) obj;
                if (((m8b) obj3).d(l.longValue())) {
                    Long l2 = (Long) concurrentHashMap.get(l);
                    if (l2 != null) {
                        if (l2.longValue() <= j) {
                            concurrentHashMap.remove(l, l2);
                        } else {
                            z = true;
                        }
                    }
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                tvb tvbVar = new tvb((Context) obj, awb.a);
                tvbVar.c((CharSequence) obj2, Long.valueOf(j), (String) obj3);
                return new sk0(tvbVar);
            default:
                icg icgVar = (icg) obj3;
                jcg jcgVar2 = (jcg) obj2;
                vxe vxeVarO0 = ((qxe) obj).O0("\n        SELECT *\n        FROM perf_snapshots\n        WHERE id > ? AND type = ?\n        ORDER BY id ASC\n        LIMIT ?\n        ");
                try {
                    vxeVarO0.c(1, j);
                    icgVar.d.getClass();
                    vxeVarO0.c(2, jcgVar2.a);
                    vxeVarO0.c(3, 100L);
                    int iE = qyj.E(vxeVarO0, "id");
                    int iE2 = qyj.E(vxeVarO0, "sliceTime");
                    int iE3 = qyj.E(vxeVarO0, ApiProtocol.PARAM_PAYLOAD);
                    int iE4 = qyj.E(vxeVarO0, "type");
                    ArrayList arrayList = new ArrayList();
                    while (vxeVarO0.M0()) {
                        long j2 = vxeVarO0.getLong(iE);
                        long j3 = vxeVarO0.getLong(iE2);
                        byte[] blob = vxeVarO0.getBlob(iE3);
                        int i3 = (int) vxeVarO0.getLong(iE4);
                        icgVar.d.getClass();
                        Iterator it = jcg.e.iterator();
                        do {
                            if (!it.hasNext()) {
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                            jcgVar = (jcg) it.next();
                        } while (jcgVar.a != i3);
                        arrayList.add(new kcg(j2, j3, blob, jcgVar));
                    }
                    return arrayList;
                } finally {
                    vxeVarO0.close();
                }
        }
    }

    public /* synthetic */ w03(long j, CharSequence charSequence, String str) {
        this.a = 2;
        this.c = str;
        this.b = j;
        this.d = charSequence;
    }

    public /* synthetic */ w03(Object obj, Object obj2, long j, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = j;
    }
}
