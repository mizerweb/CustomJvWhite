package defpackage;

import android.R;
import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RectShape;
import android.text.TextPaint;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import one.me.complaintbottomsheet.ComplaintBottomSheet;
import one.me.inviteactions.invitebyqr.InviteByQrBottomSheet;

/* JADX INFO: loaded from: classes4.dex */
public final class zu extends mdh implements tf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zu(Object obj, lq4 lq4Var, int i) {
        super(3, lq4Var);
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                zu zuVar = new zu(3, (lq4) obj3, 0);
                zuVar.f = (zn9) obj;
                zuVar.invokeSuspend(sbiVar);
                return sbiVar;
            case 1:
                new zu((uo0) this.f, (lq4) obj3, 1).invokeSuspend(sbiVar);
                return sbiVar;
            case 2:
                zu zuVar2 = new zu(3, (lq4) obj3, 2);
                zuVar2.f = (o61) obj;
                zuVar2.invokeSuspend(sbiVar);
                return sbiVar;
            case 3:
                ((Number) obj2).intValue();
                zu zuVar3 = new zu(3, (lq4) obj3, 3);
                zuVar3.f = (List) obj;
                return zuVar3.invokeSuspend(sbiVar);
            case 4:
                new zu((ly2) this.f, (lq4) obj3, 4).invokeSuspend(sbiVar);
                return sbiVar;
            case 5:
                new zu((bpa) this.f, (lq4) obj3, 5).invokeSuspend(sbiVar);
                return sbiVar;
            case 6:
                new zu((ComplaintBottomSheet) this.f, (lq4) obj3, 6).invokeSuspend(sbiVar);
                return sbiVar;
            case 7:
                zu zuVar4 = new zu(3, (lq4) obj3, 7);
                zuVar4.f = (RecyclerView) obj;
                zuVar4.invokeSuspend(sbiVar);
                return sbiVar;
            case 8:
                new zu((a46) this.f, (lq4) obj3, 8).invokeSuspend(sbiVar);
                return sbiVar;
            case 9:
                new zu((InviteByQrBottomSheet) this.f, (lq4) obj3, 9).invokeSuspend(sbiVar);
                return sbiVar;
            case 10:
                zu zuVar5 = new zu(3, (lq4) obj3, 10);
                zuVar5.f = (vj4) obj;
                return zuVar5.invokeSuspend(sbiVar);
            case 11:
                zu zuVar6 = new zu(3, (lq4) obj3, 11);
                zuVar6.f = (fcd) obj;
                zuVar6.invokeSuspend(sbiVar);
                return sbiVar;
            case 12:
                zu zuVar7 = new zu(3, (lq4) obj3, 12);
                zuVar7.f = (ecd) obj;
                zuVar7.invokeSuspend(sbiVar);
                return sbiVar;
            case 13:
                new zu((tmg) this.f, (lq4) obj3, 13).invokeSuspend(sbiVar);
                return sbiVar;
            case 14:
                zu zuVar8 = new zu(3, (lq4) obj3, 14);
                zuVar8.f = (AppCompatTextView) obj;
                zuVar8.invokeSuspend(sbiVar);
                return sbiVar;
            case 15:
                new zu((AtomicReference) this.f, (lq4) obj3, 15).invokeSuspend(sbiVar);
                return sbiVar;
            default:
                new zu((zzi) this.f, (lq4) obj3, 16).invokeSuspend(sbiVar);
                return sbiVar;
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Window window;
        int i = this.e;
        a8g a8gVar = pq3.j;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                zn9 zn9Var = (zn9) this.f;
                ch3.d0(obj);
                zn9Var.setTextColor(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{a8gVar.h(zn9Var).getText().h, a8gVar.h(zn9Var).getText().d}));
                zn9Var.setBackgroundTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{a8gVar.h(zn9Var).b().f, a8gVar.h(zn9Var).b().b}));
                zn9Var.setRippleColor(ColorStateList.valueOf(((bs0) a8gVar.h(zn9Var).u().c.g).c));
                zn9Var.setStrokeColor(ColorStateList.valueOf(a8gVar.h(zn9Var).B().b));
                return sbiVar;
            case 1:
                ch3.d0(obj);
                uo0 uo0Var = (uo0) this.f;
                uo0Var.a.unregisterActivityLifecycleCallbacks(uo0Var.f);
                return sbiVar;
            case 2:
                o61 o61Var = (o61) this.f;
                ch3.d0(obj);
                TextPaint textPaint = o61Var.n;
                Paint paint = o61Var.m;
                a8gVar.h(o61Var);
                textPaint.setColor(-1);
                o61Var.o.setColor(a8gVar.h(o61Var).getText().b);
                boolean z = o61Var.F;
                Paint paint2 = o61Var.j;
                if (z) {
                    paint2.setColor(a8gVar.h(o61Var).h().a);
                } else {
                    paint2.setColor(((xac) a8gVar.h(o61Var).f().a).a.p.b);
                }
                o61Var.k.setColor(a8gVar.h(o61Var).h().c);
                boolean z2 = o61Var.F;
                Paint paint3 = o61Var.l;
                if (z2) {
                    paint3.setColor(((fn8) a8gVar.h(o61Var).u().c.a).c);
                    paint.setColor(((fn8) a8gVar.h(o61Var).u().c.d).c);
                } else {
                    paint3.setColor(((xac) a8gVar.h(o61Var).f().a).a.p.d);
                    paint.setColor(((xac) a8gVar.h(o61Var).f().a).a.p.d);
                }
                a8gVar.h(o61Var);
                o61Var.x = ColorStateList.valueOf(-1);
                o61Var.y = ColorStateList.valueOf(a8gVar.h(o61Var).getIcon().b);
                o61Var.invalidate();
                return sbiVar;
            case 3:
                List list = (List) this.f;
                ch3.d0(obj);
                return list;
            case 4:
                ch3.d0(obj);
                ly2 ly2Var = (ly2) this.f;
                ly2Var.a.f(ly2Var);
                return sbiVar;
            case 5:
                ch3.d0(obj);
                ((bpa) this.f).a();
                return sbiVar;
            case 6:
                ch3.d0(obj);
                ComplaintBottomSheet complaintBottomSheet = (ComplaintBottomSheet) this.f;
                Activity activity = complaintBottomSheet.getActivity();
                if (activity != null && (window = activity.getWindow()) != null) {
                    complaintBottomSheet.d(window);
                }
                return sbiVar;
            case 7:
                RecyclerView recyclerView = (RecyclerView) this.f;
                ch3.d0(obj);
                recyclerView.setBackgroundColor(a8gVar.h(recyclerView).b().b);
                return sbiVar;
            case 8:
                ch3.d0(obj);
                a46 a46Var = (a46) this.f;
                View view = a46Var.a;
                kbc kbcVarH = a46Var.u;
                if (kbcVarH == null) {
                    kbcVarH = a8gVar.h((ImageView) view);
                }
                int i2 = ((bs0) kbcVarH.u().c.g).c;
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                shapeDrawable.getPaint().setColor(-1);
                ((ImageView) view).setBackground(col.b(i2, null, shapeDrawable));
                return sbiVar;
            case 9:
                ch3.d0(obj);
                InviteByQrBottomSheet inviteByQrBottomSheet = (InviteByQrBottomSheet) this.f;
                zv8[] zv8VarArr = InviteByQrBottomSheet.H;
                mm8 mm8Var = (mm8) inviteByQrBottomSheet.C.getValue();
                b0e b0eVarF1 = inviteByQrBottomSheet.F1();
                zv8[] zv8VarArr2 = mm8.j;
                mm8Var.B(b0eVarF1, false, 0);
                return sbiVar;
            case 10:
                vj4 vj4Var = (vj4) this.f;
                ch3.d0(obj);
                return vj4Var.a;
            case 11:
                fcd fcdVar = (fcd) this.f;
                ch3.d0(obj);
                int i3 = ((fn8) fcdVar.getCurrentTheme().u().c.b).c;
                ShapeDrawable shapeDrawable2 = new ShapeDrawable(new RectShape());
                shapeDrawable2.getPaint().setColor(fcdVar.getCurrentTheme().b().f);
                fcdVar.setBackground(col.c(i3, shapeDrawable2, null, 4));
                return sbiVar;
            case 12:
                ecd ecdVar = (ecd) this.f;
                ch3.d0(obj);
                a8gVar.h(ecdVar);
                ecdVar.setBackground(new ColorDrawable(-1728053248));
                return sbiVar;
            case 13:
                ch3.d0(obj);
                tmg tmgVar = (tmg) this.f;
                sb8.m0(tmgVar.K().h().b, tmgVar.v);
                co2 co2Var = tmgVar.C;
                if (co2Var != null) {
                    omg omgVar = co2Var.b;
                    if (tmgVar.x != null) {
                        tmgVar.x = tmgVar.J();
                    }
                    tmgVar.H(omgVar.f);
                    tmgVar.I(omgVar.g);
                }
                return sbiVar;
            case 14:
                AppCompatTextView appCompatTextView = (AppCompatTextView) this.f;
                ch3.d0(obj);
                appCompatTextView.setTextColor(a8gVar.h(appCompatTextView).getText().b);
                return sbiVar;
            case 15:
                ch3.d0(obj);
                ((AtomicReference) this.f).set(null);
                return sbiVar;
            default:
                ch3.d0(obj);
                zzi zziVar = (zzi) this.f;
                zziVar.b.setTintList(ColorStateList.valueOf(zziVar.getVolumeIconBackgroundColor()));
                zziVar.c.setTintList(ColorStateList.valueOf(zziVar.getVolumeIconColor()));
                return sbiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zu(int i, lq4 lq4Var, int i2) {
        super(i, lq4Var);
        this.e = i2;
    }
}
