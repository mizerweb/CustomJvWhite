package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.List;
import one.me.stories.viewer.viewer.UserStoriesScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class eyg extends FrameLayout {
    public final UserStoriesScreen a;
    public final ua3 b;
    public final boolean c;
    public vyg d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public final GestureDetector i;

    public eyg(Context context, UserStoriesScreen userStoriesScreen, ua3 ua3Var, boolean z) {
        super(context);
        this.a = userStoriesScreen;
        this.b = ua3Var;
        this.c = z;
        this.i = new GestureDetector(context, new pi9(14, this));
    }

    public static final boolean a(eyg eygVar, MotionEvent motionEvent) {
        if (!eygVar.c) {
            return false;
        }
        float measuredWidth = eygVar.getMeasuredWidth() * 0.25f;
        float measuredWidth2 = eygVar.getMeasuredWidth() * 0.75f;
        float x = motionEvent.getX();
        return measuredWidth <= x && x <= measuredWidth2;
    }

    public static final void b(eyg eygVar, MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float measuredWidth = eygVar.getMeasuredWidth() * 0.25f;
        UserStoriesScreen userStoriesScreen = eygVar.a;
        if (x >= measuredWidth) {
            userStoriesScreen.H1().M();
            return;
        }
        gpi gpiVarH1 = userStoriesScreen.H1();
        String str = gpiVarH1.p;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "playPrev", null);
            }
        }
        if (gpiVarH1.d != null) {
            gpiVarH1.K(6);
            a8j.x(gpiVarH1.r1, ppi.a);
            return;
        }
        int iB = ((b8b) gpiVarH1.B.getValue()).b() - 1;
        if (iB < 0) {
            a8j.x(gpiVarH1.r1, lqi.a);
            return;
        }
        if (((lsg) ww3.u1(iB, (List) gpiVarH1.A.getValue())) instanceof hsg) {
            gpiVarH1.K(6);
        } else {
            gpiVarH1.O(6);
        }
        gpiVarH1.L();
        mjg mjgVar = gpiVarH1.B;
        ((b8b) mjgVar.getValue()).getClass();
        mjgVar.j(null, new b8b(iB, 0.0f));
    }

    public final void c() {
        ViewParent parent;
        if (this.f) {
            this.f = false;
            boolean z = this.g;
            UserStoriesScreen userStoriesScreen = this.a;
            if (!z) {
                userStoriesScreen.H1().O(1);
                return;
            }
            this.g = false;
            userStoriesScreen.H1().O(1);
            View view = userStoriesScreen.getView();
            if (view != null && (parent = view.getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
            userStoriesScreen.x1(true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00e3 A[EDGE_INSN: B:39:0x00e3->B:41:0x00e6 BREAK  A[LOOP:0: B:16:0x0048->B:38:0x00d9]] */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i;
        float f;
        float f2;
        int i2 = 1;
        if (motionEvent.getActionMasked() == 0) {
            c();
            this.e = 0;
            this.h = false;
            float x = motionEvent.getX();
            float measuredWidth = getMeasuredWidth();
            float f3 = 0.16f * measuredWidth;
            if (x >= f3 && x < measuredWidth - f3) {
                vyg vygVar = this.d;
                if (vygVar == null) {
                    i = 3;
                    break;
                }
                float x2 = motionEvent.getX();
                float y = motionEvent.getY();
                u8b u8bVar = vygVar.e;
                int width = vygVar.getWidth();
                int height = vygVar.getHeight();
                if (width <= 0 || height <= 0) {
                    i = 3;
                    break;
                }
                int i3 = u8bVar.b - 1;
                while (true) {
                    if (i3 < 0) {
                        i = 3;
                        break;
                    }
                    ryg rygVar = ((uyg) u8bVar.g(i3)).b;
                    dy8 dy8VarB = rygVar != null ? rygVar.b() : null;
                    if (dy8VarB != null) {
                        double d = dy8VarB.f;
                        float f4 = width;
                        int iK = gm0.K(dy8VarB.c * f4);
                        if (iK < i2) {
                            iK = i2;
                        }
                        float f5 = height;
                        int iK2 = gm0.K(dy8VarB.d * f5);
                        if (iK2 < i2) {
                            iK2 = i2;
                        }
                        float f6 = dy8VarB.a * f4;
                        float f7 = iK / 2.0f;
                        float fK = gm0.K(f6 - f7) + f7;
                        float f8 = dy8VarB.b * f5;
                        float f9 = iK2 / 2.0f;
                        float f10 = x2 - fK;
                        f = x2;
                        f2 = y;
                        double dK = y - (gm0.K(f8 - f9) + f9);
                        double dSin = (Math.sin(d) * dK) + (Math.cos(d) * ((double) f10));
                        double dCos = (Math.cos(d) * dK) + (Math.sin(d) * ((double) (-f10)));
                        if (dSin >= (-iK) / 2.0f && dSin < f7 && dCos >= (-iK2) / 2.0f && dCos < f9) {
                            i = 2;
                            break;
                        }
                    } else {
                        f = x2;
                        f2 = y;
                    }
                    i3--;
                    x2 = f;
                    y = f2;
                    i2 = 1;
                }
            } else {
                i = 1;
            }
            this.e = i;
            boolean asBoolean = this.b.getAsBoolean();
            this.h = asBoolean;
            if (asBoolean) {
                this.f = true;
                this.a.H1().K(1);
            }
        }
        int i4 = this.e;
        if (i4 == 0) {
            return super.dispatchTouchEvent(motionEvent);
        }
        boolean z = this.h && i4 != 2;
        boolean z2 = motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3;
        if (z2) {
            c();
        }
        if (i4 != 1) {
            super.dispatchTouchEvent(motionEvent);
        }
        if (z) {
            this.i.onTouchEvent(motionEvent);
        }
        if (!z2) {
            return true;
        }
        this.e = 0;
        this.h = false;
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (size == 0 || size2 == 0) {
            super.onMeasure(i, i2);
            return;
        }
        float f = size;
        float f2 = size2;
        if (f / f2 > 0.5625f) {
            size = (int) (f2 * 0.5625f);
        } else {
            size2 = (int) (f / 0.5625f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }
}
