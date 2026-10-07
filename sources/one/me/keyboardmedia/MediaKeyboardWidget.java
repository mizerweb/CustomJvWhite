package one.me.keyboardmedia;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.ax8;
import defpackage.c;
import defpackage.c0a;
import defpackage.cel;
import defpackage.dj9;
import defpackage.dwd;
import defpackage.dx8;
import defpackage.e9i;
import defpackage.eph;
import defpackage.ex8;
import defpackage.ez9;
import defpackage.fwg;
import defpackage.fz6;
import defpackage.gm0;
import defpackage.j8e;
import defpackage.j95;
import defpackage.kbc;
import defpackage.kj1;
import defpackage.lh9;
import defpackage.lq4;
import defpackage.ltb;
import defpackage.lvb;
import defpackage.ly7;
import defpackage.mp5;
import defpackage.mw7;
import defpackage.n09;
import defpackage.n1g;
import defpackage.nl5;
import defpackage.nni;
import defpackage.ny8;
import defpackage.nz9;
import defpackage.oz9;
import defpackage.po;
import defpackage.pq3;
import defpackage.pz9;
import defpackage.qe7;
import defpackage.qz9;
import defpackage.r66;
import defpackage.sl1;
import defpackage.sw8;
import defpackage.t3a;
import defpackage.t3f;
import defpackage.tre;
import defpackage.ud9;
import defpackage.uw8;
import defpackage.v7j;
import defpackage.vv;
import defpackage.wk1;
import defpackage.wy7;
import defpackage.xw3;
import defpackage.y8j;
import defpackage.yl5;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zr6;
import defpackage.zv8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import one.me.keyboardmedia.MediaKeyboardWidget;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\r\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0013B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006BK\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0005\u0010\u0012¨\u0006\u0014"}, d2 = {"Lone/me/keyboardmedia/MediaKeyboardWidget;", "Lone/me/sdk/arch/Widget;", "Leph;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lt3f;", "scopeId", "", ApiProtocol.PARAM_CHAT_ID, "", "onlyEmoji", "forReactionsSettings", "", "", "selectedEmojis", "lightColoredBottomPanel", "(Lt3f;JZZLjava/util/List;Z)V", "nz9", "keyboard-media"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MediaKeyboardWidget extends Widget implements eph {
    public static final /* synthetic */ zv8[] u = {new dwd(MediaKeyboardWidget.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), zo5.f(zfe.a, MediaKeyboardWidget.class, "onlyEmoji", "getOnlyEmoji()Z", 0), new dwd(MediaKeyboardWidget.class, "forReactionsSettings", "getForReactionsSettings()Z", 0), new dwd(MediaKeyboardWidget.class, "lightColoredBottomPanel", "getLightColoredBottomPanel()Z", 0), new dwd(MediaKeyboardWidget.class, "bottomPanelView", "getBottomPanelView()Landroid/view/View;", 0), new dwd(MediaKeyboardWidget.class, "keyboardBottomTabs", "getKeyboardBottomTabs()Lone/me/keyboardmedia/tablayout/KeyboardTabLayout;", 0), new dwd(MediaKeyboardWidget.class, "keyboardViewPager", "getKeyboardViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0), new dwd(MediaKeyboardWidget.class, "settingsButton", "getSettingsButton()Landroid/view/View;", 0), new dwd(MediaKeyboardWidget.class, "removeButton", "getRemoveButton()Landroid/view/View;", 0), new dwd(MediaKeyboardWidget.class, "showcaseButton", "getShowcaseButton()Landroid/view/View;", 0)};
    public final vv a;
    public final vv b;
    public final vv c;
    public final vv d;
    public final ny8 e;
    public dj9 f;
    public final j8e g;
    public final j8e h;
    public final j8e i;
    public final j8e j;
    public final j8e k;
    public final j8e l;
    public fwg m;
    public final ex8 n;
    public sw8 o;
    public kbc p;
    public wy7 q;
    public final EnumMap r;
    public ObjectAnimator s;
    public AnimatorSet t;

    public MediaKeyboardWidget(Bundle bundle) {
        super(bundle);
        this.a = new vv(Long.class, 0L, "arg_key_chat_id");
        Boolean bool = Boolean.FALSE;
        this.b = new vv(Boolean.class, bool, "arg_key_only_emoji");
        this.c = new vv(Boolean.class, bool, "arg_for_reactions_settings");
        this.d = new vv(Boolean.class, bool, "arg_light_colored_bottom_panel");
        Object objF0 = tre.f0(bundle, "arg_key_parent_scope_id", t3f.class);
        if (objF0 == null) {
            c.o(c0a.o("No value passed for key arg_key_parent_scope_id of type ", t3f.class.getSimpleName(), " in bundle"));
            throw null;
        }
        this.e = getSharedViewModel((t3f) ((Parcelable) objF0), ez9.class, null);
        this.g = viewBinding(R.id.oneme_media_keyboard_bottom_panel);
        this.h = viewBinding(R.id.oneme_media_keyboard_tabs);
        this.i = viewBinding(R.id.oneme_media_keyboard_pager);
        this.j = viewBinding(R.id.oneme_media_keyboard_settings_action);
        this.k = viewBinding(R.id.oneme_media_keyboard_remove_action);
        this.l = viewBinding(R.id.oneme_media_keyboard_showcase_action);
        ex8 ex8Var = new ex8(0);
        ex8Var.b = r66.a;
        this.n = ex8Var;
        this.r = new EnumMap(ax8.class);
    }

    public static final kbc o1(MediaKeyboardWidget mediaKeyboardWidget) {
        kbc kbcVar = mediaKeyboardWidget.p;
        return kbcVar == null ? pq3.j.e(mediaKeyboardWidget.getContext()).m() : kbcVar;
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        final int i = 1;
        n1g.N(new pz9(this, null, 1), frameLayout);
        int i2 = uw8.a;
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, uw8.a(frameLayout.getContext())));
        y8j y8jVar = new y8j(frameLayout.getContext());
        y8jVar.setId(R.id.oneme_media_keyboard_pager);
        final int i3 = 0;
        y8jVar.setUserInputEnabled(false);
        final int i4 = 2;
        y8jVar.setOverScrollMode(2);
        y8jVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        lvb.m0(y8jVar);
        frameLayout.addView(y8jVar);
        FrameLayout frameLayout2 = new FrameLayout(frameLayout.getContext());
        frameLayout2.setId(R.id.oneme_media_keyboard_bottom_panel);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, gm0.K(48.0f * yl5.d().getDisplayMetrics().density));
        layoutParams.gravity = 80;
        frameLayout2.setLayoutParams(layoutParams);
        n1g.N(new pz9(this, null, 0), frameLayout2);
        frameLayout2.setClickable(true);
        View view = new View(frameLayout2.getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, gm0.J(((double) yl5.d().getDisplayMetrics().density) * 0.5d));
        layoutParams2.gravity = 48;
        view.setLayoutParams(layoutParams2);
        n1g.N(new ud9(this, (lq4) null, 28), view);
        frameLayout2.addView(view);
        int iK = gm0.K(28.0f * yl5.d().getDisplayMetrics().density);
        View imageView = new ImageView(frameLayout2.getContext());
        imageView.setId(R.id.oneme_media_keyboard_settings_action);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(iK, iK);
        layoutParams3.gravity = 8388627;
        layoutParams3.leftMargin = gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
        imageView.setLayoutParams(layoutParams3);
        imageView.setPadding(4, 4, 4, 4);
        n1g.N(new oz9(this, null, 1), imageView);
        qe7.H(imageView, 300L, new sl1(2));
        frameLayout2.addView(imageView);
        View imageView2 = new ImageView(frameLayout2.getContext());
        imageView2.setId(R.id.oneme_media_keyboard_showcase_action);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(iK, iK);
        layoutParams4.gravity = 8388629;
        layoutParams4.rightMargin = gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
        imageView2.setLayoutParams(layoutParams4);
        imageView2.setPadding(4, 4, 4, 4);
        n1g.N(new oz9(this, null, 2), imageView2);
        qe7.H(imageView2, 300L, new View.OnClickListener(this) { // from class: lz9
            public final /* synthetic */ MediaKeyboardWidget b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i5 = i3;
                lt7 lt7Var = lt7.KEYBOARD_TAP;
                MediaKeyboardWidget mediaKeyboardWidget = this.b;
                switch (i5) {
                    case 0:
                        zv8[] zv8VarArr = MediaKeyboardWidget.u;
                        rw8 rw8Var = rw8.b;
                        vv vvVar = mediaKeyboardWidget.a;
                        zv8 zv8Var = MediaKeyboardWidget.u[0];
                        o65.c(rw8Var.b(), zo5.j(((Number) vvVar.a(mediaKeyboardWidget)).longValue(), ":stickers/showcase?chat_id="), null, null, 6);
                        break;
                    case 1:
                        zv8[] zv8VarArr2 = MediaKeyboardWidget.u;
                        View view3 = mediaKeyboardWidget.getView();
                        if (view3 != null) {
                            p0m.a(view3, lt7Var);
                        }
                        mediaKeyboardWidget.r1().B();
                        break;
                    default:
                        zv8[] zv8VarArr3 = MediaKeyboardWidget.u;
                        View view4 = mediaKeyboardWidget.getView();
                        if (view4 != null) {
                            p0m.a(view4, lt7Var);
                        }
                        a8j.x(mediaKeyboardWidget.r1().f, vy9.a);
                        break;
                }
            }
        });
        frameLayout2.addView(imageView2);
        zv8[] zv8VarArr = u;
        zv8 zv8Var = zv8VarArr[2];
        vv vvVar = this.c;
        if (((Boolean) vvVar.a(this)).booleanValue()) {
            View imageView3 = new ImageView(frameLayout2.getContext());
            imageView3.setId(R.id.oneme_media_keyboard_close_action);
            FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(iK, iK);
            layoutParams5.gravity = 8388627;
            layoutParams5.leftMargin = gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
            imageView3.setLayoutParams(layoutParams5);
            imageView3.setPadding(4, 4, 4, 4);
            n1g.N(new oz9(this, null, 3), imageView3);
            qe7.H(imageView3, 300L, new View.OnClickListener(this) { // from class: lz9
                public final /* synthetic */ MediaKeyboardWidget b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i5 = i;
                    lt7 lt7Var = lt7.KEYBOARD_TAP;
                    MediaKeyboardWidget mediaKeyboardWidget = this.b;
                    switch (i5) {
                        case 0:
                            zv8[] zv8VarArr2 = MediaKeyboardWidget.u;
                            rw8 rw8Var = rw8.b;
                            vv vvVar2 = mediaKeyboardWidget.a;
                            zv8 zv8Var2 = MediaKeyboardWidget.u[0];
                            o65.c(rw8Var.b(), zo5.j(((Number) vvVar2.a(mediaKeyboardWidget)).longValue(), ":stickers/showcase?chat_id="), null, null, 6);
                            break;
                        case 1:
                            zv8[] zv8VarArr3 = MediaKeyboardWidget.u;
                            View view3 = mediaKeyboardWidget.getView();
                            if (view3 != null) {
                                p0m.a(view3, lt7Var);
                            }
                            mediaKeyboardWidget.r1().B();
                            break;
                        default:
                            zv8[] zv8VarArr4 = MediaKeyboardWidget.u;
                            View view4 = mediaKeyboardWidget.getView();
                            if (view4 != null) {
                                p0m.a(view4, lt7Var);
                            }
                            a8j.x(mediaKeyboardWidget.r1().f, vy9.a);
                            break;
                    }
                }
            });
            frameLayout2.addView(imageView3);
        }
        View imageView4 = new ImageView(frameLayout2.getContext());
        imageView4.setId(R.id.oneme_media_keyboard_remove_action);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(iK, iK);
        layoutParams6.gravity = 8388629;
        layoutParams6.rightMargin = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        imageView4.setLayoutParams(layoutParams6);
        imageView4.setPadding(4, 4, 4, 4);
        n1g.N(new oz9(this, null, 0), imageView4);
        imageView4.setOnTouchListener(new ly7(v7j.b(imageView4), ViewConfiguration.get(imageView4.getContext()).getScaledTouchSlop(), new mp5(18, imageView4)));
        imageView4.setOnClickListener(new View.OnClickListener(this) { // from class: lz9
            public final /* synthetic */ MediaKeyboardWidget b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i5 = i4;
                lt7 lt7Var = lt7.KEYBOARD_TAP;
                MediaKeyboardWidget mediaKeyboardWidget = this.b;
                switch (i5) {
                    case 0:
                        zv8[] zv8VarArr2 = MediaKeyboardWidget.u;
                        rw8 rw8Var = rw8.b;
                        vv vvVar2 = mediaKeyboardWidget.a;
                        zv8 zv8Var2 = MediaKeyboardWidget.u[0];
                        o65.c(rw8Var.b(), zo5.j(((Number) vvVar2.a(mediaKeyboardWidget)).longValue(), ":stickers/showcase?chat_id="), null, null, 6);
                        break;
                    case 1:
                        zv8[] zv8VarArr3 = MediaKeyboardWidget.u;
                        View view3 = mediaKeyboardWidget.getView();
                        if (view3 != null) {
                            p0m.a(view3, lt7Var);
                        }
                        mediaKeyboardWidget.r1().B();
                        break;
                    default:
                        zv8[] zv8VarArr4 = MediaKeyboardWidget.u;
                        View view4 = mediaKeyboardWidget.getView();
                        if (view4 != null) {
                            p0m.a(view4, lt7Var);
                        }
                        a8j.x(mediaKeyboardWidget.r1().f, vy9.a);
                        break;
                }
            }
        });
        frameLayout2.addView(imageView4);
        dx8 dx8Var = new dx8(frameLayout2.getContext());
        dx8Var.setId(R.id.oneme_media_keyboard_tabs);
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams7.gravity = 17;
        int iK2 = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
        dx8Var.setPadding(dx8Var.getPaddingLeft(), iK2, dx8Var.getPaddingRight(), iK2);
        dx8Var.setLayoutParams(layoutParams7);
        dx8Var.setTabMode(0);
        zv8 zv8Var2 = zv8VarArr[2];
        dx8Var.setVisibility(((Boolean) vvVar.a(this)).booleanValue() ? 8 : 0);
        dx8Var.setCustomTheme(this.p);
        frameLayout2.addView(dx8Var);
        frameLayout.addView(frameLayout2);
        return frameLayout;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        ez9 ez9VarR1 = r1();
        int currentItem = s1().getCurrentItem();
        List list = (List) this.n.b;
        ez9VarR1.getClass();
        if (currentItem >= 0 && currentItem < list.size()) {
            ax8 ax8Var = (ax8) list.get(currentItem);
            nni nniVar = (nni) ez9VarR1.d.getValue();
            long jC = mw7.c(ax8Var.b);
            zr6 zr6Var = (zr6) nniVar.d.edit();
            zr6Var.putLong("app.last.media_keyboard.page.id", jC);
            zr6Var.apply();
        }
        ObjectAnimator objectAnimator = this.s;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.s = null;
        AnimatorSet animatorSet = this.t;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.t = null;
        fwg fwgVar = this.m;
        if (fwgVar != null) {
            fwgVar.d();
        }
        this.m = null;
        wy7 wy7Var = this.q;
        if (wy7Var != null) {
            s1().j(wy7Var);
        }
        this.q = null;
        this.r.clear();
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        kbc kbcVar2 = this.p;
        if (kbcVar2 != null) {
            kbcVar = kbcVar2;
        }
        ((dx8) this.h.m(this, u[5])).onThemeChanged(kbcVar);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        dj9 dj9Var = this.f;
        zv8[] zv8VarArr = u;
        zv8 zv8Var = zv8VarArr[0];
        long jLongValue = ((Number) this.a.a(this)).longValue();
        Object objF0 = tre.f0(getArgs(), "arg_key_parent_scope_id", t3f.class);
        if (objF0 == null) {
            c.o(c0a.o("No value passed for key arg_key_parent_scope_id of type ", t3f.class.getSimpleName(), " in bundle"));
            return;
        }
        t3f t3fVar = (t3f) ((Parcelable) objF0);
        zv8 zv8Var2 = zv8VarArr[2];
        sw8 sw8Var = new sw8(this, dj9Var, jLongValue, t3fVar, ((Boolean) this.c.a(this)).booleanValue(), getArgs().getCharSequenceArrayList("arg_key_selected_emoji"));
        sw8Var.L(this.p);
        this.o = sw8Var;
        s1().setAdapter(this.o);
        y8j y8jVarS1 = s1();
        wy7 wy7Var = new wy7(8, this);
        this.q = wy7Var;
        y8jVarS1.e(wy7Var);
        dx8 dx8Var = (dx8) this.h.m(this, zv8VarArr[5]);
        y8j y8jVarS2 = s1();
        kbc kbcVar = this.p;
        ex8 ex8Var = this.n;
        ex8Var.getClass();
        fwg fwgVar = new fwg(dx8Var, y8jVarS2, new po(dx8Var, ex8Var, y8jVarS2, kbcVar));
        fwgVar.c();
        this.m = fwgVar;
        ltb onBackPressedDispatcher = getOnBackPressedDispatcher();
        if (onBackPressedDispatcher != null) {
            cel.a(onBackPressedDispatcher, getViewLifecycleOwner(), new lh9(5, this));
        }
        List listSingletonList = t1() ? Collections.singletonList(ax8.e) : ax8.d;
        ex8Var.b = listSingletonList;
        sw8 sw8Var2 = this.o;
        if (sw8Var2 != null) {
            if (!sw8Var2.q.isEmpty() || listSingletonList.isEmpty()) {
                nl5 nl5VarJ = tre.J(new wk1(2, sw8Var2.q, listSingletonList));
                sw8Var2.q = listSingletonList;
                nl5VarJ.a(new t3a(sw8Var2));
            } else {
                sw8Var2.q = listSingletonList;
                sw8Var2.r(0, listSingletonList.size());
            }
        }
        y8j y8jVarS3 = s1();
        View childAt = y8jVarS3.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            recyclerView.setItemAnimator(null);
            recyclerView.setHasFixedSize(true);
        }
        sw8 sw8Var3 = this.o;
        if ((sw8Var3 != null ? sw8Var3.q.size() : 0) > 0) {
            ((View) this.k.m(this, zv8VarArr[8])).setVisibility(t1() ? 0 : 8);
            ((View) this.j.m(this, zv8VarArr[7])).setVisibility(!t1() ? 0 : 8);
            ((View) this.l.m(this, zv8VarArr[9])).setVisibility(t1() ? 8 : 0);
            ez9 ez9VarR1 = r1();
            ez9VarR1.getClass();
            Iterator it = listSingletonList.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (mw7.c(((ax8) it.next()).b) == ((nni) ez9VarR1.d.getValue()).d.getLong("app.last.media_keyboard.page.id", 0L)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                i = 0;
            }
            y8jVarS3.h(i, false);
            int i2 = uw8.a;
            y8jVarS3.measure(View.MeasureSpec.makeMeasureSpec(y8jVarS3.getContext().getResources().getDisplayMetrics().widthPixels, 1073741824), View.MeasureSpec.makeMeasureSpec(uw8.a(y8jVarS3.getContext()), 1073741824));
            p1();
        }
        e9i.j0(new fz6(n1g.v(r1().f, getViewLifecycleOwner().f(), n09.d), new qz9((lq4) null, this, 0), 3), getViewLifecycleScope());
    }

    public final void p1() {
        if (getView() == null) {
            return;
        }
        List list = (List) this.n.b;
        int currentItem = s1().getCurrentItem();
        if (currentItem < 0 || currentItem > xw3.O0(list)) {
            return;
        }
        ax8 ax8Var = (ax8) list.get(currentItem);
        int iOrdinal = ax8Var.ordinal();
        if (iOrdinal == 0) {
            u1(ax8Var, (RecyclerView) s1().findViewById(R.id.oneme_media_keyboard_stickers_list));
        } else {
            if (iOrdinal != 1) {
                return;
            }
            u1(ax8Var, (RecyclerView) s1().findViewById(R.id.oneme_media_keyboard_emoji_list));
        }
    }

    public final View q1() {
        return (View) this.g.m(this, u[4]);
    }

    public final ez9 r1() {
        return (ez9) this.e.getValue();
    }

    public final y8j s1() {
        return (y8j) this.i.m(this, u[6]);
    }

    public final boolean t1() {
        zv8 zv8Var = u[1];
        return ((Boolean) this.b.a(this)).booleanValue();
    }

    public final void u1(ax8 ax8Var, RecyclerView recyclerView) {
        EnumMap enumMap = this.r;
        if (enumMap.containsKey(ax8Var) || recyclerView == null) {
            return;
        }
        nz9 nz9Var = new nz9(getContext(), new kj1(0, this, MediaKeyboardWidget.class, "showBottomPanel", "showBottomPanel()V", 0, 16), new kj1(0, this, MediaKeyboardWidget.class, "hideBottomPanel", "hideBottomPanel()V", 0, 17));
        recyclerView.k(nz9Var);
        enumMap.put(ax8Var, nz9Var);
    }

    public final void v1() {
        ObjectAnimator objectAnimator = this.s;
        if ((objectAnimator == null || !objectAnimator.isRunning()) && q1().getTranslationY() != 0.0f) {
            ObjectAnimator objectAnimator2 = this.s;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(q1(), (Property<View, Float>) View.TRANSLATION_Y, q1().getTranslationY(), 0.0f);
            objectAnimatorOfFloat.setDuration(200L);
            objectAnimatorOfFloat.start();
            this.s = objectAnimatorOfFloat;
        }
    }

    public /* synthetic */ MediaKeyboardWidget(t3f t3fVar, long j, boolean z, boolean z2, List list, boolean z3, int i, j95 j95Var) {
        this(t3fVar, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : list, (i & 32) != 0 ? false : z3);
    }

    public MediaKeyboardWidget(t3f t3fVar, long j, boolean z, boolean z2, List<? extends CharSequence> list, boolean z3) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("arg_key_parent_scope_id", t3fVar);
        bundle.putInt(Widget.ARG_ACCOUNT_ID_OVERRIDE, t3fVar.b().a);
        bundle.putLong("arg_key_chat_id", j);
        if (z) {
            bundle.putBoolean("arg_key_only_emoji", true);
        }
        if (z2) {
            bundle.putBoolean("arg_for_reactions_settings", true);
        }
        List<? extends CharSequence> list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            bundle.putCharSequenceArrayList("arg_key_selected_emoji", new ArrayList<>(list2));
        }
        if (z3) {
            bundle.putBoolean("arg_light_colored_bottom_panel", true);
        }
        this(bundle);
    }
}
