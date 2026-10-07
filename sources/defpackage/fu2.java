package defpackage;

import kotlin.collections.a;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class fu2 implements yx6 {
    public int a;
    public final /* synthetic */ yx6 b;
    public final /* synthetic */ gu2 c;
    public final /* synthetic */ long d;

    public fu2(yx6 yx6Var, gu2 gu2Var, long j) {
        this.c = gu2Var;
        this.d = j;
        this.b = yx6Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.yx6
    public final Object emit(Object obj, lq4 lq4Var) {
        eu2 eu2Var;
        vg4 vg4Var;
        String strK;
        if (lq4Var instanceof eu2) {
            eu2Var = (eu2) lq4Var;
            int i = eu2Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                eu2Var.e = i - Integer.MIN_VALUE;
            } else {
                eu2Var = new eu2(this, lq4Var);
            }
        } else {
            eu2Var = new eu2(this, lq4Var);
        }
        Object obj2 = eu2Var.d;
        int i2 = eu2Var.e;
        int i3 = 1;
        if (i2 == 0) {
            ch3.d0(obj2);
            int i4 = this.a;
            this.a = i4 + 1;
            if (i4 < 0) {
                throw new ArithmeticException("Index overflow has happened");
            }
            if (i4 == 0 && (vg4Var = (vg4) obj) != null && (strK = vg4Var.k()) != null) {
                int i5 = 56;
                a8j.x(this.c.m, new hrd(new vnh(R.string.profile_members_list_delete_from_admin_title, a.n1(new Object[]{strK})), null, xw3.P0(new kc4(R.id.profile_members_list_delete_from_admin_btn, new tnh(R.string.profile_members_list_delete_from_chat_btn), i3, i5), new kc4(R.id.profile_members_list_delete_from_admin_btn_cancel, new tnh(R.string.profile_members_list_delete_from_chat_cancel), 2, i5)), n1g.i(new ylc("profile:adminslist:ids_to_delete", new long[]{this.d}))));
            }
            eu2Var.e = 1;
            Object objEmit = this.b.emit(obj, eu2Var);
            hu4 hu4Var = hu4.a;
            if (objEmit == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj2);
        }
        return sbi.a;
    }
}
