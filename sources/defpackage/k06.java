package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import one.me.android.root.RootController;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.stories.edit.EditStoryScreen;
import one.me.stories.edit.SingleMediaViewerWidget;
import one.me.stories.edit.link.AddStoryLinkBottomSheet;
import one.me.stories.text.TextEditStoryWidget;
import one.me.videoeditor.trimslider.VideoTrimSliderWidget;
import org.apache.http.conn.params.ConnManagerParams;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class k06 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ EditStoryScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k06(lq4 lq4Var, EditStoryScreen editStoryScreen, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = editStoryScreen;
    }

    private final Object l(Object obj) {
        Object obj2 = this.f;
        ch3.d0(obj);
        t16 t16Var = (t16) obj2;
        boolean zD = cqk.d(t16Var, r16.a);
        EditStoryScreen editStoryScreen = this.g;
        if (zD) {
            zv8[] zv8VarArr = EditStoryScreen.A1;
            if (editStoryScreen.A1().getVisibility() == 0) {
                t5a t5aVar = editStoryScreen.C;
                if (t5aVar != null) {
                    t5aVar.e(false);
                }
                editStoryScreen.A1().setVisibility(8);
                editStoryScreen.x1().setVisibility(0);
                editStoryScreen.x1().setMediaTransformEnabled(true);
            }
        } else {
            if (!(t16Var instanceof s16)) {
                ore.o();
                return null;
            }
            Uri uri = ((s16) t16Var).a;
            t5a t5aVar2 = editStoryScreen.C;
            if (t5aVar2 != null) {
                t5aVar2.e(false);
            }
            editStoryScreen.x1().setVisibility(8);
            editStoryScreen.x1().setMediaTransformEnabled(false);
            ((zp3) editStoryScreen.w.m(editStoryScreen, EditStoryScreen.A1[15])).d("story_edit_trim_tag", new i06(editStoryScreen, 4));
            VideoTrimSliderWidget videoTrimSliderWidgetB1 = editStoryScreen.B1();
            if (videoTrimSliderWidgetB1 != null) {
                videoTrimSliderWidgetB1.p1().x = editStoryScreen.C1().v1;
            }
            VideoTrimSliderWidget videoTrimSliderWidgetB2 = editStoryScreen.B1();
            if (videoTrimSliderWidgetB2 != null) {
                videoTrimSliderWidgetB2.s1(Collections.singletonList(uri));
            }
            editStoryScreen.A1().setVisibility(0);
        }
        return sbi.a;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        EditStoryScreen editStoryScreen = this.g;
        switch (i) {
            case 0:
                k06 k06Var = new k06(lq4Var, editStoryScreen, 0);
                k06Var.f = obj;
                return k06Var;
            case 1:
                k06 k06Var2 = new k06(lq4Var, editStoryScreen, 1);
                k06Var2.f = obj;
                return k06Var2;
            case 2:
                k06 k06Var3 = new k06(lq4Var, editStoryScreen, 2);
                k06Var3.f = obj;
                return k06Var3;
            case 3:
                k06 k06Var4 = new k06(lq4Var, editStoryScreen, 3);
                k06Var4.f = obj;
                return k06Var4;
            case 4:
                k06 k06Var5 = new k06(lq4Var, editStoryScreen, 4);
                k06Var5.f = obj;
                return k06Var5;
            case 5:
                k06 k06Var6 = new k06(lq4Var, editStoryScreen, 5);
                k06Var6.f = obj;
                return k06Var6;
            case 6:
                k06 k06Var7 = new k06(lq4Var, editStoryScreen, 6);
                k06Var7.f = obj;
                return k06Var7;
            case 7:
                k06 k06Var8 = new k06(lq4Var, editStoryScreen, 7);
                k06Var8.f = obj;
                return k06Var8;
            case 8:
                k06 k06Var9 = new k06(lq4Var, editStoryScreen, 8);
                k06Var9.f = obj;
                return k06Var9;
            case 9:
                k06 k06Var10 = new k06(lq4Var, editStoryScreen, 9);
                k06Var10.f = obj;
                return k06Var10;
            case 10:
                k06 k06Var11 = new k06(lq4Var, editStoryScreen, 10);
                k06Var11.f = obj;
                return k06Var11;
            case 11:
                k06 k06Var12 = new k06(lq4Var, editStoryScreen, 11);
                k06Var12.f = obj;
                return k06Var12;
            case 12:
                k06 k06Var13 = new k06(lq4Var, editStoryScreen, 12);
                k06Var13.f = obj;
                return k06Var13;
            case 13:
                k06 k06Var14 = new k06(lq4Var, editStoryScreen, 13);
                k06Var14.f = obj;
                return k06Var14;
            case 14:
                k06 k06Var15 = new k06(lq4Var, editStoryScreen, 14);
                k06Var15.f = obj;
                return k06Var15;
            case 15:
                k06 k06Var16 = new k06(lq4Var, editStoryScreen, 15);
                k06Var16.f = obj;
                return k06Var16;
            case 16:
                k06 k06Var17 = new k06(lq4Var, editStoryScreen, 16);
                k06Var17.f = obj;
                return k06Var17;
            case 17:
                k06 k06Var18 = new k06(lq4Var, editStoryScreen, 17);
                k06Var18.f = obj;
                return k06Var18;
            case 18:
                k06 k06Var19 = new k06(lq4Var, editStoryScreen, 18);
                k06Var19.f = obj;
                return k06Var19;
            case 19:
                k06 k06Var20 = new k06(lq4Var, editStoryScreen, 19);
                k06Var20.f = obj;
                return k06Var20;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                k06 k06Var21 = new k06(lq4Var, editStoryScreen, 20);
                k06Var21.f = obj;
                return k06Var21;
            default:
                k06 k06Var22 = new k06(lq4Var, editStoryScreen, 21);
                k06Var22.f = obj;
                return k06Var22;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((k06) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((k06) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((k06) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 3:
                ((k06) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 4:
                ((k06) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 5:
                ((k06) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 6:
                ((k06) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 7:
                ((k06) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 8:
                ((k06) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 9:
                ((k06) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 10:
                ((k06) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 11:
                ((k06) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 12:
                ((k06) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 13:
                ((k06) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 14:
                ((k06) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 15:
                ((k06) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 16:
                ((k06) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 17:
                ((k06) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 18:
                ((k06) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 19:
                ((k06) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                ((k06) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((k06) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x023d  */
    /* JADX WARN: Code duplicated, block: B:135:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:348:0x088c  */
    /* JADX WARN: Code duplicated, block: B:361:0x08f7  */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws IllegalAccessException, InvocationTargetException {
        ValueAnimator valueAnimator;
        float f;
        boolean z;
        t5a t5aVar;
        int i = -1;
        int i2 = 3;
        int i3 = 5;
        int i4 = 6;
        final int i5 = 1;
        final int i6 = 0;
        switch (this.e) {
            case 0:
                Object obj2 = this.f;
                ch3.d0(obj);
                b16 b16Var = (b16) obj2;
                EditStoryScreen editStoryScreen = this.g;
                je9 je9Var = je9.f;
                String str = editStoryScreen.a;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var2 = je9.d;
                    if (a4cVar.b(je9Var2)) {
                        a4cVar.c(je9Var2, str, "handleEvent: " + b16Var, null);
                    }
                }
                if (b16Var instanceof q06) {
                    h8c h8cVar = new h8c(editStoryScreen);
                    h8cVar.m(((q06) b16Var).a);
                    h8cVar.h(new w8c(R.drawable.icon_warning));
                    h8cVar.p();
                    psg.b.j();
                } else if (b16Var instanceof r06) {
                    r06 r06Var = (r06) b16Var;
                    int i7 = r06Var.a;
                    if (i7 == 5) {
                        t5a t5aVar2 = editStoryScreen.C;
                        if ((t5aVar2 != null ? t5aVar2.h : 0) != i7) {
                            editStoryScreen.G1(r06Var.b);
                        }
                    }
                    if (editStoryScreen.C1().N1.a.getValue() != wr4.c) {
                        editStoryScreen.H1(r06Var.a);
                    }
                } else if (b16Var instanceof z06) {
                    z06 z06Var = (z06) b16Var;
                    g8c g8cVar = editStoryScreen.B;
                    if (g8cVar != null) {
                        g8cVar.a();
                    }
                    h8c h8cVar2 = z06Var.c != null ? new h8c((qm0) editStoryScreen.n.m(editStoryScreen, EditStoryScreen.A1[6])) : new h8c(editStoryScreen);
                    h8cVar2.m(z06Var.a);
                    h8cVar2.a(null);
                    Integer num = z06Var.b;
                    if (num != null) {
                        h8cVar2.h(new w8c(num.intValue()));
                    }
                    Integer num2 = z06Var.c;
                    if (num2 != null) {
                        h8cVar2.c(new o8c(0, 0, num2.intValue(), 11));
                    }
                    editStoryScreen.B = h8cVar2.p();
                } else if (cqk.d(b16Var, a16.a)) {
                    e3j e3jVarW1 = editStoryScreen.w1();
                    if (e3jVarW1 == null) {
                        String str2 = editStoryScreen.a;
                        phb phbVar = new phb("EditStoryScreen: no video player given");
                        a4c a4cVar2 = gm0.f;
                        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                            a4cVar2.c(je9Var, str2, "onToggleVideoPlay: no video player", phbVar);
                        }
                    } else if (e3jVarW1.d()) {
                        e3jVarW1.pause();
                    } else {
                        e3jVarW1.play();
                    }
                } else if (b16Var instanceof s06) {
                    Object obj3 = (Drawable) editStoryScreen.C1().E.getValue();
                    Animatable animatable = obj3 instanceof Animatable ? (Animatable) obj3 : null;
                    if (animatable != null) {
                        animatable.start();
                    }
                } else if (b16Var instanceof x06) {
                    VideoTrimSliderWidget videoTrimSliderWidgetB1 = editStoryScreen.B1();
                    if (videoTrimSliderWidgetB1 != null) {
                        x06 x06Var = (x06) b16Var;
                        videoTrimSliderWidgetB1.r1(x06Var.a, x06Var.b);
                    }
                } else if (b16Var instanceof w06) {
                    int i8 = ((w06) b16Var).a;
                    y8j y8jVarR1 = editStoryScreen.r1();
                    int currentItem = y8jVarR1.getCurrentItem();
                    if (currentItem != i8 && editStoryScreen.getView() != null) {
                        float width = (i8 > currentItem ? 1 : -1) * y8jVarR1.getWidth();
                        p26 p26VarC1 = editStoryScreen.C1();
                        int width2 = y8jVarR1.getWidth();
                        int height = y8jVarR1.getHeight();
                        sgg sggVar = p26VarC1.o1;
                        if (sggVar != null) {
                            sggVar.b(null);
                        }
                        Bitmap bitmap = (Bitmap) p26VarC1.n1.get();
                        long j = p26VarC1.p1 + 1;
                        p26VarC1.p1 = j;
                        p26VarC1.o1 = a8j.t(p26VarC1, ((n0c) p26VarC1.H()).c(), new j26(bitmap, width2, height, p26VarC1, j, currentItem, i8, width, null), 2);
                    }
                } else if (b16Var instanceof p06) {
                    p06 p06Var = (p06) b16Var;
                    if (!p06Var.a.isRecycled()) {
                        y8j y8jVarR2 = editStoryScreen.r1();
                        Object parent = y8jVarR2.getParent();
                        View view = parent instanceof View ? (View) parent : null;
                        if (view == null) {
                            String str3 = editStoryScreen.a;
                            a4c a4cVar3 = gm0.f;
                            if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                                a4cVar3.c(je9Var, str3, "pager parent could not be cast as view, returning early", null);
                            }
                        } else if (p06Var.a.isRecycled()) {
                            String str4 = editStoryScreen.a;
                            a4c a4cVar4 = gm0.f;
                            if (a4cVar4 != null && a4cVar4.b(je9Var)) {
                                a4cVar4.c(je9Var, str4, "bitmap is already recycled, returning early", null);
                            }
                        } else {
                            y8jVarR2.draw(new Canvas(p06Var.a));
                            sag sagVar = new sag(y8jVarR2.getResources(), p06Var.a);
                            view.setBackground(sagVar);
                            y8jVarR2.h(p06Var.b, false);
                            y8jVarR2.setTranslationX(p06Var.c);
                            fwg fwgVar = editStoryScreen.J;
                            float f2 = p06Var.c;
                            dx4 dx4Var = new dx4(editStoryScreen, i3, view);
                            ValueAnimator valueAnimator2 = (ValueAnimator) fwgVar.i;
                            if (valueAnimator2 != null) {
                                lsk.a(valueAnimator2);
                            }
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            valueAnimatorOfFloat.setDuration(300L);
                            valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
                            valueAnimatorOfFloat.addUpdateListener(new mj(y8jVarR2, f2, sagVar, i2));
                            valueAnimatorOfFloat.addListener(new d7(fwgVar, i4, dx4Var));
                            valueAnimatorOfFloat.start();
                            fwgVar.i = valueAnimatorOfFloat;
                        }
                    }
                } else if (cqk.d(b16Var, y06.a)) {
                    mrk.e(editStoryScreen);
                } else if (cqk.d(b16Var, t06.a)) {
                    editStoryScreen.D1(true);
                } else if (!cqk.d(b16Var, u06.a) && !(b16Var instanceof v06)) {
                    ore.o();
                    return null;
                }
                return sbi.a;
            case 1:
                Object obj4 = this.f;
                ch3.d0(obj);
                long jLongValue = ((Number) obj4).longValue();
                EditStoryScreen editStoryScreen2 = this.g;
                zv8[] zv8VarArr = EditStoryScreen.A1;
                e3j e3jVarW2 = editStoryScreen2.w1();
                if (e3jVarW2 != null) {
                    long duration = e3jVarW2.getDuration();
                    VideoTrimSliderWidget videoTrimSliderWidgetB2 = editStoryScreen2.B1();
                    if (videoTrimSliderWidgetB2 != null) {
                        videoTrimSliderWidgetB2.q1(duration, jLongValue);
                    }
                    if (duration > 0) {
                        float f3 = duration;
                        if (jLongValue + 50 >= ((long) (((Number) editStoryScreen2.C1().z1.a.getValue()).floatValue() * f3))) {
                            e3jVarW2.seekTo((long) (((Number) editStoryScreen2.C1().x1.a.getValue()).floatValue() * f3));
                        }
                    }
                }
                return sbi.a;
            case 2:
                Object obj5 = this.f;
                ch3.d0(obj);
                u8b u8bVar = (u8b) obj5;
                EditStoryScreen editStoryScreen3 = this.g;
                zv8[] zv8VarArr2 = EditStoryScreen.A1;
                ((xph) editStoryScreen3.X.getValue()).m.b(u8bVar.e(), null);
                String str5 = editStoryScreen3.G;
                if (str5 != null) {
                    Object[] objArr = u8bVar.a;
                    int i9 = u8bVar.b;
                    for (int i10 = 0; i10 < i9; i10++) {
                        if (cqk.d(((aoh) objArr[i10]).getName(), str5)) {
                            i = i10;
                            if (i >= 0) {
                                editStoryScreen3.r1().h(i, false);
                            }
                            editStoryScreen3.G = null;
                        }
                    }
                    if (i >= 0) {
                        editStoryScreen3.r1().h(i, false);
                    }
                    editStoryScreen3.G = null;
                }
                return sbi.a;
            case 3:
                je9 je9Var3 = je9.f;
                Object obj6 = this.f;
                ch3.d0(obj);
                List list = (List) obj6;
                Iterator it = list.iterator();
                int i11 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i11 = -1;
                    } else if (!((zl0) it.next()).a) {
                        i11++;
                    }
                }
                EditStoryScreen editStoryScreen4 = this.g;
                if (i11 == -1) {
                    String str6 = editStoryScreen4.a;
                    a4c a4cVar5 = gm0.f;
                    if (a4cVar5 != null && a4cVar5.b(je9Var3)) {
                        a4cVar5.c(je9Var3, str6, "selected background is under the -1 position, returning early", null);
                    }
                } else {
                    zv8[] zv8VarArr3 = EditStoryScreen.A1;
                    editStoryScreen4.q1().getSelectorAdapter().H(list);
                    boh bohVarQ1 = this.g.q1();
                    if (i11 == -1) {
                        String str7 = bohVarQ1.m2;
                        a4c a4cVar6 = gm0.f;
                        if (a4cVar6 != null && a4cVar6.b(je9Var3)) {
                            a4cVar6.c(je9Var3, str7, c0a.k(i11, "background selector: invalid position: ", ", returning early"), null);
                        }
                    } else {
                        int iZ0 = bohVarQ1.k2.Z0();
                        int iX0 = bohVarQ1.k2.X0();
                        if (iX0 != -1 && iZ0 != -1) {
                            if (bohVarQ1.getChildCount() <= 0) {
                                String str8 = bohVarQ1.m2;
                                a4c a4cVar7 = gm0.f;
                                if (a4cVar7 != null && a4cVar7.b(je9Var3)) {
                                    a4cVar7.c(je9Var3, str8, "background selector: invalid child count, returning early", null);
                                }
                            } else {
                                int width3 = bohVarQ1.getChildAt(0).getWidth();
                                if (i11 >= iZ0 - 1 && bohVarQ1.canScrollHorizontally(1)) {
                                    valueAnimator = bohVarQ1.l2;
                                    if (valueAnimator != null) {
                                        valueAnimator.cancel();
                                    }
                                    ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, width3);
                                    valueAnimatorOfInt.setDuration(200L);
                                    valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
                                    valueAnimatorOfInt.addUpdateListener(new mk(bohVarQ1, 10, new ufe()));
                                    valueAnimatorOfInt.start();
                                    bohVarQ1.l2 = valueAnimatorOfInt;
                                } else if (i11 <= iX0 + 1 && bohVarQ1.canScrollHorizontally(-1)) {
                                    width3 = -width3;
                                    valueAnimator = bohVarQ1.l2;
                                    if (valueAnimator != null) {
                                        valueAnimator.cancel();
                                    }
                                    ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(0, width3);
                                    valueAnimatorOfInt2.setDuration(200L);
                                    valueAnimatorOfInt2.setInterpolator(new AccelerateDecelerateInterpolator());
                                    valueAnimatorOfInt2.addUpdateListener(new mk(bohVarQ1, 10, new ufe()));
                                    valueAnimatorOfInt2.start();
                                    bohVarQ1.l2 = valueAnimatorOfInt2;
                                }
                            }
                        }
                    }
                }
                return sbi.a;
            case 4:
                Object obj7 = this.f;
                ch3.d0(obj);
                boolean zBooleanValue = ((Boolean) obj7).booleanValue();
                EditStoryScreen editStoryScreen5 = this.g;
                zv8[] zv8VarArr4 = EditStoryScreen.A1;
                ((qm0) editStoryScreen5.n.m(editStoryScreen5, EditStoryScreen.A1[6])).setSwipeBlocked(zBooleanValue);
                return sbi.a;
            case 5:
                Object obj8 = this.f;
                ch3.d0(obj);
                boolean zBooleanValue2 = ((Boolean) obj8).booleanValue();
                EditStoryScreen editStoryScreen6 = this.g;
                fwg fwgVar2 = editStoryScreen6.J;
                boh bohVarQ2 = editStoryScreen6.q1();
                fwgVar2.getClass();
                if (bohVarQ2.s) {
                    ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) fwgVar2.e;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                    }
                    if (zBooleanValue2) {
                        float height2 = bohVarQ2.getHeight() > 0 ? bohVarQ2.getHeight() : 200.0f;
                        bohVarQ2.setVisibility(0);
                        bohVarQ2.setTranslationY(height2);
                        bohVarQ2.setAlpha(0.0f);
                        ViewPropertyAnimator viewPropertyAnimatorWithEndAction = bohVarQ2.animate().translationY(0.0f).alpha(1.0f).setDuration(300L).setInterpolator(new AccelerateDecelerateInterpolator()).withEndAction(new dwg(fwgVar2, 0));
                        fwgVar2.e = viewPropertyAnimatorWithEndAction;
                        if (viewPropertyAnimatorWithEndAction != null) {
                            viewPropertyAnimatorWithEndAction.start();
                        }
                    } else {
                        ViewPropertyAnimator viewPropertyAnimatorWithEndAction2 = bohVarQ2.animate().translationY(bohVarQ2.getHeight() > 0 ? bohVarQ2.getHeight() : 200.0f).alpha(0.0f).setDuration(300L).setInterpolator(new AccelerateDecelerateInterpolator()).withEndAction(new yde(fwgVar2, 29, bohVarQ2));
                        fwgVar2.e = viewPropertyAnimatorWithEndAction2;
                        if (viewPropertyAnimatorWithEndAction2 != null) {
                            viewPropertyAnimatorWithEndAction2.start();
                        }
                    }
                }
                return sbi.a;
            case 6:
                Object obj9 = this.f;
                ch3.d0(obj);
                boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                EditStoryScreen editStoryScreen7 = this.g;
                zv8[] zv8VarArr5 = EditStoryScreen.A1;
                editStoryScreen7.r1().setVisibility(zBooleanValue3 ? 0 : 8);
                editStoryScreen7.s1().setVisibility(!zBooleanValue3 ? 0 : 8);
                ((ImageView) editStoryScreen7.k.m(editStoryScreen7, EditStoryScreen.A1[4])).setVisibility(zBooleanValue3 ? 8 : 0);
                return sbi.a;
            case 7:
                Object obj10 = this.f;
                ch3.d0(obj);
                boolean zBooleanValue4 = ((Boolean) obj10).booleanValue();
                EditStoryScreen editStoryScreen8 = this.g;
                zv8[] zv8VarArr6 = EditStoryScreen.A1;
                ((ac) editStoryScreen8.s.m(editStoryScreen8, EditStoryScreen.A1[11])).setVisibility(zBooleanValue4 ? 0 : 8);
                return sbi.a;
            case 8:
                Object obj11 = this.f;
                ch3.d0(obj);
                boolean zBooleanValue5 = ((Boolean) obj11).booleanValue();
                EditStoryScreen editStoryScreen9 = this.g;
                zv8[] zv8VarArr7 = EditStoryScreen.A1;
                f = zBooleanValue5 ? 0.0f : 1.0f;
                e3j e3jVarW3 = editStoryScreen9.w1();
                if (e3jVarW3 != null) {
                    e3jVarW3.b(f);
                }
                return sbi.a;
            case 9:
                Object obj12 = this.f;
                ch3.d0(obj);
                Float f4 = (Float) obj12;
                EditStoryScreen editStoryScreen10 = this.g;
                j8e j8eVar = editStoryScreen10.u;
                j8e j8eVar2 = editStoryScreen10.t;
                zv8[] zv8VarArr8 = EditStoryScreen.A1;
                if (f4 == null) {
                    zv8[] zv8VarArr9 = EditStoryScreen.A1;
                    ((View) j8eVar2.m(editStoryScreen10, zv8VarArr9[12])).setVisibility(8);
                    ((r6c) j8eVar.m(editStoryScreen10, zv8VarArr9[13])).b(0, false);
                } else {
                    zv8[] zv8VarArr10 = EditStoryScreen.A1;
                    ((r6c) j8eVar.m(editStoryScreen10, zv8VarArr10[13])).b((int) (f4.floatValue() * 100.0f), true);
                    ((View) j8eVar2.m(editStoryScreen10, zv8VarArr10[12])).setVisibility(0);
                }
                return sbi.a;
            case 10:
                Object obj13 = this.f;
                ch3.d0(obj);
                omh omhVar = (omh) obj13;
                EditStoryScreen editStoryScreen11 = this.g;
                j8e j8eVar3 = editStoryScreen11.A;
                j8e j8eVar4 = editStoryScreen11.z;
                zv8[] zv8VarArr11 = EditStoryScreen.A1;
                if (cqk.d(omhVar, mmh.a)) {
                    zv8[] zv8VarArr12 = EditStoryScreen.A1;
                    br4 br4VarC = rx8.C(((zp3) j8eVar4.m(editStoryScreen11, zv8VarArr12[18])).a);
                    TextEditStoryWidget textEditStoryWidget = br4VarC instanceof TextEditStoryWidget ? (TextEditStoryWidget) br4VarC : null;
                    if (textEditStoryWidget != null) {
                        textEditStoryWidget.A = false;
                        nl9.c(textEditStoryWidget.s1());
                        textEditStoryWidget.r1();
                    }
                    ((tp2) j8eVar3.m(editStoryScreen11, zv8VarArr12[19])).setVisibility(8);
                    if (editStoryScreen11.z1()) {
                        editStoryScreen11.y1().setVisibility(0);
                    }
                    editStoryScreen11.x1().setEditingId(null);
                } else {
                    if (!(omhVar instanceof nmh)) {
                        ore.o();
                        return null;
                    }
                    editStoryScreen11.y1().setVisibility(8);
                    zv8[] zv8VarArr13 = EditStoryScreen.A1;
                    br4 br4VarC2 = rx8.C(((zp3) j8eVar4.m(editStoryScreen11, zv8VarArr13[18])).a);
                    TextEditStoryWidget textEditStoryWidget2 = br4VarC2 instanceof TextEditStoryWidget ? (TextEditStoryWidget) br4VarC2 : null;
                    if (textEditStoryWidget2 != null) {
                        textEditStoryWidget2.o1();
                        textEditStoryWidget2.A = true;
                        int i12 = uw8.a;
                        textEditStoryWidget2.p1(uw8.a(textEditStoryWidget2.getContext()));
                        textEditStoryWidget2.s1().requestFocus();
                        nl9.d(textEditStoryWidget2.s1(), true);
                    } else {
                        zp3 zp3Var = (zp3) j8eVar4.m(editStoryScreen11, zv8VarArr13[18]);
                        hve hveVar = zp3Var.a;
                        if (!cqk.d(zp3Var.b(), "story_edit_text_editor_tag")) {
                            hveVar.S(false);
                            lve lveVarE = oc9.e(new TextEditStoryWidget(editStoryScreen11.e), null, null);
                            lveVarE.e("story_edit_text_editor_tag");
                            hveVar.T(lveVarE);
                        }
                    }
                    ((tp2) j8eVar3.m(editStoryScreen11, zv8VarArr13[19])).setVisibility(0);
                    editStoryScreen11.x1().setEditingId(editStoryScreen11.C1().s.b);
                }
                return sbi.a;
            case 11:
                Object obj14 = this.f;
                ch3.d0(obj);
                EditStoryScreen editStoryScreen12 = this.g;
                zv8[] zv8VarArr14 = EditStoryScreen.A1;
                editStoryScreen12.x1().setLayers((List) obj14);
                return sbi.a;
            case 12:
                Object obj15 = this.f;
                ch3.d0(obj);
                EditStoryScreen editStoryScreen13 = this.g;
                zv8[] zv8VarArr15 = EditStoryScreen.A1;
                editStoryScreen13.x1().setSelectedId((Long) obj15);
                return sbi.a;
            case 13:
                Object obj16 = this.f;
                ch3.d0(obj);
                myg mygVar = (myg) obj16;
                EditStoryScreen editStoryScreen14 = this.g;
                j8e j8eVar5 = editStoryScreen14.l;
                fwg fwgVar3 = editStoryScreen14.J;
                if (cqk.d(mygVar, lyg.a)) {
                    final fy8 fy8VarV1 = editStoryScreen14.v1();
                    fy8VarV1.a();
                    ImageView imageView = fy8VarV1.p;
                    fy8VarV1.n = imageView;
                    imageView.animate().alpha(0.0f).setDuration(300L).withEndAction(new Runnable() { // from class: ey8
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i13 = i6;
                            fy8 fy8Var = fy8VarV1;
                            switch (i13) {
                                case 0:
                                    ImageView imageView2 = fy8Var.p;
                                    fy8Var.n = null;
                                    if (fy8Var.isAttachedToWindow()) {
                                        imageView2.setVisibility(8);
                                        Drawable drawable = imageView2.getDrawable();
                                        AnimatedVectorDrawable animatedVectorDrawable = drawable instanceof AnimatedVectorDrawable ? (AnimatedVectorDrawable) drawable : null;
                                        if (animatedVectorDrawable != null) {
                                            animatedVectorDrawable.stop();
                                        }
                                        imageView2.setImageResource(R.drawable.avd_delete_hover_in);
                                        break;
                                    }
                                    break;
                                default:
                                    fy8Var.o = null;
                                    if (fy8Var.isAttachedToWindow()) {
                                        fy8Var.setVisibility(8);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }).start();
                    fy8VarV1.o = fy8VarV1;
                    fy8VarV1.animate().alpha(0.0f).setDuration(300L).withEndAction(new Runnable() { // from class: ey8
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i13 = i5;
                            fy8 fy8Var = fy8VarV1;
                            switch (i13) {
                                case 0:
                                    ImageView imageView2 = fy8Var.p;
                                    fy8Var.n = null;
                                    if (fy8Var.isAttachedToWindow()) {
                                        imageView2.setVisibility(8);
                                        Drawable drawable = imageView2.getDrawable();
                                        AnimatedVectorDrawable animatedVectorDrawable = drawable instanceof AnimatedVectorDrawable ? (AnimatedVectorDrawable) drawable : null;
                                        if (animatedVectorDrawable != null) {
                                            animatedVectorDrawable.stop();
                                        }
                                        imageView2.setImageResource(R.drawable.avd_delete_hover_in);
                                        break;
                                    }
                                    break;
                                default:
                                    fy8Var.o = null;
                                    if (fy8Var.isAttachedToWindow()) {
                                        fy8Var.setVisibility(8);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }).start();
                    fwgVar3.b(editStoryScreen14.y1(), (ViewGroup) j8eVar5.m(editStoryScreen14, EditStoryScreen.A1[5]), true);
                } else {
                    if (!(mygVar instanceof kyg)) {
                        ore.o();
                        return null;
                    }
                    fy8 fy8VarV2 = editStoryScreen14.v1();
                    fy8VarV2.a();
                    ImageView imageView2 = fy8VarV2.p;
                    Drawable drawable = imageView2.getDrawable();
                    AnimatedVectorDrawable animatedVectorDrawable = drawable instanceof AnimatedVectorDrawable ? (AnimatedVectorDrawable) drawable : null;
                    if (animatedVectorDrawable != null) {
                        animatedVectorDrawable.stop();
                    }
                    imageView2.setImageResource(R.drawable.avd_delete_hover_in);
                    imageView2.setVisibility(0);
                    imageView2.setAlpha(1.0f);
                    fy8VarV2.setVisibility(0);
                    fy8VarV2.setAlpha(1.0f);
                    fwgVar3.b(editStoryScreen14.y1(), (ViewGroup) j8eVar5.m(editStoryScreen14, EditStoryScreen.A1[5]), false);
                    editStoryScreen14.v1().getDeleteIcon().addOnLayoutChangeListener(new xc0(i4, editStoryScreen14));
                }
                return sbi.a;
            case 14:
                Object obj17 = this.f;
                ch3.d0(obj);
                rbb rbbVar = (rbb) obj17;
                EditStoryScreen editStoryScreen15 = this.g;
                zv8[] zv8VarArr16 = EditStoryScreen.A1;
                if (cqk.d(rbbVar, rt3.b)) {
                    editStoryScreen15.p1();
                } else if (rbbVar instanceof g06) {
                    g06 g06Var = (g06) rbbVar;
                    if (g06Var instanceof e06) {
                        psg psgVar = psg.b;
                        e06 e06Var = (e06) g06Var;
                        String str9 = e06Var.b;
                        Long l = e06Var.c;
                        o65.c(psgVar.b(), ":photo-editor", n1g.i(new ylc("image_uri", str9), new ylc("mode", "STORIES"), new ylc("media_id", l != null ? String.valueOf(l.longValue()) : null)), null, 4);
                    } else if (g06Var instanceof d06) {
                        d06 d06Var = (d06) g06Var;
                        o65.c(psg.b.b(), ":media-editor/crop", n1g.i(new ylc("image_uri", d06Var.b), new ylc("file_path", d06Var.c), new ylc("mode", "ROUNDED_RECT"), new ylc("stories_mode", "true")), null, 4);
                    } else {
                        if (!(g06Var instanceof f06)) {
                            ore.o();
                            return null;
                        }
                        zv8[] zv8VarArr17 = BottomSheetWidget.t;
                        AddStoryLinkBottomSheet addStoryLinkBottomSheet = new AddStoryLinkBottomSheet(editStoryScreen15.e, editStoryScreen15.K);
                        addStoryLinkBottomSheet.setTargetController(editStoryScreen15);
                        br4 parentController = editStoryScreen15;
                        while (parentController.getParentController() != null) {
                            parentController = parentController.getParentController();
                        }
                        RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
                        hve hveVarU1 = rootController != null ? rootController.u1() : null;
                        if (hveVarU1 != null) {
                            lve lveVar = new lve(addStoryLinkBottomSheet, null, null, null, false, -1);
                            p.k(false, lveVar, true, "BottomSheetWidget");
                            hveVarU1.I(lveVar);
                        }
                    }
                } else if (rbbVar instanceof i65) {
                    psg.b.e((i65) rbbVar);
                }
                return sbi.a;
            case 15:
                Object obj18 = this.f;
                ch3.d0(obj);
                f16 f16Var = (f16) obj18;
                EditStoryScreen editStoryScreen16 = this.g;
                zv8[] zv8VarArr18 = EditStoryScreen.A1;
                if (!cqk.d(f16Var, c16.a) && !cqk.d(f16Var, d16.a)) {
                    if (!(f16Var instanceof e16)) {
                        ore.o();
                        return null;
                    }
                    e16 e16Var = (e16) f16Var;
                    l1c l1cVarS1 = editStoryScreen16.s1();
                    Uri uri = e16Var.a.b;
                    ((wj7) l1cVarS1.getHierarchy()).h(i1f.l);
                    l1c.j(l1cVarS1, ((rq9) editStoryScreen16.g.getValue()).a(uri), null, 6);
                    int iOrdinal = e16Var.a.l.ordinal();
                    if (iOrdinal == 0) {
                        editStoryScreen16.p1();
                    } else if (iOrdinal == 1) {
                        ((ImageView) editStoryScreen16.k.m(editStoryScreen16, EditStoryScreen.A1[4])).setImageResource(R.drawable.icon_crop);
                        sgg sggVar2 = editStoryScreen16.D;
                        if (sggVar2 != null) {
                            sggVar2.b(null);
                        }
                        zp3 zp3VarT1 = editStoryScreen16.t1();
                        hve hveVar2 = zp3VarT1.a;
                        if (!cqk.d(zp3VarT1.b(), "story_edit_photo_tag")) {
                            hveVar2.S(false);
                            lve lveVarE2 = oc9.e(new SingleMediaViewerWidget(editStoryScreen16.e, false), null, null);
                            lveVarE2.e("story_edit_photo_tag");
                            hveVar2.T(lveVarE2);
                        }
                    } else if (iOrdinal == 2) {
                        editStoryScreen16.p1();
                    } else {
                        if (iOrdinal != 3) {
                            ore.o();
                            return null;
                        }
                        ((ImageView) editStoryScreen16.k.m(editStoryScreen16, EditStoryScreen.A1[4])).setImageResource(R.drawable.ic_trim_video);
                        br4 br4VarC3 = rx8.C(editStoryScreen16.t1().a);
                        SingleMediaViewerWidget singleMediaViewerWidget = br4VarC3 instanceof SingleMediaViewerWidget ? (SingleMediaViewerWidget) br4VarC3 : null;
                        if (singleMediaViewerWidget != null) {
                            vv vvVar = singleMediaViewerWidget.e;
                            zv8 zv8Var = SingleMediaViewerWidget.f[1];
                            if (((Boolean) vvVar.a(singleMediaViewerWidget)).booleanValue()) {
                                z = true;
                            } else {
                                z = false;
                            }
                        } else {
                            z = false;
                        }
                        fvi fviVar = e16Var.b;
                        boolean z2 = fviVar != null && fviVar.e;
                        if (z) {
                            sgg sggVar3 = editStoryScreen16.D;
                            if (sggVar3 == null || !sggVar3.isActive()) {
                                editStoryScreen16.F1();
                            }
                        } else {
                            zp3 zp3VarT2 = editStoryScreen16.t1();
                            hve hveVar3 = zp3VarT2.a;
                            if (!cqk.d(zp3VarT2.b(), "story_edit_video_tag")) {
                                hveVar3.S(false);
                                lve lveVarE3 = oc9.e(new SingleMediaViewerWidget(editStoryScreen16.e, true), null, null);
                                lveVarE3.e("story_edit_video_tag");
                                hveVar3.T(lveVarE3);
                            }
                            editStoryScreen16.F1();
                        }
                        f = z2 ? 0.0f : 1.0f;
                        e3j e3jVarW4 = editStoryScreen16.w1();
                        if (e3jVarW4 != null) {
                            e3jVarW4.b(f);
                        }
                    }
                    br4 br4VarC4 = rx8.C(editStoryScreen16.t1().a);
                    View view2 = br4VarC4 != null ? br4VarC4.getView() : null;
                    a6a a6aVar = editStoryScreen16.x1;
                    if ((a6aVar != null ? a6aVar.g : null) != view2) {
                        if (view2 != null) {
                            a6a a6aVar2 = new a6a(view2, yl5.d().getDisplayMetrics().density * 24.0f);
                            o6a o6aVar = (o6a) editStoryScreen16.C1().u.a.getValue();
                            if (csk.c(o6aVar) != null) {
                                float f5 = o6aVar.a;
                                float f6 = o6aVar.b;
                                float f7 = o6aVar.c;
                                float f8 = o6aVar.d;
                                View view3 = a6aVar2.g;
                                WeakHashMap weakHashMap = i7j.a;
                                if (!view3.isLaidOut() || view3.isLayoutRequested()) {
                                    view3.addOnLayoutChangeListener(new z5a(a6aVar2, f5, f6, f7, f8));
                                } else {
                                    a6aVar2.n = true;
                                    a6aVar2.j = f5;
                                    a6aVar2.k = f6;
                                    a6aVar2.l = f7;
                                    a6aVar2.m = f8;
                                    a6aVar2.s();
                                }
                            }
                            editStoryScreen16.x1 = a6aVar2;
                            editStoryScreen16.x1().setMediaLayer(editStoryScreen16.x1);
                        } else {
                            String str10 = editStoryScreen16.a;
                            a4c a4cVar8 = gm0.f;
                            if (a4cVar8 != null) {
                                je9 je9Var4 = je9.f;
                                if (a4cVar8.b(je9Var4)) {
                                    a4cVar8.c(je9Var4, str10, "We couldn't find a view to animate gestures for media = " + e16Var.a.l, null);
                                }
                            }
                        }
                    }
                }
                return sbi.a;
            case 16:
                Object obj19 = this.f;
                ch3.d0(obj);
                EditStoryScreen editStoryScreen17 = this.g;
                zv8[] zv8VarArr19 = EditStoryScreen.A1;
                boolean zBooleanValue6 = ((Boolean) ((gjg) editStoryScreen17.C1().t1.getValue()).getValue()).booleanValue();
                int iOrdinal2 = ((wr4) obj19).ordinal();
                if (iOrdinal2 == 0) {
                    t5a t5aVar3 = editStoryScreen17.C;
                    if (t5aVar3 != null) {
                        t5aVar3.e(true);
                    }
                    editStoryScreen17.C1().O();
                } else if (iOrdinal2 == 1) {
                    if (!zBooleanValue6 && (t5aVar = editStoryScreen17.C) != null) {
                        t5aVar.e(false);
                    }
                    editStoryScreen17.C1().F();
                } else if (iOrdinal2 != 2) {
                    if (iOrdinal2 != 3) {
                        ore.o();
                        return null;
                    }
                    t5a t5aVar4 = editStoryScreen17.C;
                    if (t5aVar4 != null) {
                        t5aVar4.e(true);
                    }
                    editStoryScreen17.C1().F();
                } else if (editStoryScreen17.E1() && !zBooleanValue6) {
                    t5a t5aVar5 = editStoryScreen17.C;
                    if (t5aVar5 != null) {
                        t5aVar5.e(false);
                    }
                    editStoryScreen17.C1().O();
                }
                return sbi.a;
            case 17:
                Object obj20 = this.f;
                ch3.d0(obj);
                EditStoryScreen editStoryScreen18 = this.g;
                zv8[] zv8VarArr20 = EditStoryScreen.A1;
                editStoryScreen18.y1().setRightActions((acc) obj20);
                return sbi.a;
            case 18:
                Object obj21 = this.f;
                ch3.d0(obj);
                boolean zBooleanValue7 = ((Boolean) obj21).booleanValue();
                EditStoryScreen editStoryScreen19 = this.g;
                if (zBooleanValue7) {
                    zv8[] zv8VarArr21 = EditStoryScreen.A1;
                    int i13 = editStoryScreen19.C1().V1;
                    t5a t5aVar6 = editStoryScreen19.C;
                    if (i13 == 1) {
                        if (t5aVar6 != null) {
                            t5aVar6.c();
                        }
                        t5a t5aVar7 = editStoryScreen19.C;
                        if (t5aVar7 != null) {
                            t5aVar7.e(true);
                        }
                    } else if (t5aVar6 != null) {
                        t5aVar6.d(i13);
                    }
                } else {
                    t5a t5aVar8 = editStoryScreen19.C;
                    if (t5aVar8 != null) {
                        t5aVar8.e(false);
                    }
                }
                return sbi.a;
            case 19:
                Object obj22 = this.f;
                ch3.d0(obj);
                q16 q16Var = (q16) obj22;
                EditStoryScreen editStoryScreen20 = this.g;
                zv8[] zv8VarArr22 = EditStoryScreen.A1;
                if (cqk.d(q16Var, o16.a)) {
                    mvh mvhVar = editStoryScreen20.I;
                    if (mvhVar != null) {
                        mvhVar.dismiss();
                    }
                    editStoryScreen20.I = null;
                } else {
                    if (!(q16Var instanceof p16)) {
                        ore.o();
                        return null;
                    }
                    if (editStoryScreen20.I == null) {
                        tp2 tp2VarA1 = editStoryScreen20.A1();
                        wre wreVar = new wre(tp2VarA1, editStoryScreen20, ((p16) q16Var).a, 16);
                        if (tp2VarA1.isLaidOut()) {
                            wreVar.invoke();
                        } else {
                            tp2VarA1.addOnLayoutChangeListener(new xc0(7, wreVar));
                        }
                    }
                }
                return sbi.a;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return l(obj);
            default:
                Object obj23 = this.f;
                ch3.d0(obj);
                boolean zBooleanValue8 = ((Boolean) obj23).booleanValue();
                EditStoryScreen editStoryScreen21 = this.g;
                zv8[] zv8VarArr23 = EditStoryScreen.A1;
                ((ViewGroup) editStoryScreen21.l.m(editStoryScreen21, EditStoryScreen.A1[5])).setVisibility(zBooleanValue8 ? 0 : 4);
                LinearLayout linearLayout = editStoryScreen21.m;
                if (linearLayout != null) {
                    fwg fwgVar4 = editStoryScreen21.J;
                    fwgVar4.getClass();
                    if (linearLayout.isAttachedToWindow()) {
                        fwgVar4.b = true;
                        ViewPropertyAnimator viewPropertyAnimator2 = (ViewPropertyAnimator) fwgVar4.f;
                        if (viewPropertyAnimator2 != null) {
                            viewPropertyAnimator2.cancel();
                        }
                        fwgVar4.b = false;
                        linearLayout.setScaleX(0.75f);
                        linearLayout.setScaleY(0.75f);
                        linearLayout.setAlpha(0.0f);
                        ViewPropertyAnimator viewPropertyAnimatorWithEndAction3 = linearLayout.animate().alpha(1.0f).scaleX(1.1f).scaleY(1.1f).setDuration(250L).setInterpolator((PathInterpolator) fwgVar4.c).withEndAction(new ewg(fwgVar4, i6, linearLayout));
                        fwgVar4.f = viewPropertyAnimatorWithEndAction3;
                        if (viewPropertyAnimatorWithEndAction3 != null) {
                            viewPropertyAnimatorWithEndAction3.start();
                        }
                    }
                }
                return sbi.a;
        }
    }
}
