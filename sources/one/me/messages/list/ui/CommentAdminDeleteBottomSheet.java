package one.me.messages.list.ui;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.ayb;
import defpackage.bc1;
import defpackage.cyb;
import defpackage.dwd;
import defpackage.f7;
import defpackage.gm0;
import defpackage.jsa;
import defpackage.n1g;
import defpackage.np4;
import defpackage.ny8;
import defpackage.q9i;
import defpackage.qe7;
import defpackage.s63;
import defpackage.t3f;
import defpackage.tnh;
import defpackage.vv;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zo3;
import defpackage.zo5;
import defpackage.zv8;
import defpackage.zxb;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.a;
import one.me.messages.list.ui.CommentAdminDeleteBottomSheet;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B)\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0004\u0010\u000e¨\u0006\u000f"}, d2 = {"Lone/me/messages/list/ui/CommentAdminDeleteBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lt3f;", "scopeId", "", "messageCount", "", "authorUserId", "", "messageIds", "(Lt3f;IJ[J)V", "message-list"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CommentAdminDeleteBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ zv8[] C = {new dwd(CommentAdminDeleteBottomSheet.class, "parentScopeId", "getParentScopeId()Lone/me/sdk/arch/store/ScopeId;", 0), zo5.f(zfe.a, CommentAdminDeleteBottomSheet.class, "messageCount", "getMessageCount()I", 0), new dwd(CommentAdminDeleteBottomSheet.class, "authorUserId", "getAuthorUserId()J", 0), new dwd(CommentAdminDeleteBottomSheet.class, "messageIds", "getMessageIds()[J", 0)};
    public zo3 A;
    public final s63 B;
    public final vv u;
    public final vv v;
    public final vv w;
    public final ny8 x;
    public cyb y;
    public zo3 z;

    public CommentAdminDeleteBottomSheet(Bundle bundle) {
        super(bundle);
        vv vvVar = new vv("scope_id", t3f.class);
        this.u = new vv("message_count", Integer.class);
        this.v = new vv("author_user_id", Long.class);
        this.w = new vv("message_ids", long[].class);
        zv8 zv8Var = C[0];
        this.x = getSharedViewModel((t3f) vvVar.a(this), jsa.class, null);
        this.B = new s63(4, this);
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View D1(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        final int i = 1;
        LinearLayout linearLayoutJ = bc1.j(layoutInflater.getContext(), new ViewGroup.LayoutParams(-1, -1), 1);
        linearLayoutJ.setPadding(linearLayoutJ.getPaddingLeft(), gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), linearLayoutJ.getPaddingRight(), linearLayoutJ.getPaddingBottom());
        TextView textView = new TextView(linearLayoutJ.getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
        textView.setLayoutParams(layoutParams);
        q9i.a(q9i.b, textView);
        textView.setTextAlignment(4);
        textView.setGravity(17);
        Resources resources = textView.getResources();
        zv8[] zv8VarArr = C;
        zv8 zv8Var = zv8VarArr[1];
        vv vvVar = this.u;
        int iIntValue = ((Number) vvVar.a(this)).intValue();
        zv8 zv8Var2 = zv8VarArr[1];
        textView.setText(resources.getQuantityString(R.plurals.chat_screen_confirmation_delete_comment_title, iIntValue, Integer.valueOf(((Number) vvVar.a(this)).intValue())));
        n1g.N(new f7(3, null, 10), textView);
        linearLayoutJ.addView(textView);
        zo3 zo3Var = new zo3(linearLayoutJ.getContext());
        zo3Var.setText(new tnh(R.string.chat_screen_admin_delete_comment_option_delete_all));
        final int i2 = 0;
        zo3Var.setChecked(false);
        s63 s63Var = this.B;
        zo3Var.setCheckBoxListener(s63Var);
        linearLayoutJ.addView(zo3Var);
        this.z = zo3Var;
        zo3 zo3Var2 = new zo3(linearLayoutJ.getContext());
        zo3Var2.setText(new tnh(R.string.chat_screen_admin_delete_comment_option_block_user));
        zo3Var2.setChecked(false);
        zo3Var2.setCheckBoxListener(s63Var);
        linearLayoutJ.addView(zo3Var2);
        this.A = zo3Var2;
        cyb cybVar = new cyb(linearLayoutJ.getContext());
        this.y = cybVar;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.bottomMargin = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        layoutParams2.leftMargin = gm0.K(yl5.d().getDisplayMetrics().density * 8.0f);
        layoutParams2.rightMargin = gm0.K(yl5.d().getDisplayMetrics().density * 8.0f);
        layoutParams2.topMargin = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
        cybVar.setLayoutParams(layoutParams2);
        ayb aybVar = ayb.g;
        cybVar.setSize(aybVar);
        cybVar.setAppearance(zxb.PRIMARY);
        F1();
        qe7.H(cybVar, 300L, new View.OnClickListener(this) { // from class: iy3
            public final /* synthetic */ CommentAdminDeleteBottomSheet b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                CommentAdminDeleteBottomSheet commentAdminDeleteBottomSheet = this.b;
                switch (i3) {
                    case 0:
                        zv8[] zv8VarArr2 = CommentAdminDeleteBottomSheet.C;
                        commentAdminDeleteBottomSheet.v1(true);
                        break;
                    default:
                        jsa jsaVar = (jsa) commentAdminDeleteBottomSheet.x.getValue();
                        vv vvVar2 = commentAdminDeleteBottomSheet.w;
                        zv8[] zv8VarArr3 = CommentAdminDeleteBottomSheet.C;
                        zv8 zv8Var3 = zv8VarArr3[3];
                        List listM1 = a.m1((long[]) vvVar2.a(commentAdminDeleteBottomSheet));
                        vv vvVar3 = commentAdminDeleteBottomSheet.v;
                        zv8 zv8Var4 = zv8VarArr3[2];
                        long jLongValue = ((Number) vvVar3.a(commentAdminDeleteBottomSheet)).longValue();
                        zo3 zo3Var3 = commentAdminDeleteBottomSheet.z;
                        if (zo3Var3 == null) {
                            zo3Var3 = null;
                        }
                        boolean zIsChecked = zo3Var3.c.isChecked();
                        zo3 zo3Var4 = commentAdminDeleteBottomSheet.A;
                        a8j.t(jsaVar, ((n0c) jsaVar.j).b(), new tra(jsaVar, jLongValue, listM1, zIsChecked, (zo3Var4 != null ? zo3Var4 : null).c.isChecked(), null), 2);
                        commentAdminDeleteBottomSheet.v1(true);
                        break;
                }
            }
        });
        linearLayoutJ.addView(cybVar);
        cyb cybVar2 = new cyb(linearLayoutJ.getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.leftMargin = gm0.K(yl5.d().getDisplayMetrics().density * 8.0f);
        layoutParams3.rightMargin = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
        cybVar2.setLayoutParams(layoutParams3);
        cybVar2.setSize(aybVar);
        cybVar2.setAppearance(zxb.SECONDARY);
        cybVar2.setText(np4.q(getContext(), R.string.chat_screen_admin_delete_comment_cancel));
        qe7.H(cybVar2, 300L, new View.OnClickListener(this) { // from class: iy3
            public final /* synthetic */ CommentAdminDeleteBottomSheet b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                CommentAdminDeleteBottomSheet commentAdminDeleteBottomSheet = this.b;
                switch (i3) {
                    case 0:
                        zv8[] zv8VarArr2 = CommentAdminDeleteBottomSheet.C;
                        commentAdminDeleteBottomSheet.v1(true);
                        break;
                    default:
                        jsa jsaVar = (jsa) commentAdminDeleteBottomSheet.x.getValue();
                        vv vvVar2 = commentAdminDeleteBottomSheet.w;
                        zv8[] zv8VarArr3 = CommentAdminDeleteBottomSheet.C;
                        zv8 zv8Var3 = zv8VarArr3[3];
                        List listM1 = a.m1((long[]) vvVar2.a(commentAdminDeleteBottomSheet));
                        vv vvVar3 = commentAdminDeleteBottomSheet.v;
                        zv8 zv8Var4 = zv8VarArr3[2];
                        long jLongValue = ((Number) vvVar3.a(commentAdminDeleteBottomSheet)).longValue();
                        zo3 zo3Var3 = commentAdminDeleteBottomSheet.z;
                        if (zo3Var3 == null) {
                            zo3Var3 = null;
                        }
                        boolean zIsChecked = zo3Var3.c.isChecked();
                        zo3 zo3Var4 = commentAdminDeleteBottomSheet.A;
                        a8j.t(jsaVar, ((n0c) jsaVar.j).b(), new tra(jsaVar, jLongValue, listM1, zIsChecked, (zo3Var4 != null ? zo3Var4 : null).c.isChecked(), null), 2);
                        commentAdminDeleteBottomSheet.v1(true);
                        break;
                }
            }
        });
        linearLayoutJ.addView(cybVar2);
        return linearLayoutJ;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0023  */
    /* JADX WARN: Code duplicated, block: B:18:0x002c  */
    /* JADX WARN: Code duplicated, block: B:19:0x0030  */
    /* JADX WARN: Code duplicated, block: B:21:0x0034  */
    /* JADX WARN: Code duplicated, block: B:24:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0041  */
    public final void F1() {
        zo3 zo3Var;
        zo3 zo3Var2;
        int i;
        zo3 zo3Var3 = this.z;
        if (zo3Var3 == null) {
            zo3Var3 = null;
        }
        if (zo3Var3.c.isChecked()) {
            zo3 zo3Var4 = this.A;
            if (zo3Var4 == null) {
                zo3Var4 = null;
            }
            if (zo3Var4.c.isChecked()) {
                i = R.string.chat_screen_admin_delete_comment_confirm_delete_and_block;
            } else {
                zo3Var = this.z;
                if (zo3Var == null) {
                    zo3Var = null;
                }
                if (zo3Var.c.isChecked()) {
                    i = R.string.chat_screen_admin_delete_comment_confirm_delete_all;
                } else {
                    zo3Var2 = this.A;
                    if (zo3Var2 == null) {
                        zo3Var2 = null;
                    }
                    if (zo3Var2.c.isChecked()) {
                        i = R.string.chat_screen_admin_delete_comment_confirm_block;
                    } else {
                        i = R.string.chat_screen_admin_delete_comment_confirm_delete;
                    }
                }
            }
        } else {
            zo3Var = this.z;
            if (zo3Var == null) {
                zo3Var = null;
            }
            if (zo3Var.c.isChecked()) {
                i = R.string.chat_screen_admin_delete_comment_confirm_delete_all;
            } else {
                zo3Var2 = this.A;
                if (zo3Var2 == null) {
                    zo3Var2 = null;
                }
                if (zo3Var2.c.isChecked()) {
                    i = R.string.chat_screen_admin_delete_comment_confirm_block;
                } else {
                    i = R.string.chat_screen_admin_delete_comment_confirm_delete;
                }
            }
        }
        cyb cybVar = this.y;
        (cybVar != null ? cybVar : null).setText(np4.q(getContext(), i));
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget, one.me.sdk.bottomsheet.BaseBottomSheetWidget, defpackage.br4
    public final void onDestroyView(View view) {
        zo3 zo3Var = this.z;
        if (zo3Var == null) {
            zo3Var = null;
        }
        zo3Var.setCheckBoxListener(null);
        zo3 zo3Var2 = this.A;
        if (zo3Var2 == null) {
            zo3Var2 = null;
        }
        zo3Var2.setCheckBoxListener(null);
        super.onDestroyView(view);
    }

    public CommentAdminDeleteBottomSheet(t3f t3fVar, int i, long j, long[] jArr) {
        this(n1g.i(new ylc("scope_id", t3fVar), new ylc("message_count", Integer.valueOf(i)), new ylc("author_user_id", Long.valueOf(j)), new ylc("message_ids", jArr)));
    }
}
