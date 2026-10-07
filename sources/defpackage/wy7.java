package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.util.SparseArray;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import one.me.calllist.ui.CallHistoryScreen;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.chats.picker.chats.PickerChatsListWidget;
import one.me.chats.picker.chats.PickerChatsTabWidget;
import one.me.keyboardmedia.MediaKeyboardWidget;
import one.me.mediaeditor.MediaEditScreen;
import one.me.profile.screens.avatars.ProfileAvatarsScreen;
import one.me.profile.screens.media.ChatMediaTabWidget;
import one.me.stories.edit.EditStoryScreen;
import one.me.stories.viewer.viewer.StoriesViewerScreen;

/* JADX INFO: loaded from: classes4.dex */
public final class wy7 extends t8j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wy7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.t8j
    public void h(int i) throws IllegalAccessException, InvocationTargetException {
        y8j y8jVarH;
        fj1 fj1Var;
        ej1 ej1Var;
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                xy7 xy7Var = (xy7) obj;
                xy7Var.v = (xy7Var.a.d() || (y8jVarH = xy7Var.h()) == null || y8jVarH.getScrollState() != 0) ? false : true;
                break;
            case 2:
                if (i == 0 && (ej1Var = (fj1Var = (fj1) obj).y) != null) {
                    int currentItem = fj1Var.u.getCurrentItem();
                    CallScreen callScreen = ((hx1) ej1Var).a;
                    l6m l6mVar = CallScreen.D1;
                    callScreen.R1().N(currentItem);
                    break;
                }
                break;
            case 12:
                zv8[] zv8VarArr = StoriesViewerScreen.t;
                mjg mjgVar = ((StoriesViewerScreen) obj).E1().q;
                Integer numValueOf = Integer.valueOf(i);
                mjgVar.getClass();
                mjgVar.j(null, numValueOf);
                break;
        }
    }

    @Override // defpackage.t8j
    public final void j(int i) {
        x7j x7jVar;
        int i2;
        final View[] viewArr;
        final View[] viewArr2;
        int i3 = this.a;
        byte b = 0;
        final int i4 = 1;
        Object obj = this.b;
        switch (i3) {
            case 0:
                xy7 xy7Var = (xy7) obj;
                lr1 lr1Var = (lr1) xy7Var.f.J(i);
                if (lr1Var != null && (x7jVar = lr1Var.a) != x7j.b) {
                    xy7Var.g.invoke(x7jVar);
                }
                if (i != xy7Var.u) {
                    xy7Var.u = i;
                    xy7Var.w = false;
                    vq7 vq7Var = (vq7) xy7Var.i.invoke();
                    if (vq7Var != null) {
                        vq7Var.setDrawZeroIcon(i == 0);
                    }
                    xy7Var.m();
                    lfe lfeVarK = xy7Var.j.K(xy7Var.a.getCurrentItem());
                    View view = lfeVarK != null ? lfeVarK.a : null;
                    if (view != null) {
                        view.setTranslationX(0.0f);
                    }
                } else {
                    gm0.Y(wy7.class.getName(), "Early return in onPageSelected cuz of position == currentPosition");
                }
                break;
            case 1:
                mp0 mp0Var = (mp0) obj;
                vm4 vm4Var = mp0Var.v;
                wm4 wm4Var = (wm4) vm4Var.d.f.get(i);
                int iB = xol.b(wm4Var.a);
                switch (qt4.D(wm4Var.a)) {
                    case 0:
                        i2 = 3;
                        break;
                    case 1:
                    case 4:
                    case 6:
                        i2 = 1;
                        break;
                    case 2:
                    case 3:
                    case 5:
                        i2 = 2;
                        break;
                    default:
                        ore.o();
                        break;
                }
                int i5 = vm4Var.l() == 1 ? 2 : 1;
                kp0 kp0Var = mp0Var.u;
                d8b d8bVar = kp0Var.d;
                d8b d8bVar2 = kp0Var.e;
                d8b d8bVar3 = kp0Var.f;
                Integer numC = ((tbb) kp0Var.c.getValue()).c();
                if (numC != null) {
                    int iIntValue = numC.intValue();
                    long jY = ((xb9) ((et3) kp0Var.a.getValue())).Y();
                    int iD = qt4.D(i5) + c0a.f(i2, ((qt4.D(iB) * 961) + iIntValue) * 31, 31);
                    int iD2 = qt4.D(iB);
                    if (iD2 == 0) {
                        int iB2 = d8bVar2.b(iD);
                        if ((iB2 >= 0 ? d8bVar2.c[iB2] : -1L) != jY) {
                            d8bVar2.d(iD, jY);
                        }
                    } else if (iD2 == 1) {
                        int iB3 = d8bVar.b(iD);
                        if ((iB3 >= 0 ? d8bVar.c[iB3] : -1L) != jY) {
                            d8bVar.d(iD, jY);
                        }
                    } else if (iD2 != 2) {
                        ore.o();
                        break;
                    } else {
                        int iB4 = d8bVar3.b(iD);
                        if ((iB4 >= 0 ? d8bVar3.c[iB4] : -1L) != jY) {
                            d8bVar3.d(iD, jY);
                        }
                    }
                    kp0Var.b("showed", iB, iIntValue, i2, i5);
                }
                break;
            case 2:
                ej1 ej1Var = ((fj1) obj).y;
                if (ej1Var != null) {
                    ((hx1) ej1Var).a(i);
                }
                break;
            case 3:
                CallHistoryScreen callHistoryScreen = (CallHistoryScreen) obj;
                Integer num = callHistoryScreen.z;
                if (num != null && num.intValue() != i) {
                    callHistoryScreen.r1().B();
                }
                callHistoryScreen.z = Integer.valueOf(i);
                callHistoryScreen.s1(i);
                break;
            case 4:
                ChatMediaTabWidget chatMediaTabWidget = (ChatMediaTabWidget) obj;
                chatMediaTabWidget.e = i;
                tbb.g((tbb) chatMediaTabWidget.d.getValue(), ChatMediaTabWidget.o1(chatMediaTabWidget));
                break;
            case 5:
                zv8[] zv8VarArr = ChatMediaViewerScreen.Z;
                l63 l63VarU1 = ((ChatMediaViewerScreen) obj).U1();
                l63VarU1.Z(yab.h0(l63VarU1.b, ((n0c) l63VarU1.l).a(), 2, new y53(i, l63VarU1, null)));
                break;
            case 6:
                EditStoryScreen editStoryScreen = (EditStoryScreen) obj;
                zv8[] zv8VarArr2 = EditStoryScreen.A1;
                aoh aohVar = (aoh) ww3.u1(i, ((xph) editStoryScreen.X.getValue()).m.f);
                if (aohVar != null) {
                    editStoryScreen.C1().N().g.setValue(aohVar.getName());
                }
                break;
            case 7:
                MediaEditScreen mediaEditScreen = (MediaEditScreen) obj;
                zv8[] zv8VarArr3 = MediaEditScreen.w1;
                t5a t5aVar = mediaEditScreen.m;
                if (t5aVar != null) {
                    t5aVar.e(false);
                }
                lx9 lx9VarA2 = mediaEditScreen.a2();
                lx9VarA2.s1.B(lx9VarA2, lx9.F1[3], yab.h0(lx9VarA2.b, ((n0c) lx9VarA2.H()).a(), 2, new gx9(lx9VarA2, i, null, 2)));
                break;
            case 8:
                MediaKeyboardWidget mediaKeyboardWidget = (MediaKeyboardWidget) obj;
                j8e j8eVar = mediaKeyboardWidget.l;
                j8e j8eVar2 = mediaKeyboardWidget.j;
                j8e j8eVar3 = mediaKeyboardWidget.k;
                ax8 ax8Var = (ax8) ww3.u1(i, (List) mediaKeyboardWidget.n.b);
                if (ax8Var != null) {
                    a8j.x(mediaKeyboardWidget.r1().f, new yy9(ax8Var));
                    if (ax8Var == ax8.e) {
                        zv8[] zv8VarArr4 = MediaKeyboardWidget.u;
                        viewArr = new View[]{(View) j8eVar3.m(mediaKeyboardWidget, zv8VarArr4[8])};
                        viewArr2 = new View[]{(View) j8eVar2.m(mediaKeyboardWidget, zv8VarArr4[7]), (View) j8eVar.m(mediaKeyboardWidget, zv8VarArr4[9])};
                    } else {
                        zv8[] zv8VarArr5 = MediaKeyboardWidget.u;
                        viewArr = new View[]{(View) j8eVar2.m(mediaKeyboardWidget, zv8VarArr5[7]), (View) j8eVar.m(mediaKeyboardWidget, zv8VarArr5[9])};
                        viewArr2 = new View[]{(View) j8eVar3.m(mediaKeyboardWidget, zv8VarArr5[8])};
                    }
                    AnimatorSet animatorSet = mediaKeyboardWidget.t;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat.addUpdateListener(new mk(valueAnimatorOfFloat, 6, viewArr));
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                    valueAnimatorOfFloat2.addUpdateListener(new mk(valueAnimatorOfFloat2, 6, viewArr2));
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
                    final byte b2 = b == true ? 1 : 0;
                    animatorSet2.addListener(new bl(animatorSet2, new af7() { // from class: mz9
                        @Override // defpackage.af7
                        public final Object invoke() {
                            int i6 = b2;
                            sbi sbiVar = sbi.a;
                            View[] viewArr3 = viewArr;
                            switch (i6) {
                                case 0:
                                    zv8[] zv8VarArr6 = MediaKeyboardWidget.u;
                                    for (View view2 : viewArr3) {
                                        view2.setVisibility(0);
                                    }
                                    break;
                                default:
                                    zv8[] zv8VarArr7 = MediaKeyboardWidget.u;
                                    for (View view3 : viewArr3) {
                                        view3.setVisibility(8);
                                    }
                                    break;
                            }
                            return sbiVar;
                        }
                    }, 1));
                    lsk.d(animatorSet2, new af7() { // from class: mz9
                        @Override // defpackage.af7
                        public final Object invoke() {
                            int i6 = i4;
                            sbi sbiVar = sbi.a;
                            View[] viewArr3 = viewArr2;
                            switch (i6) {
                                case 0:
                                    zv8[] zv8VarArr6 = MediaKeyboardWidget.u;
                                    for (View view2 : viewArr3) {
                                        view2.setVisibility(0);
                                    }
                                    break;
                                default:
                                    zv8[] zv8VarArr7 = MediaKeyboardWidget.u;
                                    for (View view3 : viewArr3) {
                                        view3.setVisibility(8);
                                    }
                                    break;
                            }
                            return sbiVar;
                        }
                    });
                    animatorSet2.setDuration(200L);
                    animatorSet2.start();
                    mediaKeyboardWidget.t = animatorSet2;
                }
                mediaKeyboardWidget.s1().post(new k36(21, mediaKeyboardWidget));
                break;
            case 9:
                PickerChatsTabWidget pickerChatsTabWidget = (PickerChatsTabWidget) obj;
                n57 n57Var = pickerChatsTabWidget.m;
                hve hveVarI = n57Var.I(i);
                if (hveVarI != null) {
                    br4 br4VarI = rx8.I(hveVarI);
                    PickerChatsListWidget pickerChatsListWidget = br4VarI instanceof PickerChatsListWidget ? (PickerChatsListWidget) br4VarI : null;
                    if (pickerChatsListWidget != null) {
                        vv vvVar = pickerChatsTabWidget.b;
                        zv8 zv8Var = PickerChatsTabWidget.p[1];
                        Boolean bool = (Boolean) vvVar.a(pickerChatsTabWidget);
                        bool.booleanValue();
                        mjg mjgVar = pickerChatsListWidget.x1().A;
                        mjgVar.getClass();
                        mjgVar.j(null, bool);
                        n57Var.L(i);
                        break;
                    }
                }
                break;
            case 10:
                ProfileAvatarsScreen profileAvatarsScreen = (ProfileAvatarsScreen) obj;
                zv8[] zv8VarArr6 = ProfileAvatarsScreen.r;
                ProfileAvatarsScreen.E1(profileAvatarsScreen, profileAvatarsScreen.J1().c.c(), i);
                break;
            case 11:
                kve kveVar = (kve) obj;
                SparseArray sparseArray = kveVar.h;
                hve hveVar = (hve) sparseArray.get(i);
                int i6 = kveVar.i;
                if (i != i6) {
                    hve hveVar2 = (hve) sparseArray.get(i6);
                    if (hveVar2 != null) {
                        Iterator it = hveVar2.e().iterator();
                        while (it.hasNext()) {
                            ((lve) it.next()).a.setOptionsMenuHidden(true);
                        }
                    }
                    if (hveVar != null) {
                        Iterator it2 = hveVar.e().iterator();
                        while (it2.hasNext()) {
                            ((lve) it2.next()).a.setOptionsMenuHidden(false);
                        }
                    }
                    kveVar.i = i;
                }
                break;
            default:
                StoriesViewerScreen storiesViewerScreen = (StoriesViewerScreen) obj;
                pkc pkcVar = (pkc) ww3.u1(i, storiesViewerScreen.n.m.f);
                if (pkcVar != null) {
                    jvg jvgVarE1 = storiesViewerScreen.E1();
                    azg azgVar = pkcVar.d;
                    t3h t3hVar = jvgVarE1.e;
                    AtomicReference atomicReference = t3hVar.g;
                    r3h r3hVar = (r3h) atomicReference.get();
                    if (r3hVar instanceof o3h) {
                        o3h o3hVar = (o3h) r3hVar;
                        if (t3h.B(o3hVar.b(), azgVar)) {
                            o3h o3hVarD = o3hVar.d();
                            while (!atomicReference.compareAndSet(o3hVar, o3hVarD) && atomicReference.get() == o3hVar) {
                            }
                        } else if (o3hVar.c()) {
                            qrc.o(t3hVar, m3h.MOVED_TO_OTHER_OWNER, o3hVar.a(), null, null, 28);
                        }
                    }
                    jvgVarE1.E(azgVar.a());
                }
                break;
        }
    }
}
