package defpackage;

import android.net.Uri;
import one.me.mediaeditor.editandreply.EditAndReplyScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fy5 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ EditAndReplyScreen b;

    public /* synthetic */ fy5(EditAndReplyScreen editAndReplyScreen, int i) {
        this.a = i;
        this.b = editAndReplyScreen;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        EditAndReplyScreen editAndReplyScreen = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = EditAndReplyScreen.w;
                iz5 iz5VarT1 = editAndReplyScreen.t1();
                zv8[] zv8VarArr2 = iz5.B;
                iz5VarT1.J(null);
                return sbi.a;
            case 1:
                jz5 jz5Var = (jz5) editAndReplyScreen.e.getAccessor().c(1091);
                vv vvVar = editAndReplyScreen.a;
                zv8[] zv8VarArr3 = EditAndReplyScreen.w;
                zv8 zv8Var = zv8VarArr3[0];
                long jLongValue = ((Number) vvVar.a(editAndReplyScreen)).longValue();
                vv vvVar2 = editAndReplyScreen.b;
                zv8 zv8Var2 = zv8VarArr3[1];
                long jLongValue2 = ((Number) vvVar2.a(editAndReplyScreen)).longValue();
                vv vvVar3 = editAndReplyScreen.c;
                zv8 zv8Var3 = zv8VarArr3[2];
                dy5 dy5Var = new dy5(jLongValue, jLongValue2, (Uri) vvVar3.a(editAndReplyScreen));
                Uri uri = editAndReplyScreen.f;
                boolean z = editAndReplyScreen.g;
                jz5Var.getClass();
                return new iz5(dy5Var, uri, z, jz5Var.a, jz5Var.b, jz5Var.c, jz5Var.d, jz5Var.e, jz5Var.f, jz5Var.g, jz5Var.h, jz5Var.i, jz5Var.j, jz5Var.k);
            case 2:
                return ((fz9) editAndReplyScreen.e.getAccessor().c(354)).a(null);
            case 3:
                return editAndReplyScreen.v;
            case 4:
                zv8[] zv8VarArr4 = EditAndReplyScreen.w;
                editAndReplyScreen.t1().J(yka.d);
                editAndReplyScreen.r1().setLeftIcon(R.drawable.icon_sticker);
                editAndReplyScreen.o1(editAndReplyScreen.p1());
                return sbi.a;
            default:
                zv8[] zv8VarArr5 = EditAndReplyScreen.w;
                iz5 iz5VarT2 = editAndReplyScreen.t1();
                je9 je9Var = je9.d;
                String str = iz5VarT2.d;
                a4c a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "onSendLongClick", null);
                }
                Object value = iz5VarT2.v.getValue();
                yy5 yy5Var = value instanceof yy5 ? (yy5) value : null;
                if (yy5Var == null) {
                    String str2 = iz5VarT2.d;
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 != null) {
                        je9 je9Var2 = je9.f;
                        if (a4cVar2.b(je9Var2)) {
                            a4cVar2.c(je9Var2, str2, "onSendLongClick: called with no State.ResultPreview", null);
                        }
                    }
                } else if (yy5Var.b) {
                    String str3 = iz5VarT2.d;
                    a4c a4cVar3 = gm0.f;
                    if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                        a4cVar3.c(je9Var, str3, "onSendLongClick: is already sending", null);
                    }
                } else {
                    iz5VarT2.r.B(iz5VarT2, iz5.B[2], a8j.t(iz5VarT2, null, new gz5(iz5VarT2, null, 2), 1));
                }
                return sbi.a;
        }
    }
}
