package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class zg7 extends y69 {
    public final ej7 e;

    public zg7(ej7 ej7Var) {
        super(k45.i);
        this.e = ej7Var;
    }

    @Override // defpackage.nee
    public final int n(int i) {
        ni7 ni7Var = (ni7) F(i);
        if (ni7Var != null) {
            return ni7Var.a;
        }
        return 0;
    }

    @Override // defpackage.nee
    public final void u(lfe lfeVar, int i) {
        ri7 ri7Var = (ri7) lfeVar;
        ni7 ni7Var = (ni7) F(i);
        if (ni7Var == null) {
            return;
        }
        if ((ri7Var instanceof qi7) && (ni7Var instanceof ki7)) {
            qi7 qi7Var = (qi7) ri7Var;
            ki7 ki7Var = (ki7) ni7Var;
            kb9 kb9Var = ki7Var.c;
            View view = qi7Var.a;
            uy9 uy9Var = (uy9) view;
            ixi videoInfo = uy9Var.getVideoInfo();
            jb9 jb9Var = kb9Var.l;
            jb9 jb9Var2 = jb9.d;
            jb9 jb9Var3 = jb9.c;
            videoInfo.setVisibility((jb9Var == jb9Var3 || jb9Var == jb9Var2) ? 0 : 8);
            jb9 jb9Var4 = kb9Var.l;
            if (jb9Var4 == jb9Var3) {
                ixi videoInfo2 = uy9Var.getVideoInfo();
                videoInfo2.setText(videoInfo2.getContext().getString(R.string.media_settings_gif));
                videoInfo2.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                videoInfo2.setVisibility(0);
            } else if (jb9Var4 == jb9Var2) {
                uy9Var.getVideoInfo().a(ki7Var.n);
            }
            l1c draweeView = uy9Var.getDraweeView();
            Context context = view.getContext();
            Uri uri = ki7Var.g;
            w78 w78VarD = w78.d(ki7Var.l);
            w78VarD.h = ki7Var.m;
            w78VarD.d = ki7Var.d;
            int i2 = ki7Var.k;
            if (i2 != 0) {
                w78VarD.k = new svc(i2);
            }
            if (uri != null) {
                w78VarD.k = new hkc(context, uri);
            }
            l1c.j(draweeView, w78VarD.a(), null, 6);
            if (qi7Var.u.c.c) {
                npb checkButton = ((uy9) view).getCheckButton();
                if (ki7Var.i) {
                    checkButton.setEnabled(true);
                    checkButton.setNumber(ki7Var.h);
                } else {
                    checkButton.setNumber(0);
                    checkButton.setEnabled(false);
                }
                qe7.H(checkButton, 300L, new z36(qi7Var, 5, checkButton));
            }
        }
        qe7.H(ri7Var.a, 300L, new sk6(this, i, ni7Var, 1));
    }

    @Override // defpackage.nee
    public final lfe w(ViewGroup viewGroup, int i) {
        ej7 ej7Var = this.e;
        if (i != 5 && i != 15) {
            if (i != 6 && i != 16) {
                return new qi7(viewGroup.getContext(), ej7Var);
            }
            sb3 sb3Var = new sb3(viewGroup.getContext(), 1);
            sb3Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            sb3Var.setAlpha(0.0f);
            sb3Var.setBackgroundColor(-16777216);
            sb3Var.setClickable(false);
            sb3Var.setFocusable(false);
            sb3Var.setClipChildren(false);
            sb3Var.setClipToPadding(false);
            return new pi7(sb3Var);
        }
        ph7 ph7Var = ej7Var.c;
        if (ph7Var.i || ph7Var.j) {
            sb3 sb3Var2 = new sb3(viewGroup.getContext(), 1);
            sb3Var2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            sb3Var2.setAlpha(0.0f);
            sb3Var2.setBackgroundColor(-16777216);
            sb3Var2.setClickable(false);
            sb3Var2.setFocusable(false);
            sb3Var2.setClipChildren(false);
            sb3Var2.setClipToPadding(false);
            return new pi7(sb3Var2);
        }
        sb3 sb3Var3 = new sb3(viewGroup.getContext(), 1);
        sb3Var3.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        sb3Var3.setAlpha(0.0f);
        sb3Var3.setBackgroundColor(-16777216);
        sb3Var3.setClickable(false);
        sb3Var3.setFocusable(false);
        sb3Var3.setClipChildren(false);
        sb3Var3.setClipToPadding(false);
        return new pi7(sb3Var3);
    }
}
