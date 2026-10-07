package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class nda extends FrameLayout implements eph {
    public final /* synthetic */ int a = 0;
    public final TextView b;
    public final View c;

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
    public nda(occ occVar, Context context) {
        super(context);
        TextView textView = new TextView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388627;
        layoutParams.setMarginStart(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
        textView.setLayoutParams(layoutParams);
        textView.setText(context.getString(R.string.chats_list_search_recent_header));
        noh nohVar = q9i.i;
        nohVar.g().b(textView, bx5.b);
        a8g a8gVar = pq3.j;
        textView.setTextColor(a8gVar.h(textView).getText().e);
        this.b = textView;
        TextView textView2 = new TextView(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 8388629;
        layoutParams2.setMarginEnd(gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
        textView2.setLayoutParams(layoutParams2);
        textView2.setText(context.getString(R.string.chats_list_search_recent_header_clear));
        nohVar.b(textView2, bx5.b);
        textView2.setTextColor(a8gVar.h(textView2).getText().e);
        qe7.H(textView2, 300L, new gwc(14, occVar));
        this.c = textView2;
        setLayoutParams(new ViewGroup.LayoutParams(-1, gm0.K(40.0f * yl5.d().getDisplayMetrics().density)));
        addView(textView);
        addView(textView2);
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        int i = this.a;
        View view = this.c;
        TextView textView = this.b;
        switch (i) {
            case 0:
                setBackground(col.c(((fn8) kbcVar.u().c.b).c, new ColorDrawable(kbcVar.b().f), null, 4));
                ((ImageView) view).setImageTintList(ColorStateList.valueOf(oc9.Z(R.attr.icon_primary, kbcVar)));
                textView.setTextColor(kbcVar.getText().b);
                break;
            default:
                textView.setTextColor(kbcVar.getText().e);
                ((TextView) view).setTextColor(kbcVar.getText().e);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nda(ImageView imageView, TextView textView, Context context) {
        super(context);
        this.c = imageView;
        this.b = textView;
    }
}
