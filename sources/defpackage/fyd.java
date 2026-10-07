package defpackage;

import android.view.View;
import java.util.List;
import one.me.stories.publish.PublishStoryBottomSheet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class fyd implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ PublishStoryBottomSheet b;

    public fyd(PublishStoryBottomSheet publishStoryBottomSheet) {
        this.b = publishStoryBottomSheet;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object poeVar;
        Long l;
        fvi fviVar;
        byte b = 0;
        switch (this.a) {
            case 0:
                PublishStoryBottomSheet publishStoryBottomSheet = this.b;
                zv8[] zv8VarArr = PublishStoryBottomSheet.t;
                boolean zF1 = publishStoryBottomSheet.F1();
                PublishStoryBottomSheet publishStoryBottomSheet2 = this.b;
                if (zF1) {
                    nyd nydVarE1 = publishStoryBottomSheet2.E1();
                    sgg sggVar = nydVarE1.q;
                    if (sggVar == null || !sggVar.isActive()) {
                        nydVarE1.q = a8j.t(nydVarE1, ((n0c) ((xhh) nydVarE1.l.getValue())).a(), new l0d((Object) nydVarE1, (lq4) (b == true ? 1 : 0), 26), 2);
                    }
                } else {
                    try {
                        poeVar = (p26) publishStoryBottomSheet2.o.getValue();
                    } catch (Throwable th) {
                        poeVar = new poe(th);
                    }
                    PublishStoryBottomSheet publishStoryBottomSheet3 = this.b;
                    Throwable thA = roe.a(poeVar);
                    if (thA != null) {
                        String str = publishStoryBottomSheet3.n;
                        b0b b0bVar = new b0b(thA);
                        a4c a4cVar = gm0.f;
                        if (a4cVar != null) {
                            je9 je9Var = je9.f;
                            if (a4cVar.b(je9Var)) {
                                a4cVar.c(je9Var, str, "publish: no editor view model", b0bVar);
                            }
                        }
                    }
                    if (poeVar instanceof poe) {
                        poeVar = null;
                    }
                    p26 p26Var = (p26) poeVar;
                    if (p26Var != null) {
                        a8j.x(p26Var.F1, t06.a);
                        nyd nydVarE2 = this.b.E1();
                        List list = (List) p26Var.i.e.a.getValue();
                        oyg oygVar = p26Var.s;
                        int i = oygVar.c;
                        int i2 = oygVar.d;
                        Object value = p26Var.X.a.getValue();
                        e16 e16Var = value instanceof e16 ? (e16) value : null;
                        boolean z = (e16Var == null || (fviVar = e16Var.b) == null) ? false : fviVar.e;
                        long jA = qx6.a(((Number) p26Var.x1.a.getValue()).floatValue(), ((Number) p26Var.z1.a.getValue()).floatValue());
                        Object value2 = p26Var.X.a.getValue();
                        e16 e16Var2 = value2 instanceof e16 ? (e16) value2 : null;
                        boolean z2 = (e16Var2 != null ? e16Var2.a.l : null) == jb9.d;
                        Object value3 = p26Var.X.a.getValue();
                        e16 e16Var3 = value3 instanceof e16 ? (e16) value3 : null;
                        long jLongValue = (e16Var3 == null || (l = e16Var3.a.g) == null) ? 0L : l.longValue();
                        boolean zBooleanValue = ((Boolean) p26Var.G.a.getValue()).booleanValue();
                        String str2 = (String) p26Var.N().h.a.getValue();
                        i6a i6aVarC = csk.c((o6a) p26Var.u.a.getValue());
                        sgg sggVar2 = nydVarE2.q;
                        if (sggVar2 == null || !sggVar2.isActive()) {
                            nydVarE2.q = a8j.t(nydVarE2, ((n0c) ((xhh) nydVarE2.l.getValue())).a(), new jyd(nydVarE2, zBooleanValue, str2, list, i, i2, z2, i6aVarC, jLongValue, jA, z, null), 2);
                        }
                        break;
                    }
                }
                break;
            default:
                PublishStoryBottomSheet publishStoryBottomSheet4 = this.b;
                zv8[] zv8VarArr2 = PublishStoryBottomSheet.t;
                nyd nydVarE3 = publishStoryBottomSheet4.E1();
                ic6 ic6Var = nydVarE3.h;
                c79 c79VarW = yab.w();
                int[] iArr = nydVarE3.r;
                int length = iArr.length;
                for (int i3 = 0; i3 < length; i3++) {
                    int i4 = iArr[i3];
                    Integer numValueOf = i4 == ((Number) nydVarE3.s.getValue()).intValue() ? Integer.valueOf(R.drawable.icon_check) : null;
                    ghb ghbVar = ew5.b;
                    lw5 lw5Var = lw5.HOURS;
                    c79VarW.add(new rp4(i4, new pnh(R.plurals.dates_hours, (int) ew5.s(qe7.O(i4, lw5Var), lw5Var)), numValueOf, (Integer) null, 20));
                }
                a8j.x(ic6Var, new byd(yab.j(c79VarW)));
                break;
        }
    }

    public fyd(PublishStoryBottomSheet publishStoryBottomSheet, cyb cybVar) {
        this.b = publishStoryBottomSheet;
    }
}
