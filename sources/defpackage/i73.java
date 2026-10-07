package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.collections.a;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class i73 implements yx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yx6 b;
    public final /* synthetic */ l73 c;

    public /* synthetic */ i73(yx6 yx6Var, l73 l73Var, int i) {
        this.a = i;
        this.b = yx6Var;
        this.c = l73Var;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00be  */
    /* JADX WARN: Code duplicated, block: B:9:0x002a  */
    @Override // defpackage.yx6
    public final Object emit(Object obj, lq4 lq4Var) {
        h73 h73Var;
        c79 c79VarJ;
        k73 k73Var;
        int i;
        ynh xnhVar;
        int i2 = this.a;
        sbi sbiVar = sbi.a;
        yx6 yx6Var = this.b;
        hu4 hu4Var = hu4.a;
        l73 l73Var = this.c;
        switch (i2) {
            case 0:
                if (lq4Var instanceof h73) {
                    h73Var = (h73) lq4Var;
                    int i3 = h73Var.e;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        h73Var.e = i3 - Integer.MIN_VALUE;
                    } else {
                        h73Var = new h73(this, lq4Var);
                    }
                } else {
                    h73Var = new h73(this, lq4Var);
                }
                Object obj2 = h73Var.d;
                int i4 = h73Var.e;
                if (i4 == 0) {
                    ch3.d0(obj2);
                    rt2 rt2Var = (rt2) obj;
                    Integer numValueOf = Integer.valueOf(R.drawable.icon_link);
                    Integer numValueOf2 = Integer.valueOf(R.drawable.icon_user_add);
                    int iD = qt4.D(l73Var.o);
                    int i5 = R.id.profile_members_list_invite_by_link_action;
                    if (iD == 0) {
                        boolean zI = rt2Var.I();
                        c79 c79VarW = yab.w();
                        if (zI) {
                            c79VarW.add(new e8a(R.id.profile_members_list_add_to_channel_action, new tnh(R.string.profile_members_list_add_to_channel_action), numValueOf2));
                        }
                        if (l73.E(rt2Var)) {
                            c79VarW.add(new e8a(i5, new tnh(R.string.profile_members_list_invite_by_link_action), numValueOf));
                        }
                        c79VarJ = yab.j(c79VarW);
                    } else if (iD == 1) {
                        boolean zI2 = rt2Var.I();
                        c79 c79VarW2 = yab.w();
                        if (zI2) {
                            c79VarW2.add(new e8a(R.id.profile_members_list_add_to_chat_action, new tnh(R.string.profile_members_list_add_to_chat_action), numValueOf2));
                        }
                        if (l73.E(rt2Var)) {
                            c79VarW2.add(new e8a(i5, new tnh(R.string.profile_members_list_invite_by_link_action), numValueOf));
                        }
                        c79VarJ = yab.j(c79VarW2);
                    } else {
                        ore.o();
                    }
                    nx2 nx2Var = rt2Var.b;
                    boolean z = l73Var.d;
                    List listSingletonList = r66.a;
                    if (z && nx2Var.b() > 10) {
                        listSingletonList = Collections.singletonList(new e8a(R.id.profile_open_all_chat_members_action, new tnh(R.string.profile_section_item_action_button_all_members), osf.b, Integer.valueOf(R.drawable.icon_users), new isf(new xnh(String.valueOf(nx2Var.b())), null)));
                    }
                    i8a i8aVar = new i8a(c79VarJ, listSingletonList);
                    h73Var.e = 1;
                    return yx6Var.emit(i8aVar, h73Var) == hu4Var ? hu4Var : sbiVar;
                }
                if (i4 == 1) {
                    ch3.d0(obj2);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                int i6 = l73Var.o;
                if (lq4Var instanceof k73) {
                    k73Var = (k73) lq4Var;
                    int i7 = k73Var.e;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        k73Var.e = i7 - Integer.MIN_VALUE;
                    } else {
                        k73Var = new k73(this, lq4Var);
                    }
                } else {
                    k73Var = new k73(this, lq4Var);
                }
                Object obj3 = k73Var.d;
                int i8 = k73Var.e;
                if (i8 == 0) {
                    ch3.d0(obj3);
                    rt2 rt2Var2 = (rt2) obj;
                    int iD2 = qt4.D(i6);
                    if (iD2 == 0) {
                        i = R.string.profile_channel_members_list_toolbar_title;
                    } else if (iD2 == 1) {
                        i = R.string.profile_chat_members_list_toolbar_title;
                    } else {
                        ore.o();
                    }
                    int iB = rt2Var2.b.b();
                    int iD3 = qt4.D(i6);
                    if (iD3 == 0) {
                        xnhVar = new xnh(rt2Var2.E());
                    } else if (iD3 == 1) {
                        xnhVar = new rnh(R.plurals.profile_chat_members_list_toolbar_subtitle, iB, a.n1(new Object[]{new Integer(iB)}));
                    } else {
                        ore.o();
                    }
                    u63 u63Var = new u63(i, xnhVar, rt2Var2.z0() && rt2Var2.I() && iB > 1);
                    k73Var.e = 1;
                    return yx6Var.emit(u63Var, k73Var) == hu4Var ? hu4Var : sbiVar;
                }
                if (i8 == 1) {
                    ch3.d0(obj3);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
