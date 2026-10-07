package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.chats.search.views.ClearRecentSearchBottomSheet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class us3 extends LinearLayout implements eph {
    public final AppCompatTextView a;
    public final cyb b;
    public final cyb c;

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public us3(FrameLayout frameLayout, final ClearRecentSearchBottomSheet clearRecentSearchBottomSheet, Context context) {
        super(context);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        appCompatTextView.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
        appCompatTextView.setLayoutParams(layoutParams);
        appCompatTextView.setGravity(17);
        appCompatTextView.setText(appCompatTextView.getContext().getString(R.string.chats_list_search_clear_recent_dialog_title));
        q9i.c.b(appCompatTextView, bx5.b);
        appCompatTextView.setTextColor(pq3.j.h(appCompatTextView).getText().b);
        this.a = appCompatTextView;
        cyb cybVar = new cyb(getContext());
        cybVar.setId(View.generateViewId());
        cybVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        ayb aybVar = ayb.g;
        cybVar.setSize(aybVar);
        zxb zxbVar = zxb.GHOST;
        cybVar.setAppearance(zxbVar);
        cybVar.setTextColor(Integer.valueOf(R.attr.text_negative));
        cybVar.setText(np4.q(cybVar.getContext(), R.string.chats_list_search_clear_recent_dialog_confirm_text));
        final int i = 0;
        qe7.H(cybVar, 300L, new View.OnClickListener() { // from class: ts3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                ClearRecentSearchBottomSheet clearRecentSearchBottomSheet2 = clearRecentSearchBottomSheet;
                switch (i2) {
                    case 0:
                        clearRecentSearchBottomSheet2.v1(true);
                        br4 targetController = clearRecentSearchBottomSheet2.getTargetController();
                        lq4 lq4Var = null;
                        ChatsListSearchScreen chatsListSearchScreen = targetController instanceof ChatsListSearchScreen ? (ChatsListSearchScreen) targetController : null;
                        if (chatsListSearchScreen != null) {
                            fk3 fk3VarR1 = chatsListSearchScreen.r1();
                            sgg sggVar = fk3VarR1.r1;
                            if (sggVar == null || !sggVar.isActive()) {
                                fk3VarR1.r1 = yab.i0(fk3VarR1.b, fk3VarR1.n1, 0, new nj3(fk3VarR1, lq4Var, 0), 2);
                            }
                        }
                        break;
                    default:
                        clearRecentSearchBottomSheet2.v1(true);
                        break;
                }
            }
        });
        this.b = cybVar;
        cyb cybVar2 = new cyb(getContext());
        cybVar2.setId(View.generateViewId());
        cybVar2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        cybVar2.setSize(aybVar);
        cybVar2.setAppearance(zxbVar);
        cybVar2.setTextColor(Integer.valueOf(R.attr.text_themed));
        cybVar2.setText(np4.q(cybVar2.getContext(), R.string.cancel));
        final int i2 = 1;
        qe7.H(cybVar2, 300L, new View.OnClickListener() { // from class: ts3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                ClearRecentSearchBottomSheet clearRecentSearchBottomSheet2 = clearRecentSearchBottomSheet;
                switch (i3) {
                    case 0:
                        clearRecentSearchBottomSheet2.v1(true);
                        br4 targetController = clearRecentSearchBottomSheet2.getTargetController();
                        lq4 lq4Var = null;
                        ChatsListSearchScreen chatsListSearchScreen = targetController instanceof ChatsListSearchScreen ? (ChatsListSearchScreen) targetController : null;
                        if (chatsListSearchScreen != null) {
                            fk3 fk3VarR1 = chatsListSearchScreen.r1();
                            sgg sggVar = fk3VarR1.r1;
                            if (sggVar == null || !sggVar.isActive()) {
                                fk3VarR1.r1 = yab.i0(fk3VarR1.b, fk3VarR1.n1, 0, new nj3(fk3VarR1, lq4Var, 0), 2);
                            }
                        }
                        break;
                    default:
                        clearRecentSearchBottomSheet2.v1(true);
                        break;
                }
            }
        });
        this.c = cybVar2;
        setOrientation(1);
        addView(appCompatTextView);
        addView(cybVar);
        addView(cybVar2);
        frameLayout.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(26.0f * yl5.d().getDisplayMetrics().density), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), 0);
    }

    public final cyb getCancel() {
        return this.c;
    }

    public final cyb getConfirm() {
        return this.b;
    }

    public final AppCompatTextView getTitle() {
        return this.a;
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.a.setTextColor(kbcVar.getText().b);
        this.b.e();
        this.c.e();
    }
}
