package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.List;
import java.util.concurrent.CancellationException;
import one.me.keyboardmedia.MediaKeyboardWidget;
import one.me.rlottie.RLottieImageView;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import org.apache.http.conn.params.ConnManagerParams;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class ud9 extends mdh implements tf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ud9(uka ukaVar, View view, lq4 lq4Var) {
        super(3, lq4Var);
        this.e = 29;
        this.f = ukaVar;
        this.g = view;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) throws Throwable {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ud9 ud9Var = new ud9((ae9) this.g, (lq4) obj3, 0);
                ud9Var.f = (Throwable) obj2;
                ud9Var.invokeSuspend(sbiVar);
                return sbiVar;
            case 1:
                ud9 ud9Var2 = new ud9((BaseBottomSheetWidget) this.g, (lq4) obj3, 1);
                ud9Var2.f = (kbc) obj2;
                ud9Var2.invokeSuspend(sbiVar);
                return sbiVar;
            case 2:
                ud9 ud9Var3 = new ud9((kn1) this.g, (lq4) obj3, 2);
                ud9Var3.f = (Long) obj;
                return ud9Var3.invokeSuspend(sbiVar);
            case 3:
                ud9 ud9Var4 = new ud9(3, (lq4) obj3, 3);
                ud9Var4.f = (x7j) obj;
                ud9Var4.g = (List) obj2;
                return ud9Var4.invokeSuspend(sbiVar);
            case 4:
                ud9 ud9Var5 = new ud9(3, (lq4) obj3, 4);
                ud9Var5.f = (x02) obj;
                ud9Var5.g = (x02) obj2;
                return ud9Var5.invokeSuspend(sbiVar);
            case 5:
                ud9 ud9Var6 = new ud9(3, (lq4) obj3, 5);
                ud9Var6.f = (vv1) obj;
                ud9Var6.g = (kbc) obj2;
                ud9Var6.invokeSuspend(sbiVar);
                return sbiVar;
            case 6:
                ud9 ud9Var7 = new ud9((zn2) this.g, (lq4) obj3, 6);
                ud9Var7.f = (ImageView) obj;
                ud9Var7.invokeSuspend(sbiVar);
                return sbiVar;
            case 7:
                ud9 ud9Var8 = new ud9((zn2) this.g, (lq4) obj3, 7);
                ud9Var8.f = (TextView) obj;
                ud9Var8.invokeSuspend(sbiVar);
                return sbiVar;
            case 8:
                ud9 ud9Var9 = new ud9(3, (lq4) obj3, 8);
                ud9Var9.f = (lq2) obj;
                ud9Var9.g = (jl) obj2;
                return ud9Var9.invokeSuspend(sbiVar);
            case 9:
                ud9 ud9Var10 = new ud9((c83) this.g, (lq4) obj3, 9);
                ud9Var10.f = (kbc) obj2;
                ud9Var10.invokeSuspend(sbiVar);
                return sbiVar;
            case 10:
                ud9 ud9Var11 = new ud9(3, (lq4) obj3, 10);
                ud9Var11.f = (yf3) obj;
                ud9Var11.g = (q9f) obj2;
                return ud9Var11.invokeSuspend(sbiVar);
            case 11:
                ud9 ud9Var12 = new ud9(3, (lq4) obj3, 11);
                ud9Var12.f = (ei5) obj;
                ud9Var12.g = (kbc) obj2;
                ud9Var12.invokeSuspend(sbiVar);
                return sbiVar;
            case 12:
                ud9 ud9Var13 = new ud9(3, (lq4) obj3, 12);
                ud9Var13.f = (jj3) obj;
                ud9Var13.g = (List) obj2;
                return ud9Var13.invokeSuspend(sbiVar);
            case 13:
                ud9 ud9Var14 = new ud9((fk3) this.g, (lq4) obj3, 13);
                ud9Var14.f = (Throwable) obj2;
                ud9Var14.invokeSuspend(sbiVar);
                return sbiVar;
            case 14:
                ud9 ud9Var15 = new ud9(3, (lq4) obj3, 14);
                ud9Var15.f = (CheckBox) obj;
                ud9Var15.g = (kbc) obj2;
                ud9Var15.invokeSuspend(sbiVar);
                return sbiVar;
            case 15:
                ud9 ud9Var16 = new ud9(3, (lq4) obj3, 15);
                ud9Var16.g = (yx6) obj;
                ud9Var16.f = (Throwable) obj2;
                ud9Var16.invokeSuspend(sbiVar);
                return sbiVar;
            case 16:
                ud9 ud9Var17 = new ud9((rp4) this.g, (lq4) obj3, 16);
                ud9Var17.f = (TextView) obj;
                ud9Var17.invokeSuspend(sbiVar);
                return sbiVar;
            case 17:
                ud9 ud9Var18 = new ud9(3, (lq4) obj3, 17);
                ud9Var18.f = (ind) obj;
                ud9Var18.g = (List) obj2;
                return ud9Var18.invokeSuspend(sbiVar);
            case 18:
                ud9 ud9Var19 = new ud9((p56) this.g, (lq4) obj3, 18);
                ud9Var19.f = (ViewGroup) obj;
                ud9Var19.invokeSuspend(sbiVar);
                return sbiVar;
            case 19:
                ud9 ud9Var20 = new ud9((hw6) this.g, (lq4) obj3, 19);
                ud9Var20.f = (kbc) obj2;
                ud9Var20.invokeSuspend(sbiVar);
                return sbiVar;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                ud9 ud9Var21 = new ud9((am0) this.g, (lq4) obj3, 20);
                ud9Var21.f = (kbc) obj2;
                ud9Var21.invokeSuspend(sbiVar);
                return sbiVar;
            case 21:
                ud9 ud9Var22 = new ud9((s27) this.g, (lq4) obj3, 21);
                ud9Var22.f = (kbc) obj2;
                ud9Var22.invokeSuspend(sbiVar);
                return sbiVar;
            case 22:
                ud9 ud9Var23 = new ud9(3, (lq4) obj3, 22);
                ud9Var23.f = (RLottieImageView) obj;
                ud9Var23.g = (kbc) obj2;
                ud9Var23.invokeSuspend(sbiVar);
                return sbiVar;
            case 23:
                ud9 ud9Var24 = new ud9((zx8) this.g, (lq4) obj3, 23);
                ud9Var24.f = (kbc) obj2;
                ud9Var24.invokeSuspend(sbiVar);
                return sbiVar;
            case 24:
                ud9 ud9Var25 = new ud9(3, (lq4) obj3, 24);
                ud9Var25.f = (b69) obj;
                ud9Var25.g = (kbc) obj2;
                ud9Var25.invokeSuspend(sbiVar);
                return sbiVar;
            case 25:
                ud9 ud9Var26 = new ud9((i99) this.g, (lq4) obj3, 25);
                ud9Var26.f = (Throwable) obj2;
                ud9Var26.invokeSuspend(sbiVar);
                return sbiVar;
            case 26:
                ud9 ud9Var27 = new ud9(3, (lq4) obj3, 26);
                ud9Var27.f = (yc9) obj;
                ud9Var27.g = (kbc) obj2;
                ud9Var27.invokeSuspend(sbiVar);
                return sbiVar;
            case 27:
                ud9 ud9Var28 = new ud9((GradientDrawable) this.g, (lq4) obj3, 27);
                ud9Var28.f = (kbc) obj2;
                ud9Var28.invokeSuspend(sbiVar);
                return sbiVar;
            case 28:
                ud9 ud9Var29 = new ud9((MediaKeyboardWidget) this.g, (lq4) obj3, 28);
                ud9Var29.f = (View) obj;
                ud9Var29.invokeSuspend(sbiVar);
                return sbiVar;
            default:
                new ud9((uka) this.f, (View) this.g, (lq4) obj3).invokeSuspend(sbiVar);
                return sbiVar;
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.e) {
            case 0:
                Throwable th = (Throwable) this.f;
                ch3.d0(obj);
                gm0.V(((ae9) this.g).m, "fail to sendCritLogs", new dw4(th));
                return sbi.a;
            case 1:
                kbc kbcVar = (kbc) this.f;
                ch3.d0(obj);
                BaseBottomSheetWidget baseBottomSheetWidget = (BaseBottomSheetWidget) this.g;
                kbc kbcVarT1 = baseBottomSheetWidget.t1();
                if (kbcVarT1 != null) {
                    kbcVar = kbcVarT1;
                }
                baseBottomSheetWidget.s1().setBackground(new ColorDrawable(kbcVar.b().f));
                return sbi.a;
            case 2:
                Long l = (Long) this.f;
                ch3.d0(obj);
                if (((f62) ((n42) ((kn1) this.g).c).f.a.getValue()).k instanceof ni6) {
                    return null;
                }
                return l;
            case 3:
                x7j x7jVar = (x7j) this.f;
                List list = (List) this.g;
                ch3.d0(obj);
                return new ylc(x7jVar, list);
            case 4:
                x02 x02Var = (x02) this.f;
                x02 x02Var2 = (x02) this.g;
                ch3.d0(obj);
                return new ylc(x02Var, x02Var2);
            case 5:
                vv1 vv1Var = (vv1) this.f;
                kbc kbcVar2 = (kbc) this.g;
                ch3.d0(obj);
                vv1Var.setBackgroundColor(pq3.j.h(vv1Var).k().b);
                vv1Var.onThemeChanged(kbcVar2);
                return sbi.a;
            case 6:
                ImageView imageView = (ImageView) this.f;
                ch3.d0(obj);
                kbc kbcVarH = ((zn2) this.g).v;
                if (kbcVarH == null) {
                    kbcVarH = pq3.j.h(imageView);
                }
                int i = ((bs0) kbcVarH.u().c.g).c;
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                shapeDrawable.getPaint().setColor(-1);
                imageView.setBackground(col.b(i, null, shapeDrawable));
                imageView.setImageResource(R.drawable.icon_cross);
                imageView.setImageTintList(ColorStateList.valueOf(kbcVarH.getIcon().d));
                return sbi.a;
            case 7:
                TextView textView = (TextView) this.f;
                ch3.d0(obj);
                kbc kbcVarH2 = ((zn2) this.g).v;
                if (kbcVarH2 == null) {
                    kbcVarH2 = pq3.j.h(textView);
                }
                textView.setTextColor(kbcVarH2.getText().e);
                return sbi.a;
            case 8:
                lq2 lq2Var = (lq2) this.f;
                jl jlVar = (jl) this.g;
                ch3.d0(obj);
                return new ylc(lq2Var, jlVar);
            case 9:
                kbc kbcVar3 = (kbc) this.f;
                ch3.d0(obj);
                c83 c83Var = (c83) this.g;
                c83Var.u.onThemeChanged(kbcVar3);
                ny8 ny8Var = c83Var.v;
                if (ny8Var.d()) {
                    ((TextView) ny8Var.getValue()).setTextColor(kbcVar3.getText().j);
                }
                return sbi.a;
            case 10:
                yf3 yf3Var = (yf3) this.f;
                q9f q9fVar = (q9f) this.g;
                ch3.d0(obj);
                return new ylc(yf3Var, q9fVar);
            case 11:
                ei5 ei5Var = (ei5) this.f;
                kbc kbcVar4 = (kbc) this.g;
                ch3.d0(obj);
                ei5Var.onThemeChanged(kbcVar4);
                return sbi.a;
            case 12:
                jj3 jj3Var = (jj3) this.f;
                List list2 = (List) this.g;
                ch3.d0(obj);
                return new ylc(jj3Var, list2);
            case 13:
                Throwable th2 = (Throwable) this.f;
                ch3.d0(obj);
                if (!(th2 instanceof CancellationException)) {
                    gm0.V(((fk3) this.g).Z, "observeChatsAndPresences fail", th2);
                }
                return sbi.a;
            case 14:
                CheckBox checkBox = (CheckBox) this.f;
                kbc kbcVar5 = (kbc) this.g;
                ch3.d0(obj);
                Drawable buttonDrawable = checkBox.getButtonDrawable();
                qjg qjgVar = buttonDrawable instanceof qjg ? (qjg) buttonDrawable : null;
                if (qjgVar != null) {
                    so2.C(qjgVar, kbcVar5);
                }
                return sbi.a;
            case 15:
                yx6 yx6Var = (yx6) this.g;
                Throwable th3 = (Throwable) this.f;
                ch3.d0(obj);
                if (th3 instanceof CancellationException) {
                    throw th3;
                }
                String name = yx6Var.getClass().getName();
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.f;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, name, zo5.r("getStoriesPreviewFlow executed with error ", th3), null);
                    }
                }
                return sbi.a;
            case 16:
                a8g a8gVar = pq3.j;
                TextView textView2 = (TextView) this.f;
                ch3.d0(obj);
                Integer num = ((rp4) this.g).c;
                textView2.setTextColor(num != null ? oc9.Z(num.intValue(), a8gVar.h(textView2)) : a8gVar.h(textView2).getText().b);
                return sbi.a;
            case 17:
                ind indVar = (ind) this.f;
                List list3 = (List) this.g;
                ch3.d0(obj);
                return new yz5(indVar, list3);
            case 18:
                ViewGroup viewGroup = (ViewGroup) this.f;
                ch3.d0(obj);
                p56 p56Var = (p56) this.g;
                kbc kbcVarH3 = p56Var.v;
                if (kbcVarH3 == null) {
                    kbcVarH3 = pq3.j.h(viewGroup);
                }
                sb8.m0(kbcVarH3.h().b, p56Var.u);
                bo2 bo2Var = p56Var.z;
                if (bo2Var != null) {
                    p56Var.H(bo2Var.c);
                }
                return sbi.a;
            case 19:
                kbc kbcVar6 = (kbc) this.f;
                ch3.d0(obj);
                hw6 hw6Var = (hw6) this.g;
                p1c p1cVar = hw6Var.u;
                f55.f(p1cVar, kbcVar6);
                p1cVar.setTextColor(kbcVar6.getText().b);
                p1cVar.setHintTextColor(kbcVar6.getText().e);
                p1cVar.setBackgroundColor(kbcVar6.b().f);
                ny8 ny8Var2 = hw6Var.v;
                if (ny8Var2.d()) {
                    ((AppCompatTextView) ny8Var2.getValue()).setTextColor(kbcVar6.getText().j);
                }
                return sbi.a;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                kbc kbcVar7 = (kbc) this.f;
                ch3.d0(obj);
                am0 am0Var = (am0) this.g;
                int i2 = am0.w;
                am0Var.H(kbcVar7);
                return sbi.a;
            case 21:
                kbc kbcVar8 = (kbc) this.f;
                ch3.d0(obj);
                ((s27) this.g).u.onThemeChanged(kbcVar8);
                return sbi.a;
            case 22:
                RLottieImageView rLottieImageView = (RLottieImageView) this.f;
                kbc kbcVar9 = (kbc) this.g;
                ch3.d0(obj);
                rLottieImageView.setColorFilter(kbcVar9.h().a);
                return sbi.a;
            case 23:
                kbc kbcVar10 = (kbc) this.f;
                ch3.d0(obj);
                zx8 zx8Var = (zx8) this.g;
                p1c p1cVar2 = zx8Var.u;
                f55.f(p1cVar2, kbcVar10);
                p1cVar2.setTextColor(kbcVar10.getText().b);
                p1cVar2.setHintTextColor(kbcVar10.getText().e);
                p1cVar2.setBackgroundColor(kbcVar10.b().f);
                ny8 ny8Var3 = zx8Var.v;
                if (ny8Var3.d()) {
                    ((AppCompatTextView) ny8Var3.getValue()).setTextColor(kbcVar10.getText().j);
                }
                return sbi.a;
            case 24:
                b69 b69Var = (b69) this.f;
                kbc kbcVar11 = (kbc) this.g;
                ch3.d0(obj);
                b69Var.setTextColor(kbcVar11.getText().h);
                return sbi.a;
            case 25:
                Throwable th4 = (Throwable) this.f;
                ch3.d0(obj);
                if (!(th4 instanceof CancellationException)) {
                    gm0.V(((i99) this.g).e, "fail to handle chat", th4);
                }
                return sbi.a;
            case 26:
                yc9 yc9Var = (yc9) this.f;
                kbc kbcVar12 = (kbc) this.g;
                ch3.d0(obj);
                yc9Var.setBackground(col.d(kbcVar12, kbcVar12.b().f, ((bs0) kbcVar12.u().c.g).c, 4));
                return sbi.a;
            case 27:
                kbc kbcVar13 = (kbc) this.f;
                ch3.d0(obj);
                GradientDrawable gradientDrawable = (GradientDrawable) this.g;
                kbcVar13.b();
                sb8.m0(-1728053248, gradientDrawable);
                return sbi.a;
            case 28:
                View view = (View) this.f;
                ch3.d0(obj);
                view.setBackgroundColor(MediaKeyboardWidget.o1((MediaKeyboardWidget) this.g).B().c);
                return sbi.a;
            default:
                ch3.d0(obj);
                uka ukaVar = (uka) this.f;
                vka vkaVar = ukaVar.x;
                if (vkaVar != null) {
                    boolean zB = z21.b(vkaVar.a & 2080374784);
                    View view2 = (View) this.g;
                    a8g a8gVar2 = pq3.j;
                    ukaVar.a(f55.g(a8gVar2.h(view2).f(), zB));
                    ukaVar.h(a8gVar2.h(view2));
                }
                return sbi.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ud9(int i, lq4 lq4Var, int i2) {
        super(i, lq4Var);
        this.e = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ud9(Object obj, lq4 lq4Var, int i) {
        super(3, lq4Var);
        this.e = i;
        this.g = obj;
    }
}
