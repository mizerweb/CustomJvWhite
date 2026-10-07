package defpackage;

import one.me.chats.forward.ForwardPickerScreen;
import one.me.devmenu.DevMenuFeatureTogglesPageScreen;
import one.me.inviteactions.invitebyqr.InviteByQrBottomSheet;
import one.me.messages.list.ui.MessagesListWidget;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes2.dex */
public final class o24 implements xx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o24(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.xx6
    public final Object collect(yx6 yx6Var, lq4 lq4Var) throws Throwable {
        int i = this.a;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Object objCollect = ((xx6) obj2).collect(new he(yx6Var, 23, (q24) obj), lq4Var);
                return objCollect == hu4Var ? objCollect : sbiVar;
            case 1:
                Object objCollect2 = ((bye) obj2).collect(new sh4(yx6Var, (xh4) obj, 0), lq4Var);
                return objCollect2 == hu4Var ? objCollect2 : sbiVar;
            case 2:
                Object objCollect3 = ((xx6) obj2).collect(new sh4(yx6Var, (xh4) obj, 1), lq4Var);
                return objCollect3 == hu4Var ? objCollect3 : sbiVar;
            case 3:
                Object objCollect4 = ((bye) obj2).collect(new he(yx6Var, 25, (vi4) obj), lq4Var);
                return objCollect4 == hu4Var ? objCollect4 : sbiVar;
            case 4:
                Object objCollect5 = ((nr2) obj2).collect(new he(yx6Var, 26, (DevMenuFeatureTogglesPageScreen) obj), lq4Var);
                return objCollect5 == hu4Var ? objCollect5 : sbiVar;
            case 5:
                ((mjg) obj2).collect(new he(yx6Var, 27, (p26) obj), lq4Var);
                return hu4Var;
            case 6:
                Object objCollect6 = ((xx6) obj2).collect(new he(yx6Var, 28, (qf7) obj), lq4Var);
                return objCollect6 == hu4Var ? objCollect6 : sbiVar;
            case 7:
                Object objCollect7 = ((xx6) obj2).collect(new l07(yx6Var, (ForwardPickerScreen) obj, 2), lq4Var);
                return objCollect7 == hu4Var ? objCollect7 : sbiVar;
            case 8:
                ((mjg) obj2).collect(new wi7(yx6Var, (ej7) obj, 2), lq4Var);
                return hu4Var;
            case 9:
                Object objCollect8 = ((jz) obj2).collect(new l07(yx6Var, (InviteByQrBottomSheet) obj, 4), lq4Var);
                return objCollect8 == hu4Var ? objCollect8 : sbiVar;
            case 10:
                Object objCollect9 = ((xx6) obj2).collect(new eh8(yx6Var, (sr8) obj), lq4Var);
                return objCollect9 == hu4Var ? objCollect9 : sbiVar;
            case 11:
                Object objCollect10 = ((xx6) obj2).collect(new u49(yx6Var, (String) obj, 0), lq4Var);
                return objCollect10 == hu4Var ? objCollect10 : sbiVar;
            case 12:
                Object objCollect11 = ((r07) obj2).collect(new l07(yx6Var, (as9) obj, 6), lq4Var);
                return objCollect11 == hu4Var ? objCollect11 : sbiVar;
            case 13:
                Object objCollect12 = ((nr2) obj2).collect(new l07(yx6Var, (lx9) obj, 7), lq4Var);
                return objCollect12 == hu4Var ? objCollect12 : sbiVar;
            case 14:
                Object objCollect13 = ((r07) obj2).collect(new l07(yx6Var, (q1a) obj, 8), lq4Var);
                return objCollect13 == hu4Var ? objCollect13 : sbiVar;
            case 15:
                Object objCollect14 = ((r8e) obj2).a.collect(new l07(yx6Var, (b2a) obj, 9), lq4Var);
                return objCollect14 == hu4Var ? objCollect14 : sbiVar;
            case 16:
                ((mjg) obj2).collect(new l07(yx6Var, (k7a) obj, 10), lq4Var);
                return hu4Var;
            case 17:
                Object objCollect15 = ((xx6) obj2).collect(new l07(yx6Var, (v9a) obj, 11), lq4Var);
                return objCollect15 == hu4Var ? objCollect15 : sbiVar;
            case 18:
                Object objCollect16 = ((jz) obj2).collect(new gma(yx6Var, (nma) obj, 4), lq4Var);
                return objCollect16 == hu4Var ? objCollect16 : sbiVar;
            case 19:
                Object objCollect17 = ((jz) obj2).collect(new l07(yx6Var, (jsa) obj, 12), lq4Var);
                return objCollect17 == hu4Var ? objCollect17 : sbiVar;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                Object objCollect18 = ((jz) obj2).collect(new l07(yx6Var, (MessagesListWidget) obj, 13), lq4Var);
                return objCollect18 == hu4Var ? objCollect18 : sbiVar;
            case 21:
                Object objCollect19 = ((r8e) obj2).a.collect(new l07(yx6Var, (kua) obj, 14), lq4Var);
                return objCollect19 == hu4Var ? objCollect19 : sbiVar;
            case 22:
                Object objCollect20 = ((xx6) obj2).collect(new l07(yx6Var, (String[]) obj, 15), lq4Var);
                return objCollect20 == hu4Var ? objCollect20 : sbiVar;
            case 23:
                xx6[] xx6VarArr = (xx6[]) obj2;
                Object objN = n1g.n(lq4Var, yx6Var, new j7(xx6VarArr, 8), new rgi((lq4) null, (kob) obj, 9), xx6VarArr);
                return objN == hu4Var ? objN : sbiVar;
            case 24:
                Object objCollect21 = ((xx6) obj2).collect(new gnc(yx6Var, (pnc) obj, 1), lq4Var);
                return objCollect21 == hu4Var ? objCollect21 : sbiVar;
            case 25:
                Object objCollect22 = ((xx6) obj2).collect(new zxc(yx6Var, (dyc) obj, 0), lq4Var);
                return objCollect22 == hu4Var ? objCollect22 : sbiVar;
            case 26:
                Object objCollect23 = ((j3) obj2).collect(new zxc(yx6Var, (dyc) obj, 1), lq4Var);
                return objCollect23 == hu4Var ? objCollect23 : sbiVar;
            case 27:
                Object objCollect24 = ((o24) obj2).collect(new zxc(yx6Var, (dyc) obj, 2), lq4Var);
                return objCollect24 == hu4Var ? objCollect24 : sbiVar;
            case 28:
                Object objCollect25 = ((xx6) obj2).collect(new l07(yx6Var, (vyc) obj, 17), lq4Var);
                return objCollect25 == hu4Var ? objCollect25 : sbiVar;
            default:
                Object objCollect26 = ((xx6) obj2).collect(new l07(yx6Var, (czc) obj, 18), lq4Var);
                return objCollect26 == hu4Var ? objCollect26 : sbiVar;
        }
    }
}
