package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.Spanned;
import android.text.style.ImageSpan;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import one.me.sdk.uikit.common.span.FitFontImageSpan;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class z9c extends LinearLayout implements eph {
    public static final /* synthetic */ zv8[] l = {new z8b(z9c.class, "customTheme", "getCustomTheme()Lone/me/sdk/design/theme/OneMeTheme;"), zo5.e(zfe.a, z9c.class, "isIndicatorVisible", "isIndicatorVisible()Z"), new z8b(z9c.class, "tabItem", "getTabItem()Lone/me/common/tablayout/model/OneMeBaseTabItemModel;")};
    public boolean a;
    public final w9c b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final w9c h;
    public final w9c i;
    public cf7 j;
    public qgh k;

    public z9c(Context context) {
        super(context, null);
        this.a = true;
        this.b = new w9c(this, 1);
        bdc.a(this, new zn(10, this, this));
        this.c = rx8.P(3, new rgb(context, 11));
        this.d = rx8.P(3, new rgb(context, 12));
        this.e = rx8.P(3, new rgb(context, 13));
        this.f = rx8.P(3, new x5(context, 26, this));
        this.g = rx8.P(3, new rgb(context, 14));
        this.h = new w9c(this, 2);
        this.i = new w9c((owb) owb.h.getValue(), this);
        this.k = tre.F0(getTabItem().c, pq3.j.h(this));
        setOrientation(0);
        setGravity(17);
        setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        setClipToPadding(false);
    }

    public static final void a(z9c z9cVar) {
        CharSequence charSequenceD;
        ny8 ny8Var = z9cVar.d;
        ny8 ny8Var2 = z9cVar.e;
        ny8 ny8Var3 = z9cVar.f;
        z9cVar.setText(z9cVar.getTabItem().b);
        ynh ynhVar = z9cVar.getTabItem().g;
        if (ynhVar != null && (charSequenceD = ynhVar.d(z9cVar)) != null) {
            z9cVar.setContentDescription(charSequenceD);
        }
        int i = z9cVar.getTabItem().c;
        kbc customTheme = z9cVar.getCustomTheme();
        if (customTheme == null) {
            customTheme = pq3.j.h(z9cVar);
        }
        z9cVar.k = tre.F0(i, customTheme);
        ny8 ny8Var4 = z9cVar.g;
        Drawable drawable = z9cVar.getTabItem().e;
        if (drawable != null) {
            ImageView imageView = (ImageView) ny8Var.getValue();
            imageView.setImageDrawable(drawable);
            n7j.a(z9cVar, imageView, Integer.valueOf(z9cVar.b(imageView.getId())));
        }
        w9c w9cVar = z9cVar.h;
        zv8 zv8Var = l[1];
        if (((Boolean) w9cVar.b).booleanValue()) {
            sb8 sb8Var = z9cVar.getTabItem().d;
            if (sb8Var instanceof lwb) {
                v0c v0cVar = (v0c) ny8Var2.getValue();
                n7j.a(z9cVar, v0cVar, Integer.valueOf(z9cVar.b(v0cVar.getId())));
            } else if (cqk.d(sb8Var, mwb.l)) {
                g1c g1cVar = (g1c) ny8Var3.getValue();
                g1cVar.setVisibility(z9cVar.k.d ? 0 : 8);
                n7j.a(z9cVar, g1cVar, Integer.valueOf(z9cVar.b(g1cVar.getId())));
            } else {
                if (!cqk.d(sb8Var, nwb.l)) {
                    ore.o();
                    return;
                }
                if (ny8Var3.d()) {
                    ((g1c) ny8Var3.getValue()).setVisibility(8);
                }
                if (ny8Var2.d()) {
                    ((v0c) ny8Var2.getValue()).setVisibility(8);
                }
            }
            ImageView imageView2 = (ImageView) ny8Var4.getValue();
            Drawable drawable2 = z9cVar.getTabItem().f;
            if (drawable2 != null) {
                imageView2.setImageDrawable(drawable2);
                imageView2.setOnClickListener(new ze3(4, z9cVar));
                imageView2.setVisibility(0);
                n7j.a(z9cVar, imageView2, Integer.valueOf(z9cVar.b(imageView2.getId())));
            } else if (ny8Var4.d()) {
                ImageView imageView3 = (ImageView) ny8Var4.getValue();
                imageView3.setVisibility(8);
                imageView3.setOnClickListener(null);
            }
        }
        z9cVar.c();
        if (ny8Var.d()) {
            yab.H0((ImageView) ny8Var.getValue(), new x9c(z9cVar, 0));
        }
        ny8 ny8Var5 = z9cVar.c;
        if (ny8Var5.d()) {
            yab.H0((TextView) ny8Var5.getValue(), new y9c(z9cVar, 0));
        }
        if (ny8Var2.d()) {
            yab.H0((v0c) ny8Var2.getValue(), new y9c(z9cVar, 1));
        }
        if (ny8Var3.d()) {
            yab.H0((g1c) ny8Var3.getValue(), new x9c(z9cVar, 1));
        }
        z9cVar.requestLayout();
        z9cVar.invalidate();
    }

    public static /* synthetic */ void getTabItem$annotations() {
    }

    private final void setText(CharSequence charSequence) {
        TextView textView = (TextView) this.c.getValue();
        textView.setText(charSequence);
        n7j.a(this, textView, Integer.valueOf(b(textView.getId())));
    }

    public final int b(int i) {
        if (i == R.id.oneme_tab_item__start_imageview_id) {
            return 0;
        }
        if (i == R.id.oneme_tab_item_textview_id) {
            return getChildCount() / 2;
        }
        if (i != R.id.oneme_tab_item_end_imageview_id) {
            if (i == R.id.oneme_tab_item_end_action_imageview_id) {
                return getChildCount();
            }
            return -1;
        }
        if (!n7j.o(this.g)) {
            return getChildCount();
        }
        int childCount = getChildCount() - 1;
        if (childCount < 0) {
            return 0;
        }
        return childCount;
    }

    public final void c() {
        ny8 ny8Var = this.c;
        if (ny8Var.d()) {
            TextView textView = (TextView) ny8Var.getValue();
            textView.setTextColor(this.k.b);
            CharSequence text = textView.getText();
            if (text instanceof Spannable) {
                Spannable spannable = (Spannable) text;
                for (ImageSpan imageSpan : (ImageSpan[]) spannable.getSpans(0, spannable.length(), ImageSpan.class)) {
                    imageSpan.getDrawable().setAlpha((this.k.b >> 24) & 255);
                }
                textView.setText(text);
            }
        }
        ny8 ny8Var2 = this.d;
        if (ny8Var2.d()) {
            ((ImageView) ny8Var2.getValue()).setImageTintList(ColorStateList.valueOf(this.k.a));
        }
        ny8 ny8Var3 = this.g;
        if (ny8Var3.d()) {
            ((ImageView) ny8Var3.getValue()).setImageTintList(ColorStateList.valueOf(this.k.c));
        }
        zv8 zv8Var = l[1];
        if (((Boolean) this.h.b).booleanValue()) {
            sb8 sb8Var = getTabItem().d;
            boolean zD = cqk.d(sb8Var, mwb.l);
            ny8 ny8Var4 = this.f;
            if (zD) {
                if (ny8Var4.d()) {
                    ((g1c) ny8Var4.getValue()).setVisibility(this.k.d ? 0 : 8);
                    return;
                }
                return;
            }
            boolean z = sb8Var instanceof lwb;
            ny8 ny8Var5 = this.e;
            if (!z) {
                if (!cqk.d(sb8Var, nwb.l)) {
                    ore.o();
                    return;
                }
                if (ny8Var5.d()) {
                    ((v0c) ny8Var5.getValue()).setVisibility(8);
                }
                if (ny8Var4.d()) {
                    ((g1c) ny8Var4.getValue()).setVisibility(8);
                    return;
                }
                return;
            }
            boolean z2 = this.k.d && ((lwb) sb8Var).l != 0;
            if (ny8Var5.d()) {
                v0c v0cVar = (v0c) ny8Var5.getValue();
                v0cVar.setVisibility(z2 ? 0 : 8);
                int iD = qt4.D(getTabItem().c);
                if (iD == 0) {
                    v0cVar.setEnabled(true);
                    v0cVar.setMute(false);
                } else if (iD == 1) {
                    v0cVar.setEnabled(true);
                    v0cVar.setMute(true);
                } else if (iD != 2) {
                    ore.o();
                    return;
                } else {
                    v0cVar.setEnabled(false);
                    v0cVar.setMute(false);
                }
                pu4.c(v0cVar, Integer.valueOf(((lwb) sb8Var).l), !this.a, 4);
            }
        }
    }

    public final kbc getCustomTheme() {
        zv8 zv8Var = l[0];
        return (kbc) this.b.b;
    }

    public final cf7 getOnEndIconClickListener() {
        return this.j;
    }

    public final owb getTabItem() {
        zv8 zv8Var = l[2];
        return (owb) this.i.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ny8 ny8Var = this.c;
        if (ny8Var.d()) {
            TextView textView = (TextView) ny8Var.getValue();
            CharSequence text = textView.getText();
            Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
            Object[] spans = spanned != null ? spanned.getSpans(0, textView.getText().length(), FitFontImageSpan.class) : null;
            if (spans == null) {
                spans = new FitFontImageSpan[0];
            }
            for (Object obj : spans) {
                FitFontImageSpan fitFontImageSpan = (FitFontImageSpan) obj;
                fitFontImageSpan.updateDrawableSize(gm0.K(15.0f * yl5.d().getDisplayMetrics().density), kw6.c, false);
                fitFontImageSpan.setOverrideAlpha(false);
            }
        }
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        kbc customTheme = getCustomTheme();
        if (customTheme != null) {
            kbcVar = customTheme;
        }
        this.k = tre.F0(getTabItem().c, kbcVar);
        c();
        pq3.g(pq3.j.e(getContext()), this);
    }

    public final void setCustomTheme(kbc kbcVar) {
        this.b.B(this, l[0], kbcVar);
    }

    public final void setIndicatorVisible(boolean z) {
        this.h.B(this, l[1], Boolean.valueOf(z));
    }

    public final void setOnEndIconClickListener(cf7 cf7Var) {
        this.j = cf7Var;
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        if (z != isSelected()) {
            setTabItem(owb.a(getTabItem(), null, z ? 1 : 2, null, null, null, 123));
        }
        super.setSelected(z);
    }

    public final void setTabItem(owb owbVar) {
        this.i.B(this, l[2], owbVar);
    }
}
