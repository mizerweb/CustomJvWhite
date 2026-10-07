package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class cx8 extends FrameLayout implements eph {
    public static final /* synthetic */ zv8[] d;
    public final TextView a;
    public final zb b;
    public kbc c;

    static {
        z8b z8bVar = new z8b(cx8.class, "tabItem", "getTabItem()Lone/me/common/tablayout/model/OneMeBaseTabItemModel;");
        zfe.a.getClass();
        d = new zv8[]{z8bVar};
    }

    public cx8(Context context) {
        super(context, null);
        TextView textViewE = qv1.e(context, R.id.oneme_tab_item_textview_id);
        q9i.a(q9i.i, textViewE);
        textViewE.setGravity(17);
        textViewE.setEllipsize(TextUtils.TruncateAt.END);
        textViewE.setLetterSpacing(0.0f);
        textViewE.setSingleLine(true);
        this.a = textViewE;
        this.b = new zb((owb) owb.h.getValue(), 17, this);
        b(getTabItem().c, getCurrentTheme());
        setLayoutParams(new ViewGroup.LayoutParams(gm0.K(72.0f * yl5.d().getDisplayMetrics().density), -2));
        setClipToPadding(false);
        addView(textViewE);
    }

    public static final void a(cx8 cx8Var) {
        cx8Var.setText(cx8Var.getTabItem().b);
        cx8Var.a.setTextColor(b(cx8Var.getTabItem().c, cx8Var.getCurrentTheme()).a);
        cx8Var.requestLayout();
        cx8Var.invalidate();
    }

    public static bx8 b(int i, kbc kbcVar) {
        int iD = qt4.D(i);
        if (iD == 0) {
            return new bx8(kbcVar.getText().b);
        }
        if (iD == 1) {
            return new bx8(kbcVar.getText().d);
        }
        if (iD == 2) {
            return new bx8(((fn8) kbcVar.u().d.b).d);
        }
        ore.o();
        return null;
    }

    private final kbc getCurrentTheme() {
        kbc kbcVar = this.c;
        return kbcVar == null ? pq3.j.h(this) : kbcVar;
    }

    private final void setText(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public final kbc getCustomTheme() {
        return this.c;
    }

    public final owb getTabItem() {
        zv8 zv8Var = d[0];
        return (owb) this.b.b;
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        kbc kbcVar2 = this.c;
        if (kbcVar2 != null) {
            kbcVar = kbcVar2;
        }
        this.a.setTextColor(b(getTabItem().c, kbcVar).a);
        pq3.j.e(getContext()).getClass();
        pq3.f(this, kbcVar);
    }

    public final void setCustomTheme(kbc kbcVar) {
        this.c = kbcVar;
        if (kbcVar != null) {
            onThemeChanged(kbcVar);
        }
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        if (z != isSelected()) {
            setTabItem(owb.a(getTabItem(), null, z ? 1 : 2, null, null, null, 123));
        }
        super.setSelected(z);
    }

    public final void setTabItem(owb owbVar) {
        this.b.B(this, d[0], owbVar);
    }
}
