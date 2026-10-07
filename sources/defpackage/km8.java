package defpackage;

import android.net.Uri;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import one.me.inviteactions.invitebyqr.InviteByQrBottomSheet;

/* JADX INFO: loaded from: classes2.dex */
public final class km8 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ InviteByQrBottomSheet g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ km8(InviteByQrBottomSheet inviteByQrBottomSheet, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = inviteByQrBottomSheet;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        InviteByQrBottomSheet inviteByQrBottomSheet = this.g;
        switch (i) {
            case 0:
                km8 km8Var = new km8(inviteByQrBottomSheet, lq4Var, 0);
                km8Var.f = obj;
                return km8Var;
            default:
                km8 km8Var2 = new km8(inviteByQrBottomSheet, lq4Var, 1);
                km8Var2.f = obj;
                return km8Var2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((km8) create((szd) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((km8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object poeVar;
        Uri uri;
        switch (this.e) {
            case 0:
                szd szdVar = (szd) this.f;
                ch3.d0(obj);
                String name = InviteByQrBottomSheet.class.getName();
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, name, "Show qr code in bottom sheet", null);
                    }
                }
                InviteByQrBottomSheet inviteByQrBottomSheet = this.g;
                int iD = zo5.D(78.0f, yl5.d().getDisplayMetrics().density, szdVar.b.getHeight());
                if (iD > 0) {
                    ViewGroup.LayoutParams layoutParams = inviteByQrBottomSheet.s1().getLayoutParams();
                    if (layoutParams == null) {
                        layoutParams = new ViewGroup.LayoutParams(-1, iD);
                        inviteByQrBottomSheet.s1().setLayoutParams(layoutParams);
                    }
                    if (layoutParams.height != iD) {
                        layoutParams.height = iD;
                        inviteByQrBottomSheet.s1().setLayoutParams(layoutParams);
                        inviteByQrBottomSheet.s1().requestLayout();
                    }
                }
                InviteByQrBottomSheet inviteByQrBottomSheet2 = this.g;
                j8e j8eVar = inviteByQrBottomSheet2.x;
                zv8[] zv8VarArr = InviteByQrBottomSheet.H;
                cs csVar = (cs) j8eVar.m(inviteByQrBottomSheet2, zv8VarArr[1]);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(szdVar.b.getWidth(), szdVar.b.getHeight());
                layoutParams2.gravity = 80;
                csVar.setLayoutParams(layoutParams2);
                InviteByQrBottomSheet inviteByQrBottomSheet3 = this.g;
                ((cs) inviteByQrBottomSheet3.x.m(inviteByQrBottomSheet3, zv8VarArr[1])).setImageBitmap(szdVar.b);
                return sbi.a;
            default:
                sbi sbiVar = sbi.a;
                gu4 gu4Var = (gu4) this.f;
                ch3.d0(obj);
                InviteByQrBottomSheet inviteByQrBottomSheet4 = this.g;
                try {
                    zv8[] zv8VarArr2 = InviteByQrBottomSheet.H;
                    szd szdVar2 = (szd) ((mm8) inviteByQrBottomSheet4.C.getValue()).i.a.getValue();
                    if (szdVar2 != null && (uri = szdVar2.a) != null) {
                        dp4.c(uri);
                        if (inviteByQrBottomSheet4.F1().a == ((s7f) ((et3) inviteByQrBottomSheet4.z.getValue())).t()) {
                            ((uj4) inviteByQrBottomSheet4.E.getValue()).a(inviteByQrBottomSheet4.getContext(), uri);
                        } else {
                            String str = sj8.a;
                            sj8.i(inviteByQrBottomSheet4.getContext(), uri, "image/*");
                        }
                        inviteByQrBottomSheet4.v1(true);
                        poeVar = sbiVar;
                        Throwable thA = roe.a(poeVar);
                        if (thA != null) {
                            qv1.t(gu4Var, "shareQrCode: failed to share qr code", thA);
                            ((h8c) inviteByQrBottomSheet4.y.getValue()).p();
                        }
                    }
                } catch (Throwable th) {
                    poeVar = new poe(th);
                }
                return sbiVar;
        }
    }
}
