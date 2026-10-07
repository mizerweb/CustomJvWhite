package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Collections;
import java.util.List;
import one.me.informer.InformerBottomSheet;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class he8 extends mdh implements qf7 {
    public final /* synthetic */ int e = 0;
    public /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public he8(xte xteVar, String str, String str2, ty9 ty9Var, String str3, String str4, Bundle bundle, lq4 lq4Var) {
        super(2, lq4Var);
        this.f = xteVar;
        this.g = str;
        this.h = str2;
        this.i = ty9Var;
        this.j = str3;
        this.k = str4;
        this.l = bundle;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.l;
        Object obj3 = this.k;
        Object obj4 = this.j;
        Object obj5 = this.i;
        Object obj6 = this.h;
        Object obj7 = this.g;
        switch (i) {
            case 0:
                he8 he8Var = new he8(lq4Var, (ImageView) obj7, (LinearLayout) obj6, (TextView) obj5, (TextView) obj4, (cyb) obj3, (InformerBottomSheet) obj2);
                he8Var.f = obj;
                return he8Var;
            default:
                return new he8((xte) this.f, (String) obj7, (String) obj6, (ty9) obj5, (String) obj4, (String) obj3, (Bundle) obj2, lq4Var);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((he8) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((he8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        float f;
        float f2;
        jy9 jy9Var;
        int i = this.e;
        sbi sbiVar = sbi.a;
        Object obj2 = this.l;
        Object obj3 = this.k;
        Object obj4 = this.j;
        Object obj5 = this.i;
        Object obj6 = this.h;
        Object obj7 = this.g;
        int i2 = 1;
        lq4 lq4Var = null;
        switch (i) {
            case 0:
                InformerBottomSheet informerBottomSheet = (InformerBottomSheet) obj2;
                TextView textView = (TextView) obj4;
                TextView textView2 = (TextView) obj5;
                LinearLayout linearLayout = (LinearLayout) obj6;
                ImageView imageView = (ImageView) obj7;
                Object obj8 = this.f;
                ch3.d0(obj);
                if8 if8Var = (if8) obj8;
                if (if8Var instanceof gf8) {
                    gf8 gf8Var = (gf8) if8Var;
                    Drawable drawable = gf8Var.d;
                    if (drawable == null) {
                        imageView.setVisibility(8);
                        imageView.setImageDrawable(null);
                    } else {
                        imageView.setVisibility(0);
                        imageView.setImageDrawable(drawable);
                    }
                    CharSequence charSequenceD = gf8Var.c.d(linearLayout);
                    if (charSequenceD != null && !r5h.X0(charSequenceD)) {
                        i2 = 0;
                    }
                    if (i2 == 0) {
                        textView2.setText(charSequenceD);
                        textView2.setVisibility(0);
                    } else {
                        textView2.setText((CharSequence) null);
                        textView2.setVisibility(8);
                    }
                    ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                    if (layoutParams != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        if (i2 == 0) {
                            f = yl5.d().getDisplayMetrics().density;
                            f2 = 12.0f;
                        } else {
                            f = yl5.d().getDisplayMetrics().density;
                            f2 = 24.0f;
                        }
                        marginLayoutParams.bottomMargin = gm0.K(f2 * f);
                        textView.setLayoutParams(marginLayoutParams);
                        textView.setText(gf8Var.b.d(linearLayout));
                        CharSequence charSequenceD2 = gf8Var.h.d(linearLayout);
                        cyb cybVar = (cyb) obj3;
                        if (charSequenceD2 == null || r5h.X0(charSequenceD2)) {
                            charSequenceD2 = informerBottomSheet.getContext().getText(R.string.its_clear);
                        }
                        cybVar.setText(charSequenceD2);
                        return sbiVar;
                    }
                    ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                } else {
                    if (cqk.d(if8Var, hf8.a)) {
                        zpe zpeVar = BaseBottomSheetWidget.i;
                        informerBottomSheet.v1(true);
                        return sbiVar;
                    }
                    ore.o();
                }
                return null;
            default:
                ch3.d0(obj);
                xte xteVar = (xte) this.f;
                String str = (String) obj7;
                String str2 = (String) obj6;
                ty9 ty9Var = (ty9) obj5;
                String str3 = (String) obj4;
                String str4 = (String) obj3;
                Bundle bundle = (Bundle) obj2;
                zv8[] zv8VarArr = xte.B;
                by9 by9Var = new by9();
                fy9 fy9Var = new fy9();
                List list = Collections.EMPTY_LIST;
                ghe gheVar = ghe.e;
                hy9 hy9Var = new hy9();
                ly9 ly9Var = ly9.d;
                Uri uri = str == null ? null : Uri.parse(str);
                str2.getClass();
                zz9 zz9Var = new zz9();
                zz9Var.b = str3;
                zz9Var.a = str4;
                zz9Var.H = bundle;
                zz9Var.G = Integer.valueOf(ty9Var.ordinal());
                b0a b0aVar = new b0a(zz9Var);
                lvb.b0(fy9Var.b == null || fy9Var.a != null);
                if (uri != null) {
                    jy9Var = new jy9(uri, null, fy9Var.a != null ? new gy9(fy9Var) : null, null, list, null, gheVar, -9223372036854775807L);
                } else {
                    jy9Var = null;
                }
                ry9 ry9Var = new ry9(str2, new dy9(by9Var), jy9Var, new iy9(hy9Var), b0aVar, ly9Var);
                iu9 iu9Var = xteVar.g;
                if (iu9Var != null) {
                    iu9Var.t(ry9Var);
                }
                yab.i0(xteVar.d, null, 0, new wte(xteVar, lq4Var, i2), 3);
                return sbiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public he8(lq4 lq4Var, ImageView imageView, LinearLayout linearLayout, TextView textView, TextView textView2, cyb cybVar, InformerBottomSheet informerBottomSheet) {
        super(2, lq4Var);
        this.g = imageView;
        this.h = linearLayout;
        this.i = textView;
        this.j = textView2;
        this.k = cybVar;
        this.l = informerBottomSheet;
    }
}
