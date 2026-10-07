package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.Shape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import one.me.profileedit.ProfileEditScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class atf extends ViewGroup implements eph, oqe {
    public static final /* synthetic */ zv8[] C = {new z8b(atf.class, "modelItem", "getModelItem()Lone/me/sdk/sections/SettingsItem;"), zo5.e(zfe.a, atf.class, "themeDepended", "getThemeDepended()Lone/me/sdk/sections/ui/recyclerview/settingsitem/SettingsItemContent$Companion$ThemeDependedType;")};
    public final ysf A;
    public boolean B;
    public final ny8 a;
    public final zsf b;
    public final LinearLayout c;
    public final ny8 d;
    public Drawable e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final LinearLayout i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final ny8 m;
    public final ny8 n;
    public final ny8 o;
    public final ny8 p;
    public final ny8 q;
    public g1c r;
    public wsf s;
    public vsf t;
    public boolean u;
    public final ShapeDrawable v;
    public final RippleDrawable w;
    public final ny8 x;
    public osf y;
    public final ysf z;

    public atf(final Context context) {
        super(context);
        final int i = 5;
        af7 af7Var = new af7() { // from class: ssf
            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                atf atfVar = this;
                Context context2 = context;
                switch (i2) {
                    case 0:
                        LinearLayout linearLayout = new LinearLayout(context2);
                        linearLayout.setId(R.id.oneme_section_end_container);
                        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                        linearLayout.setOrientation(0);
                        linearLayout.setGravity(16);
                        linearLayout.setOnTouchListener(new ek7(new GestureDetector(context2, new pi9(13, atfVar)), 5));
                        atfVar.addView(linearLayout);
                        return linearLayout;
                    case 1:
                        return atf.d(context2, atfVar);
                    case 2:
                        return atf.j(context2, atfVar);
                    case 3:
                        return atf.i(context2, atfVar);
                    case 4:
                        return atf.a(context2, atfVar);
                    case 5:
                        return atf.c(context2, atfVar);
                    case 6:
                        return atf.e(context2, atfVar);
                    case 7:
                        return atf.f(context2, atfVar);
                    case 8:
                        return atf.b(context2, atfVar);
                    case 9:
                        return atf.k(context2, atfVar);
                    case 10:
                        LinearLayout linearLayout2 = new LinearLayout(context2);
                        linearLayout2.setId(R.id.oneme_section_start_container);
                        linearLayout2.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 40.0f), gm0.K(40.0f * yl5.d().getDisplayMetrics().density)));
                        linearLayout2.setOrientation(0);
                        linearLayout2.setGravity(16);
                        atfVar.addView(linearLayout2);
                        return linearLayout2;
                    case 11:
                        return atf.g(context2, atfVar);
                    default:
                        return atf.h(context2, atfVar);
                }
            }
        };
        final int i2 = 3;
        this.a = rx8.P(3, af7Var);
        zsf zsfVar = new zsf(context, this);
        this.b = zsfVar;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.oneme_section_title_row);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        final int i3 = 0;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        this.c = linearLayout;
        final int i4 = 9;
        this.d = rx8.P(3, new af7() { // from class: ssf
            @Override // defpackage.af7
            public final Object invoke() {
                int i5 = i4;
                atf atfVar = this;
                Context context2 = context;
                switch (i5) {
                    case 0:
                        LinearLayout linearLayout2 = new LinearLayout(context2);
                        linearLayout2.setId(R.id.oneme_section_end_container);
                        linearLayout2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                        linearLayout2.setOrientation(0);
                        linearLayout2.setGravity(16);
                        linearLayout2.setOnTouchListener(new ek7(new GestureDetector(context2, new pi9(13, atfVar)), 5));
                        atfVar.addView(linearLayout2);
                        return linearLayout2;
                    case 1:
                        return atf.d(context2, atfVar);
                    case 2:
                        return atf.j(context2, atfVar);
                    case 3:
                        return atf.i(context2, atfVar);
                    case 4:
                        return atf.a(context2, atfVar);
                    case 5:
                        return atf.c(context2, atfVar);
                    case 6:
                        return atf.e(context2, atfVar);
                    case 7:
                        return atf.f(context2, atfVar);
                    case 8:
                        return atf.b(context2, atfVar);
                    case 9:
                        return atf.k(context2, atfVar);
                    case 10:
                        LinearLayout linearLayout3 = new LinearLayout(context2);
                        linearLayout3.setId(R.id.oneme_section_start_container);
                        linearLayout3.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 40.0f), gm0.K(40.0f * yl5.d().getDisplayMetrics().density)));
                        linearLayout3.setOrientation(0);
                        linearLayout3.setGravity(16);
                        atfVar.addView(linearLayout3);
                        return linearLayout3;
                    case 11:
                        return atf.g(context2, atfVar);
                    default:
                        return atf.h(context2, atfVar);
                }
            }
        });
        final int i5 = 10;
        this.f = rx8.P(3, new af7() { // from class: ssf
            @Override // defpackage.af7
            public final Object invoke() {
                int i6 = i5;
                atf atfVar = this;
                Context context2 = context;
                switch (i6) {
                    case 0:
                        LinearLayout linearLayout2 = new LinearLayout(context2);
                        linearLayout2.setId(R.id.oneme_section_end_container);
                        linearLayout2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                        linearLayout2.setOrientation(0);
                        linearLayout2.setGravity(16);
                        linearLayout2.setOnTouchListener(new ek7(new GestureDetector(context2, new pi9(13, atfVar)), 5));
                        atfVar.addView(linearLayout2);
                        return linearLayout2;
                    case 1:
                        return atf.d(context2, atfVar);
                    case 2:
                        return atf.j(context2, atfVar);
                    case 3:
                        return atf.i(context2, atfVar);
                    case 4:
                        return atf.a(context2, atfVar);
                    case 5:
                        return atf.c(context2, atfVar);
                    case 6:
                        return atf.e(context2, atfVar);
                    case 7:
                        return atf.f(context2, atfVar);
                    case 8:
                        return atf.b(context2, atfVar);
                    case 9:
                        return atf.k(context2, atfVar);
                    case 10:
                        LinearLayout linearLayout3 = new LinearLayout(context2);
                        linearLayout3.setId(R.id.oneme_section_start_container);
                        linearLayout3.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 40.0f), gm0.K(40.0f * yl5.d().getDisplayMetrics().density)));
                        linearLayout3.setOrientation(0);
                        linearLayout3.setGravity(16);
                        atfVar.addView(linearLayout3);
                        return linearLayout3;
                    case 11:
                        return atf.g(context2, atfVar);
                    default:
                        return atf.h(context2, atfVar);
                }
            }
        });
        final int i6 = 11;
        this.g = rx8.P(3, new af7() { // from class: ssf
            @Override // defpackage.af7
            public final Object invoke() {
                int i7 = i6;
                atf atfVar = this;
                Context context2 = context;
                switch (i7) {
                    case 0:
                        LinearLayout linearLayout2 = new LinearLayout(context2);
                        linearLayout2.setId(R.id.oneme_section_end_container);
                        linearLayout2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                        linearLayout2.setOrientation(0);
                        linearLayout2.setGravity(16);
                        linearLayout2.setOnTouchListener(new ek7(new GestureDetector(context2, new pi9(13, atfVar)), 5));
                        atfVar.addView(linearLayout2);
                        return linearLayout2;
                    case 1:
                        return atf.d(context2, atfVar);
                    case 2:
                        return atf.j(context2, atfVar);
                    case 3:
                        return atf.i(context2, atfVar);
                    case 4:
                        return atf.a(context2, atfVar);
                    case 5:
                        return atf.c(context2, atfVar);
                    case 6:
                        return atf.e(context2, atfVar);
                    case 7:
                        return atf.f(context2, atfVar);
                    case 8:
                        return atf.b(context2, atfVar);
                    case 9:
                        return atf.k(context2, atfVar);
                    case 10:
                        LinearLayout linearLayout3 = new LinearLayout(context2);
                        linearLayout3.setId(R.id.oneme_section_start_container);
                        linearLayout3.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 40.0f), gm0.K(40.0f * yl5.d().getDisplayMetrics().density)));
                        linearLayout3.setOrientation(0);
                        linearLayout3.setGravity(16);
                        atfVar.addView(linearLayout3);
                        return linearLayout3;
                    case 11:
                        return atf.g(context2, atfVar);
                    default:
                        return atf.h(context2, atfVar);
                }
            }
        });
        final int i7 = 12;
        this.h = rx8.P(3, new af7() { // from class: ssf
            @Override // defpackage.af7
            public final Object invoke() {
                int i8 = i7;
                atf atfVar = this;
                Context context2 = context;
                switch (i8) {
                    case 0:
                        LinearLayout linearLayout2 = new LinearLayout(context2);
                        linearLayout2.setId(R.id.oneme_section_end_container);
                        linearLayout2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                        linearLayout2.setOrientation(0);
                        linearLayout2.setGravity(16);
                        linearLayout2.setOnTouchListener(new ek7(new GestureDetector(context2, new pi9(13, atfVar)), 5));
                        atfVar.addView(linearLayout2);
                        return linearLayout2;
                    case 1:
                        return atf.d(context2, atfVar);
                    case 2:
                        return atf.j(context2, atfVar);
                    case 3:
                        return atf.i(context2, atfVar);
                    case 4:
                        return atf.a(context2, atfVar);
                    case 5:
                        return atf.c(context2, atfVar);
                    case 6:
                        return atf.e(context2, atfVar);
                    case 7:
                        return atf.f(context2, atfVar);
                    case 8:
                        return atf.b(context2, atfVar);
                    case 9:
                        return atf.k(context2, atfVar);
                    case 10:
                        LinearLayout linearLayout3 = new LinearLayout(context2);
                        linearLayout3.setId(R.id.oneme_section_start_container);
                        linearLayout3.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 40.0f), gm0.K(40.0f * yl5.d().getDisplayMetrics().density)));
                        linearLayout3.setOrientation(0);
                        linearLayout3.setGravity(16);
                        atfVar.addView(linearLayout3);
                        return linearLayout3;
                    case 11:
                        return atf.g(context2, atfVar);
                    default:
                        return atf.h(context2, atfVar);
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setId(R.id.oneme_settings_itemcontent_container);
        linearLayout2.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(0.0f * yl5.d().getDisplayMetrics().density), -1));
        final int i8 = 1;
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(8388627);
        this.i = linearLayout2;
        this.j = rx8.P(3, new af7() { // from class: ssf
            @Override // defpackage.af7
            public final Object invoke() {
                int i9 = i3;
                atf atfVar = this;
                Context context2 = context;
                switch (i9) {
                    case 0:
                        LinearLayout linearLayout3 = new LinearLayout(context2);
                        linearLayout3.setId(R.id.oneme_section_end_container);
                        linearLayout3.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                        linearLayout3.setOrientation(0);
                        linearLayout3.setGravity(16);
                        linearLayout3.setOnTouchListener(new ek7(new GestureDetector(context2, new pi9(13, atfVar)), 5));
                        atfVar.addView(linearLayout3);
                        return linearLayout3;
                    case 1:
                        return atf.d(context2, atfVar);
                    case 2:
                        return atf.j(context2, atfVar);
                    case 3:
                        return atf.i(context2, atfVar);
                    case 4:
                        return atf.a(context2, atfVar);
                    case 5:
                        return atf.c(context2, atfVar);
                    case 6:
                        return atf.e(context2, atfVar);
                    case 7:
                        return atf.f(context2, atfVar);
                    case 8:
                        return atf.b(context2, atfVar);
                    case 9:
                        return atf.k(context2, atfVar);
                    case 10:
                        LinearLayout linearLayout4 = new LinearLayout(context2);
                        linearLayout4.setId(R.id.oneme_section_start_container);
                        linearLayout4.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 40.0f), gm0.K(40.0f * yl5.d().getDisplayMetrics().density)));
                        linearLayout4.setOrientation(0);
                        linearLayout4.setGravity(16);
                        atfVar.addView(linearLayout4);
                        return linearLayout4;
                    case 11:
                        return atf.g(context2, atfVar);
                    default:
                        return atf.h(context2, atfVar);
                }
            }
        });
        this.k = rx8.P(3, new af7() { // from class: ssf
            @Override // defpackage.af7
            public final Object invoke() {
                int i9 = i8;
                atf atfVar = this;
                Context context2 = context;
                switch (i9) {
                    case 0:
                        LinearLayout linearLayout3 = new LinearLayout(context2);
                        linearLayout3.setId(R.id.oneme_section_end_container);
                        linearLayout3.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                        linearLayout3.setOrientation(0);
                        linearLayout3.setGravity(16);
                        linearLayout3.setOnTouchListener(new ek7(new GestureDetector(context2, new pi9(13, atfVar)), 5));
                        atfVar.addView(linearLayout3);
                        return linearLayout3;
                    case 1:
                        return atf.d(context2, atfVar);
                    case 2:
                        return atf.j(context2, atfVar);
                    case 3:
                        return atf.i(context2, atfVar);
                    case 4:
                        return atf.a(context2, atfVar);
                    case 5:
                        return atf.c(context2, atfVar);
                    case 6:
                        return atf.e(context2, atfVar);
                    case 7:
                        return atf.f(context2, atfVar);
                    case 8:
                        return atf.b(context2, atfVar);
                    case 9:
                        return atf.k(context2, atfVar);
                    case 10:
                        LinearLayout linearLayout4 = new LinearLayout(context2);
                        linearLayout4.setId(R.id.oneme_section_start_container);
                        linearLayout4.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 40.0f), gm0.K(40.0f * yl5.d().getDisplayMetrics().density)));
                        linearLayout4.setOrientation(0);
                        linearLayout4.setGravity(16);
                        atfVar.addView(linearLayout4);
                        return linearLayout4;
                    case 11:
                        return atf.g(context2, atfVar);
                    default:
                        return atf.h(context2, atfVar);
                }
            }
        });
        final int i9 = 2;
        this.l = rx8.P(3, new af7() { // from class: ssf
            @Override // defpackage.af7
            public final Object invoke() {
                int i10 = i9;
                atf atfVar = this;
                Context context2 = context;
                switch (i10) {
                    case 0:
                        LinearLayout linearLayout3 = new LinearLayout(context2);
                        linearLayout3.setId(R.id.oneme_section_end_container);
                        linearLayout3.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                        linearLayout3.setOrientation(0);
                        linearLayout3.setGravity(16);
                        linearLayout3.setOnTouchListener(new ek7(new GestureDetector(context2, new pi9(13, atfVar)), 5));
                        atfVar.addView(linearLayout3);
                        return linearLayout3;
                    case 1:
                        return atf.d(context2, atfVar);
                    case 2:
                        return atf.j(context2, atfVar);
                    case 3:
                        return atf.i(context2, atfVar);
                    case 4:
                        return atf.a(context2, atfVar);
                    case 5:
                        return atf.c(context2, atfVar);
                    case 6:
                        return atf.e(context2, atfVar);
                    case 7:
                        return atf.f(context2, atfVar);
                    case 8:
                        return atf.b(context2, atfVar);
                    case 9:
                        return atf.k(context2, atfVar);
                    case 10:
                        LinearLayout linearLayout4 = new LinearLayout(context2);
                        linearLayout4.setId(R.id.oneme_section_start_container);
                        linearLayout4.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 40.0f), gm0.K(40.0f * yl5.d().getDisplayMetrics().density)));
                        linearLayout4.setOrientation(0);
                        linearLayout4.setGravity(16);
                        atfVar.addView(linearLayout4);
                        return linearLayout4;
                    case 11:
                        return atf.g(context2, atfVar);
                    default:
                        return atf.h(context2, atfVar);
                }
            }
        });
        this.m = rx8.P(3, new af7() { // from class: ssf
            @Override // defpackage.af7
            public final Object invoke() {
                int i10 = i2;
                atf atfVar = this;
                Context context2 = context;
                switch (i10) {
                    case 0:
                        LinearLayout linearLayout3 = new LinearLayout(context2);
                        linearLayout3.setId(R.id.oneme_section_end_container);
                        linearLayout3.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                        linearLayout3.setOrientation(0);
                        linearLayout3.setGravity(16);
                        linearLayout3.setOnTouchListener(new ek7(new GestureDetector(context2, new pi9(13, atfVar)), 5));
                        atfVar.addView(linearLayout3);
                        return linearLayout3;
                    case 1:
                        return atf.d(context2, atfVar);
                    case 2:
                        return atf.j(context2, atfVar);
                    case 3:
                        return atf.i(context2, atfVar);
                    case 4:
                        return atf.a(context2, atfVar);
                    case 5:
                        return atf.c(context2, atfVar);
                    case 6:
                        return atf.e(context2, atfVar);
                    case 7:
                        return atf.f(context2, atfVar);
                    case 8:
                        return atf.b(context2, atfVar);
                    case 9:
                        return atf.k(context2, atfVar);
                    case 10:
                        LinearLayout linearLayout4 = new LinearLayout(context2);
                        linearLayout4.setId(R.id.oneme_section_start_container);
                        linearLayout4.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 40.0f), gm0.K(40.0f * yl5.d().getDisplayMetrics().density)));
                        linearLayout4.setOrientation(0);
                        linearLayout4.setGravity(16);
                        atfVar.addView(linearLayout4);
                        return linearLayout4;
                    case 11:
                        return atf.g(context2, atfVar);
                    default:
                        return atf.h(context2, atfVar);
                }
            }
        });
        final int i10 = 4;
        this.n = rx8.P(3, new af7() { // from class: ssf
            @Override // defpackage.af7
            public final Object invoke() {
                int i11 = i10;
                atf atfVar = this;
                Context context2 = context;
                switch (i11) {
                    case 0:
                        LinearLayout linearLayout3 = new LinearLayout(context2);
                        linearLayout3.setId(R.id.oneme_section_end_container);
                        linearLayout3.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                        linearLayout3.setOrientation(0);
                        linearLayout3.setGravity(16);
                        linearLayout3.setOnTouchListener(new ek7(new GestureDetector(context2, new pi9(13, atfVar)), 5));
                        atfVar.addView(linearLayout3);
                        return linearLayout3;
                    case 1:
                        return atf.d(context2, atfVar);
                    case 2:
                        return atf.j(context2, atfVar);
                    case 3:
                        return atf.i(context2, atfVar);
                    case 4:
                        return atf.a(context2, atfVar);
                    case 5:
                        return atf.c(context2, atfVar);
                    case 6:
                        return atf.e(context2, atfVar);
                    case 7:
                        return atf.f(context2, atfVar);
                    case 8:
                        return atf.b(context2, atfVar);
                    case 9:
                        return atf.k(context2, atfVar);
                    case 10:
                        LinearLayout linearLayout4 = new LinearLayout(context2);
                        linearLayout4.setId(R.id.oneme_section_start_container);
                        linearLayout4.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 40.0f), gm0.K(40.0f * yl5.d().getDisplayMetrics().density)));
                        linearLayout4.setOrientation(0);
                        linearLayout4.setGravity(16);
                        atfVar.addView(linearLayout4);
                        return linearLayout4;
                    case 11:
                        return atf.g(context2, atfVar);
                    default:
                        return atf.h(context2, atfVar);
                }
            }
        });
        final int i11 = 6;
        this.o = rx8.P(3, new af7() { // from class: ssf
            @Override // defpackage.af7
            public final Object invoke() {
                int i12 = i11;
                atf atfVar = this;
                Context context2 = context;
                switch (i12) {
                    case 0:
                        LinearLayout linearLayout3 = new LinearLayout(context2);
                        linearLayout3.setId(R.id.oneme_section_end_container);
                        linearLayout3.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                        linearLayout3.setOrientation(0);
                        linearLayout3.setGravity(16);
                        linearLayout3.setOnTouchListener(new ek7(new GestureDetector(context2, new pi9(13, atfVar)), 5));
                        atfVar.addView(linearLayout3);
                        return linearLayout3;
                    case 1:
                        return atf.d(context2, atfVar);
                    case 2:
                        return atf.j(context2, atfVar);
                    case 3:
                        return atf.i(context2, atfVar);
                    case 4:
                        return atf.a(context2, atfVar);
                    case 5:
                        return atf.c(context2, atfVar);
                    case 6:
                        return atf.e(context2, atfVar);
                    case 7:
                        return atf.f(context2, atfVar);
                    case 8:
                        return atf.b(context2, atfVar);
                    case 9:
                        return atf.k(context2, atfVar);
                    case 10:
                        LinearLayout linearLayout4 = new LinearLayout(context2);
                        linearLayout4.setId(R.id.oneme_section_start_container);
                        linearLayout4.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 40.0f), gm0.K(40.0f * yl5.d().getDisplayMetrics().density)));
                        linearLayout4.setOrientation(0);
                        linearLayout4.setGravity(16);
                        atfVar.addView(linearLayout4);
                        return linearLayout4;
                    case 11:
                        return atf.g(context2, atfVar);
                    default:
                        return atf.h(context2, atfVar);
                }
            }
        });
        final int i12 = 7;
        this.p = rx8.P(3, new af7() { // from class: ssf
            @Override // defpackage.af7
            public final Object invoke() {
                int i13 = i12;
                atf atfVar = this;
                Context context2 = context;
                switch (i13) {
                    case 0:
                        LinearLayout linearLayout3 = new LinearLayout(context2);
                        linearLayout3.setId(R.id.oneme_section_end_container);
                        linearLayout3.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                        linearLayout3.setOrientation(0);
                        linearLayout3.setGravity(16);
                        linearLayout3.setOnTouchListener(new ek7(new GestureDetector(context2, new pi9(13, atfVar)), 5));
                        atfVar.addView(linearLayout3);
                        return linearLayout3;
                    case 1:
                        return atf.d(context2, atfVar);
                    case 2:
                        return atf.j(context2, atfVar);
                    case 3:
                        return atf.i(context2, atfVar);
                    case 4:
                        return atf.a(context2, atfVar);
                    case 5:
                        return atf.c(context2, atfVar);
                    case 6:
                        return atf.e(context2, atfVar);
                    case 7:
                        return atf.f(context2, atfVar);
                    case 8:
                        return atf.b(context2, atfVar);
                    case 9:
                        return atf.k(context2, atfVar);
                    case 10:
                        LinearLayout linearLayout4 = new LinearLayout(context2);
                        linearLayout4.setId(R.id.oneme_section_start_container);
                        linearLayout4.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 40.0f), gm0.K(40.0f * yl5.d().getDisplayMetrics().density)));
                        linearLayout4.setOrientation(0);
                        linearLayout4.setGravity(16);
                        atfVar.addView(linearLayout4);
                        return linearLayout4;
                    case 11:
                        return atf.g(context2, atfVar);
                    default:
                        return atf.h(context2, atfVar);
                }
            }
        });
        final int i13 = 8;
        this.q = rx8.P(3, new af7() { // from class: ssf
            @Override // defpackage.af7
            public final Object invoke() {
                int i14 = i13;
                atf atfVar = this;
                Context context2 = context;
                switch (i14) {
                    case 0:
                        LinearLayout linearLayout3 = new LinearLayout(context2);
                        linearLayout3.setId(R.id.oneme_section_end_container);
                        linearLayout3.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                        linearLayout3.setOrientation(0);
                        linearLayout3.setGravity(16);
                        linearLayout3.setOnTouchListener(new ek7(new GestureDetector(context2, new pi9(13, atfVar)), 5));
                        atfVar.addView(linearLayout3);
                        return linearLayout3;
                    case 1:
                        return atf.d(context2, atfVar);
                    case 2:
                        return atf.j(context2, atfVar);
                    case 3:
                        return atf.i(context2, atfVar);
                    case 4:
                        return atf.a(context2, atfVar);
                    case 5:
                        return atf.c(context2, atfVar);
                    case 6:
                        return atf.e(context2, atfVar);
                    case 7:
                        return atf.f(context2, atfVar);
                    case 8:
                        return atf.b(context2, atfVar);
                    case 9:
                        return atf.k(context2, atfVar);
                    case 10:
                        LinearLayout linearLayout4 = new LinearLayout(context2);
                        linearLayout4.setId(R.id.oneme_section_start_container);
                        linearLayout4.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 40.0f), gm0.K(40.0f * yl5.d().getDisplayMetrics().density)));
                        linearLayout4.setOrientation(0);
                        linearLayout4.setGravity(16);
                        atfVar.addView(linearLayout4);
                        return linearLayout4;
                    case 11:
                        return atf.g(context2, atfVar);
                    default:
                        return atf.h(context2, atfVar);
                }
            }
        });
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        this.v = shapeDrawable;
        RippleDrawable rippleDrawableB = col.b(((bs0) pq3.j.h(this).u().c.g).c, null, shapeDrawable);
        this.w = rippleDrawableB;
        this.x = rx8.P(3, new irf(2));
        this.y = osf.b;
        psf.N0.getClass();
        this.z = new ysf(bsf.b, this);
        this.A = new ysf(this);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setMinimumHeight(gm0.K(48.0f * yl5.d().getDisplayMetrics().density));
        setBackground(rippleDrawableB);
        addView(linearLayout2);
        linearLayout.addView(zsfVar);
        linearLayout2.addView(linearLayout);
    }

    public static CheckBox a(Context context, atf atfVar) {
        qjg qjgVarF = so2.F(context, 6);
        so2.C(qjgVarF, atfVar.getCurrentTheme());
        CheckBox checkBox = new CheckBox(context);
        checkBox.setId(R.id.oneme_section_end_checkbox);
        checkBox.setPadding(0, 0, 0, 0);
        checkBox.setButtonDrawable((Drawable) null);
        checkBox.setBackground(qjgVarF);
        checkBox.setClickable(false);
        checkBox.setChecked(true);
        atfVar.getEndContainer().addView(checkBox, new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), gm0.K(24.0f * yl5.d().getDisplayMetrics().density)));
        return checkBox;
    }

    public static v0c b(Context context, atf atfVar) {
        v0c v0cVar = new v0c(context);
        v0cVar.setId(R.id.oneme_settings_itemcontent_counter);
        LinearLayout endContainer = atfVar.getEndContainer();
        ny8 ny8Var = atfVar.l;
        if (endContainer.indexOfChild((View) ny8Var.getValue()) != -1) {
            atfVar.getEndContainer().removeView((View) ny8Var.getValue());
        }
        LinearLayout endContainer2 = atfVar.getEndContainer();
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.setMarginEnd(gm0.K(6.0f * yl5.d().getDisplayMetrics().density));
        endContainer2.addView(v0cVar, marginLayoutParams);
        atfVar.getEndContainer().addView((View) ny8Var.getValue());
        return v0cVar;
    }

    public static TextView c(Context context, atf atfVar) {
        TextView textViewE = qv1.e(context, R.id.oneme_section_upper_text);
        textViewE.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        q9i.a(q9i.i, textViewE);
        textViewE.setTextColor(atfVar.getCurrentTheme().getText().d);
        atfVar.i.addView(textViewE, 0);
        return textViewE;
    }

    public static TextView d(Context context, atf atfVar) {
        TextView textViewE = qv1.e(context, R.id.oneme_section_end_text);
        q9i.a(q9i.g, textViewE);
        int i = xsf.$EnumSwitchMapping$0[atfVar.y.ordinal()] == 1 ? ((fn8) atfVar.getCurrentTheme().u().d.b).d : atfVar.getCurrentTheme().getText().d;
        textViewE.setMaxLines(1);
        textViewE.setMaxWidth(gm0.K(160.0f * yl5.d().getDisplayMetrics().density));
        textViewE.setEllipsize(TextUtils.TruncateAt.END);
        textViewE.setTextColor(i);
        LinearLayout endContainer = atfVar.getEndContainer();
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.setMarginEnd(gm0.K(6.0f * yl5.d().getDisplayMetrics().density));
        endContainer.addView(textViewE, marginLayoutParams);
        return textViewE;
    }

    public static v9c e(Context context, atf atfVar) {
        v9c v9cVar = new v9c(context);
        v9cVar.setChecked(false);
        v9cVar.setShowText(false);
        atfVar.getEndContainer().addView(v9cVar);
        return v9cVar;
    }

    public static s6c f(Context context, atf atfVar) {
        s6c s6cVar = new s6c(context);
        s6cVar.setChecked(false);
        atfVar.getEndContainer().addView(s6cVar);
        return s6cVar;
    }

    public static t6g g(Context context, atf atfVar) {
        t6g t6gVar = new t6g(context);
        t6gVar.setId(R.id.oneme_section_start_icon);
        t6gVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        atfVar.getStartContainer().addView(t6gVar);
        return t6gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kbc getCurrentTheme() {
        int iOrdinal = getThemeDepended().ordinal();
        a8g a8gVar = pq3.j;
        if (iOrdinal == 0) {
            return a8gVar.h(this);
        }
        if (iOrdinal == 1) {
            return a8gVar.l(this).b;
        }
        ore.o();
        return null;
    }

    private static /* synthetic */ void getDescriptionLazy$annotations() {
    }

    private final LinearLayout getEndContainer() {
        return (LinearLayout) this.j.getValue();
    }

    private final LinearLayout getStartContainer() {
        return (LinearLayout) this.f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Matrix getTitleGradientMatrix() {
        return (Matrix) this.x.getValue();
    }

    public static TextView h(Context context, atf atfVar) {
        TextView textViewE = qv1.e(context, R.id.oneme_section_start_text);
        q9i.a(q9i.b, textViewE);
        int i = xsf.$EnumSwitchMapping$0[atfVar.y.ordinal()] == 1 ? ((fn8) atfVar.getCurrentTheme().u().d.b).d : atfVar.getCurrentTheme().getText().d;
        textViewE.setGravity(17);
        textViewE.setMaxLines(1);
        textViewE.setMaxWidth(gm0.K(40.0f * yl5.d().getDisplayMetrics().density));
        textViewE.setEllipsize(TextUtils.TruncateAt.END);
        textViewE.setTextColor(i);
        atfVar.getStartContainer().addView(textViewE, new LinearLayout.LayoutParams(-1, -1));
        return textViewE;
    }

    public static ImageView i(Context context, atf atfVar) {
        ImageView imageViewD = qv1.d(context, R.id.oneme_section_end_custom_icon);
        imageViewD.setImageTintList(ColorStateList.valueOf(atfVar.getCurrentTheme().getIcon().h));
        atfVar.getEndContainer().addView(imageViewD);
        return imageViewD;
    }

    public static ImageView j(Context context, atf atfVar) {
        ImageView imageViewD = qv1.d(context, R.id.oneme_section_end_arrow);
        imageViewD.setImageDrawable(imageViewD.getContext().getDrawable(R.drawable.icon_chevron_right).mutate());
        imageViewD.setImageTintList(ColorStateList.valueOf(atfVar.getCurrentTheme().getIcon().d));
        atfVar.getEndContainer().addView(imageViewD);
        return imageViewD;
    }

    public static TextView k(Context context, atf atfVar) {
        int i;
        TextView textViewE = qv1.e(context, R.id.oneme_section_description);
        textViewE.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        q9i.a(q9i.i, textViewE);
        textViewE.setMaxLines(3);
        int iOrdinal = atfVar.y.ordinal();
        if (iOrdinal != 0) {
            i = iOrdinal != 4 ? atfVar.getCurrentTheme().getText().d : ((fn8) atfVar.getCurrentTheme().u().d.b).d;
        } else {
            i = atfVar.getCurrentTheme().getText().h;
        }
        textViewE.setTextColor(i);
        textViewE.setPadding(0, gm0.K(2.0f * yl5.d().getDisplayMetrics().density), 0, 0);
        atfVar.i.addView(textViewE);
        return textViewE;
    }

    public static void n(LinearLayout linearLayout, ny8 ny8Var) {
        if (ny8Var.d()) {
            if (((View) ny8Var.getValue()).getVisibility() == 0) {
                n7j.a(linearLayout, (View) ny8Var.getValue(), -1);
            } else {
                linearLayout.removeView((View) ny8Var.getValue());
            }
        }
    }

    private final void setupCounter(esf esfVar) {
        boolean zD = cqk.d(esfVar, csf.a);
        ny8 ny8Var = this.q;
        if (zD) {
            v0c v0cVar = (v0c) ny8Var.getValue();
            v0cVar.setVisibility(0);
            v0cVar.setAppearance(p0c.d);
            v0cVar.n();
            return;
        }
        if (esfVar instanceof dsf) {
            v0c v0cVar2 = (v0c) ny8Var.getValue();
            v0cVar2.setVisibility(0);
            dsf dsfVar = (dsf) esfVar;
            v0cVar2.setAppearance(dsfVar.c);
            pu4.c(v0cVar2, Integer.valueOf(dsfVar.a), dsfVar.b, 4);
            return;
        }
        if (esfVar != null) {
            ore.o();
        } else if (ny8Var.d()) {
            ((v0c) ny8Var.getValue()).setVisibility(8);
        }
    }

    private final void setupDescription(CharSequence charSequence) {
        TextView textView = (TextView) this.d.getValue();
        textView.setVisibility(charSequence != null ? 0 : 8);
        textView.setText(charSequence);
        textView.setPadding(textView.getPaddingLeft(), gm0.K(2.0f * yl5.d().getDisplayMetrics().density), textView.getPaddingRight(), textView.getPaddingBottom());
        n7j.a(this.i, textView, null);
    }

    private final void setupEndCheckbox(boolean z) {
        ny8 ny8Var = this.o;
        if (ny8Var.d()) {
            ((v9c) ny8Var.getValue()).setVisibility(8);
        }
        ny8 ny8Var2 = this.k;
        if (ny8Var2.d()) {
            ((TextView) ny8Var2.getValue()).setVisibility(8);
        }
        ny8 ny8Var3 = this.l;
        if (ny8Var3.d()) {
            ((ImageView) ny8Var3.getValue()).setVisibility(8);
        }
        ny8 ny8Var4 = this.p;
        if (ny8Var4.d()) {
            ((s6c) ny8Var4.getValue()).setVisibility(8);
        }
        ny8 ny8Var5 = this.m;
        if (ny8Var5.d()) {
            ((ImageView) ny8Var5.getValue()).setVisibility(8);
        }
        CheckBox checkBox = (CheckBox) this.n.getValue();
        checkBox.setId(R.id.oneme_section_end_checkbox);
        checkBox.setVisibility(0);
        checkBox.setChecked(z);
    }

    private final void setupEndIcon(int i) {
        ny8 ny8Var = this.o;
        if (ny8Var.d()) {
            ((v9c) ny8Var.getValue()).setVisibility(8);
        }
        ny8 ny8Var2 = this.k;
        if (ny8Var2.d()) {
            ((TextView) ny8Var2.getValue()).setVisibility(8);
        }
        ny8 ny8Var3 = this.l;
        if (ny8Var3.d()) {
            ((ImageView) ny8Var3.getValue()).setVisibility(8);
        }
        ny8 ny8Var4 = this.p;
        if (ny8Var4.d()) {
            ((s6c) ny8Var4.getValue()).setVisibility(8);
        }
        ny8 ny8Var5 = this.n;
        if (ny8Var5.d()) {
            ((CheckBox) ny8Var5.getValue()).setVisibility(8);
        }
        ImageView imageView = (ImageView) this.m.getValue();
        imageView.setId(R.id.oneme_settings_itemcontent_end_custom_icon);
        imageView.setVisibility(0);
        imageView.setImageResource(i);
    }

    private final void setupEndText(CharSequence charSequence) {
        ny8 ny8Var = this.o;
        if (ny8Var.d()) {
            ((v9c) ny8Var.getValue()).setVisibility(8);
        }
        ny8 ny8Var2 = this.l;
        if (ny8Var2.d()) {
            ((ImageView) ny8Var2.getValue()).setVisibility(8);
        }
        ny8 ny8Var3 = this.m;
        if (ny8Var3.d()) {
            ((ImageView) ny8Var3.getValue()).setVisibility(8);
        }
        ny8 ny8Var4 = this.p;
        if (ny8Var4.d()) {
            ((s6c) ny8Var4.getValue()).setVisibility(8);
        }
        ny8 ny8Var5 = this.n;
        if (ny8Var5.d()) {
            ((CheckBox) ny8Var5.getValue()).setVisibility(8);
        }
        TextView textView = (TextView) this.k.getValue();
        textView.setId(R.id.oneme_settings_itemcontent_end_text);
        textView.setText(charSequence);
        textView.setVisibility(0);
        textView.setCompoundDrawablesRelative(null, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setupTitleBadge(boolean z) {
        View view = this.r;
        LinearLayout linearLayout = this.c;
        if (!z) {
            if (view != null) {
                linearLayout.removeView(view);
            }
            this.r = null;
            return;
        }
        if (view == null) {
            g1c g1cVar = new g1c(getContext());
            g1cVar.setId(R.id.oneme_section_title_badge);
            g1cVar.setAppearance(f1c.a);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMarginStart(gm0.K(6.0f * yl5.d().getDisplayMetrics().density));
            g1cVar.setLayoutParams(layoutParams);
            g1cVar.setClickable(false);
            g1cVar.setFocusable(false);
            eph ephVar = g1cVar instanceof eph ? (eph) g1cVar : null;
            if (ephVar != null) {
                ephVar.onThemeChanged(getCurrentTheme());
            }
            linearLayout.addView(g1cVar);
            this.r = g1cVar;
        }
    }

    private final void setupUpperText(CharSequence charSequence) {
        TextView textView = (TextView) this.a.getValue();
        textView.setVisibility(charSequence != null ? 0 : 8);
        textView.setText(charSequence);
        textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), gm0.K(2.0f * yl5.d().getDisplayMetrics().density));
        n7j.a(this.i, textView, 0);
    }

    public final psf getModelItem() {
        zv8 zv8Var = C[0];
        return (psf) this.z.b;
    }

    public final usf getThemeDepended() {
        zv8 zv8Var = C[1];
        return (usf) this.A.b;
    }

    public final void o(ynh ynhVar, ynh ynhVar2) {
        if (ynhVar == null || ynhVar2 == ynh.b) {
            setTitle(ynhVar != null ? ynhVar.d(this) : null);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(ynhVar.d(this));
        CharSequence charSequenceD = ynhVar2.d(this);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(charSequenceD);
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(13, true), length, length2, 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(getCurrentTheme().getText().d), length, length2, 33);
        spannableStringBuilder.setSpan(new StyleSpan(1), length, length2, 33);
        setTitle(spannableStringBuilder);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iK = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        int height = getHeight() / 2;
        int paddingStart = getPaddingStart() + iK;
        ny8 ny8Var = this.f;
        if (n7j.o(ny8Var)) {
            LinearLayout linearLayout = (LinearLayout) ny8Var.getValue();
            qyj.M(linearLayout, paddingStart, height - (linearLayout.getMeasuredHeight() / 2), 0, 12);
            paddingStart += linearLayout.getMeasuredWidth() + iK;
        }
        LinearLayout linearLayout2 = this.i;
        qyj.M(linearLayout2, paddingStart, height - (linearLayout2.getMeasuredHeight() / 2), 0, 12);
        ny8 ny8Var2 = this.j;
        if (n7j.o(ny8Var2)) {
            LinearLayout linearLayout3 = (LinearLayout) ny8Var2.getValue();
            qyj.M(linearLayout3, (getMeasuredWidth() - linearLayout3.getMeasuredWidth()) - iK, height - (linearLayout3.getMeasuredHeight() / 2), 0, 12);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int paddingEnd = getPaddingEnd() + getPaddingStart();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int iK = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        int measuredWidth = (size - paddingEnd) - (iK * 2);
        ny8 ny8Var = this.f;
        int iMax = 0;
        if (n7j.o(ny8Var)) {
            LinearLayout linearLayout = (LinearLayout) ny8Var.getValue();
            linearLayout.measure(qv1.a(40.0f, yl5.d().getDisplayMetrics().density, 1073741824), View.MeasureSpec.makeMeasureSpec(gm0.K(40.0f * yl5.d().getDisplayMetrics().density), 1073741824));
            measuredWidth -= linearLayout.getMeasuredWidth() + iK;
            iMax = Math.max(0, linearLayout.getMeasuredHeight());
        }
        ny8 ny8Var2 = this.j;
        if (n7j.o(ny8Var2)) {
            LinearLayout linearLayout2 = (LinearLayout) ny8Var2.getValue();
            linearLayout2.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), i2);
            measuredWidth -= linearLayout2.getMeasuredWidth() + iK;
            iMax = Math.max(iMax, linearLayout2.getMeasuredHeight());
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE);
        LinearLayout linearLayout3 = this.i;
        linearLayout3.measure(iMakeMeasureSpec, i2);
        setMeasuredDimension(size, Math.max(Math.max(iMax, (gm0.K(10.0f * yl5.d().getDisplayMetrics().density) * 2) + linearLayout3.getMeasuredHeight()) + paddingBottom, gm0.K(48.0f * yl5.d().getDisplayMetrics().density)));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0330  */
    /* JADX WARN: Code duplicated, block: B:102:0x0333  */
    /* JADX WARN: Code duplicated, block: B:107:0x0340  */
    /* JADX WARN: Code duplicated, block: B:108:0x0343  */
    /* JADX WARN: Code duplicated, block: B:110:0x0346  */
    /* JADX WARN: Code duplicated, block: B:113:0x0362  */
    /* JADX WARN: Code duplicated, block: B:93:0x031f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0324  */
    /* JADX WARN: Code duplicated, block: B:99:0x032d  */
    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        ColorStateList colorStateListValueOf;
        Drawable drawable;
        Drawable drawable2;
        h1f h1fVar;
        Object obj;
        eph ephVar;
        Drawable drawable3;
        kbc currentTheme = getCurrentTheme();
        this.w.setColor(ColorStateList.valueOf(((bs0) currentTheme.u().c.g).c));
        ny8 ny8Var = this.g;
        if (ny8Var.d()) {
            ((t6g) ny8Var.getValue()).setAlpha(xsf.$EnumSwitchMapping$0[this.y.ordinal()] == 1 ? 0.3f : 1.0f);
        }
        ny8 ny8Var2 = this.o;
        if (ny8Var2.d()) {
            ((v9c) ny8Var2.getValue()).onThemeChanged(currentTheme);
        }
        ny8 ny8Var3 = this.p;
        if (ny8Var3.d()) {
            ((s6c) ny8Var3.getValue()).onThemeChanged(currentTheme);
        }
        ny8 ny8Var4 = this.q;
        if (ny8Var4.d()) {
            ((v0c) ny8Var4.getValue()).onThemeChanged(currentTheme);
        }
        ny8 ny8Var5 = this.k;
        if (ny8Var5.d()) {
            TextView textView = (TextView) ny8Var5.getValue();
            if (xsf.$EnumSwitchMapping$0[this.y.ordinal()] == 1) {
                textView.setTextColor(((fn8) getCurrentTheme().u().d.b).d);
                textView.setCompoundDrawableTintList(ColorStateList.valueOf(((fn8) getCurrentTheme().u().b.a).d));
            } else {
                textView.setTextColor(getCurrentTheme().getText().d);
                textView.setCompoundDrawableTintList(ColorStateList.valueOf(getCurrentTheme().getIcon().d));
            }
        }
        ny8 ny8Var6 = this.l;
        if (ny8Var6.d()) {
            ((ImageView) ny8Var6.getValue()).setImageTintList(ColorStateList.valueOf(currentTheme.getIcon().d));
        }
        ny8 ny8Var7 = this.m;
        if (ny8Var7.d()) {
            ((ImageView) ny8Var7.getValue()).setImageTintList(ColorStateList.valueOf(currentTheme.getIcon().h));
        }
        ny8 ny8Var8 = this.n;
        if (ny8Var8.d()) {
            Drawable background = ((CheckBox) ny8Var8.getValue()).getBackground();
            qjg qjgVar = background instanceof qjg ? (qjg) background : null;
            if (qjgVar != null) {
                so2.C(qjgVar, currentTheme);
            }
        }
        ny8 ny8Var9 = this.a;
        if (ny8Var9.d()) {
            ((TextView) ny8Var9.getValue()).setTextColor(currentTheme.getText().d);
        }
        KeyEvent.Callback callback = this.r;
        eph ephVar2 = callback instanceof eph ? (eph) callback : null;
        if (ephVar2 != null) {
            ephVar2.onThemeChanged(currentTheme);
        }
        ny8 ny8Var10 = this.h;
        if (ny8Var10.d()) {
            TextView textView2 = (TextView) ny8Var10.getValue();
            if (xsf.$EnumSwitchMapping$0[this.y.ordinal()] == 1) {
                textView2.setTextColor(((fn8) getCurrentTheme().u().d.b).d);
                textView2.setCompoundDrawableTintList(ColorStateList.valueOf(((fn8) getCurrentTheme().u().b.a).d));
            } else {
                textView2.setTextColor(getCurrentTheme().getText().d);
                textView2.setCompoundDrawableTintList(ColorStateList.valueOf(getCurrentTheme().getIcon().d));
            }
        }
        int iOrdinal = this.y.ordinal();
        ny8 ny8Var11 = this.d;
        zsf zsfVar = this.b;
        switch (iOrdinal) {
            case 0:
                zsfVar.setTextColor(currentTheme.getText().h);
                if (ny8Var11.d()) {
                    ((TextView) ny8Var11.getValue()).setTextColor(currentTheme.getText().h);
                }
                if (this.B) {
                    colorStateListValueOf = null;
                } else {
                    colorStateListValueOf = ColorStateList.valueOf(currentTheme.getIcon().h);
                }
                drawable = this.e;
                if (drawable != null) {
                    drawable.setTintList(colorStateListValueOf);
                }
                drawable2 = this.e;
                if (drawable2 instanceof h1f) {
                    h1fVar = (h1f) drawable2;
                } else {
                    h1fVar = null;
                }
                if (h1fVar != null && (drawable3 = h1fVar.a) != null) {
                    drawable3.setTintList(colorStateListValueOf);
                }
                obj = this.e;
                if (obj instanceof eph) {
                    ephVar = (eph) obj;
                } else {
                    ephVar = null;
                }
                if (ephVar != null) {
                    ephVar.onThemeChanged(kbcVar);
                }
                o(getModelItem().getTitle(), getModelItem().v());
                if (this.y == osf.f && (zsfVar.getPaint().getShader() instanceof LinearGradient)) {
                    zsfVar.getPaint().setShader(null);
                    zsfVar.invalidate();
                    break;
                }
                break;
            case 1:
                zsfVar.setTextColor(currentTheme.getText().b);
                if (ny8Var11.d()) {
                    ((TextView) ny8Var11.getValue()).setTextColor(currentTheme.getText().d);
                }
                if (this.B) {
                    colorStateListValueOf = null;
                } else {
                    colorStateListValueOf = ColorStateList.valueOf(currentTheme.getIcon().b);
                }
                drawable = this.e;
                if (drawable != null) {
                    drawable.setTintList(colorStateListValueOf);
                }
                drawable2 = this.e;
                if (drawable2 instanceof h1f) {
                    h1fVar = (h1f) drawable2;
                } else {
                    h1fVar = null;
                }
                if (h1fVar != null) {
                    drawable3.setTintList(colorStateListValueOf);
                }
                obj = this.e;
                if (obj instanceof eph) {
                    ephVar = (eph) obj;
                } else {
                    ephVar = null;
                }
                if (ephVar != null) {
                    ephVar.onThemeChanged(kbcVar);
                }
                o(getModelItem().getTitle(), getModelItem().v());
                if (this.y == osf.f) {
                }
                break;
            case 2:
                zsfVar.setTextColor(currentTheme.getText().b);
                if (ny8Var11.d()) {
                    ((TextView) ny8Var11.getValue()).setTextColor(currentTheme.getText().d);
                }
                if (this.B) {
                    colorStateListValueOf = null;
                } else {
                    colorStateListValueOf = ColorStateList.valueOf(currentTheme.getIcon().h);
                }
                drawable = this.e;
                if (drawable != null) {
                    drawable.setTintList(colorStateListValueOf);
                }
                drawable2 = this.e;
                if (drawable2 instanceof h1f) {
                    h1fVar = (h1f) drawable2;
                } else {
                    h1fVar = null;
                }
                if (h1fVar != null) {
                    drawable3.setTintList(colorStateListValueOf);
                }
                obj = this.e;
                if (obj instanceof eph) {
                    ephVar = (eph) obj;
                } else {
                    ephVar = null;
                }
                if (ephVar != null) {
                    ephVar.onThemeChanged(kbcVar);
                }
                o(getModelItem().getTitle(), getModelItem().v());
                if (this.y == osf.f) {
                }
                break;
            case 3:
                zsfVar.setTextColor(currentTheme.getText().j);
                if (ny8Var11.d()) {
                    ((TextView) ny8Var11.getValue()).setTextColor(currentTheme.getText().d);
                }
                if (this.B) {
                    colorStateListValueOf = null;
                } else {
                    colorStateListValueOf = ColorStateList.valueOf(currentTheme.getIcon().j);
                }
                drawable = this.e;
                if (drawable != null) {
                    drawable.setTintList(colorStateListValueOf);
                }
                drawable2 = this.e;
                if (drawable2 instanceof h1f) {
                    h1fVar = (h1f) drawable2;
                } else {
                    h1fVar = null;
                }
                if (h1fVar != null) {
                    drawable3.setTintList(colorStateListValueOf);
                }
                obj = this.e;
                if (obj instanceof eph) {
                    ephVar = (eph) obj;
                } else {
                    ephVar = null;
                }
                if (ephVar != null) {
                    ephVar.onThemeChanged(kbcVar);
                }
                o(getModelItem().getTitle(), getModelItem().v());
                if (this.y == osf.f) {
                }
                break;
            case 4:
                zsfVar.setTextColor(((fn8) currentTheme.u().d.b).d);
                if (ny8Var11.d()) {
                    ((TextView) ny8Var11.getValue()).setTextColor(((fn8) currentTheme.u().d.b).d);
                }
                if (this.B) {
                    colorStateListValueOf = null;
                } else {
                    colorStateListValueOf = ColorStateList.valueOf(((fn8) currentTheme.u().d.b).d);
                }
                drawable = this.e;
                if (drawable != null) {
                    drawable.setTintList(colorStateListValueOf);
                }
                drawable2 = this.e;
                if (drawable2 instanceof h1f) {
                    h1fVar = (h1f) drawable2;
                } else {
                    h1fVar = null;
                }
                if (h1fVar != null) {
                    drawable3.setTintList(colorStateListValueOf);
                }
                obj = this.e;
                if (obj instanceof eph) {
                    ephVar = (eph) obj;
                } else {
                    ephVar = null;
                }
                if (ephVar != null) {
                    ephVar.onThemeChanged(kbcVar);
                }
                o(getModelItem().getTitle(), getModelItem().v());
                if (this.y == osf.f) {
                }
                break;
            case 5:
                zsfVar.setTextColor(currentTheme.getText().b);
                if (ny8Var11.d()) {
                    ((TextView) ny8Var11.getValue()).setTextColor(currentTheme.getText().d);
                }
                colorStateListValueOf = null;
                drawable = this.e;
                if (drawable != null) {
                    drawable.setTintList(colorStateListValueOf);
                }
                drawable2 = this.e;
                if (drawable2 instanceof h1f) {
                    h1fVar = (h1f) drawable2;
                } else {
                    h1fVar = null;
                }
                if (h1fVar != null) {
                    drawable3.setTintList(colorStateListValueOf);
                }
                obj = this.e;
                if (obj instanceof eph) {
                    ephVar = (eph) obj;
                } else {
                    ephVar = null;
                }
                if (ephVar != null) {
                    ephVar.onThemeChanged(kbcVar);
                }
                o(getModelItem().getTitle(), getModelItem().v());
                if (this.y == osf.f) {
                }
                break;
            case 6:
                zsfVar.setTextColor(currentTheme.getText().h);
                zsfVar.getPaint().setColorFilter(null);
                TextPaint paint = zsfVar.getPaint();
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.5f, 1.0f, 0.5f, ((pac) currentTheme.x().f).a, (float[]) null, Shader.TileMode.CLAMP);
                linearGradient.setLocalMatrix(getTitleGradientMatrix());
                paint.setShader(linearGradient);
                if (this.B) {
                    colorStateListValueOf = null;
                } else {
                    colorStateListValueOf = ColorStateList.valueOf(currentTheme.x().b);
                }
                drawable = this.e;
                if (drawable != null) {
                    drawable.setTintList(colorStateListValueOf);
                }
                drawable2 = this.e;
                if (drawable2 instanceof h1f) {
                    h1fVar = (h1f) drawable2;
                } else {
                    h1fVar = null;
                }
                if (h1fVar != null) {
                    drawable3.setTintList(colorStateListValueOf);
                }
                obj = this.e;
                if (obj instanceof eph) {
                    ephVar = (eph) obj;
                } else {
                    ephVar = null;
                }
                if (ephVar != null) {
                    ephVar.onThemeChanged(kbcVar);
                }
                o(getModelItem().getTitle(), getModelItem().v());
                if (this.y == osf.f) {
                }
                break;
            default:
                ore.o();
                break;
        }
    }

    public final void p(boolean z) {
        setupTitleBadge(z);
        requestLayout();
        invalidate();
    }

    public final void setChecked(boolean z) {
        ny8 ny8Var = this.o;
        if (ny8Var.d()) {
            if ((!ny8Var.d() ? false : ((v9c) ny8Var.getValue()).isChecked()) == z) {
                return;
            }
            ((v9c) ny8Var.getValue()).setChecked(z);
        }
    }

    public final void setCounter(esf esfVar) {
        setupCounter(esfVar);
        requestLayout();
        invalidate();
    }

    public final void setDescription(ynh ynhVar) {
        setupDescription(ynhVar != null ? ynhVar.b(getContext()) : null);
        requestLayout();
        invalidate();
    }

    public final void setDisableStartIconText(boolean z) {
        this.B = z;
        ny8 ny8Var = this.g;
        if (z) {
            ((t6g) ny8Var.getValue()).setImageTintList(null);
        } else {
            ((t6g) ny8Var.getValue()).setImageTintList(ColorStateList.valueOf(getCurrentTheme().getIcon().h));
        }
        requestLayout();
        invalidate();
    }

    public final void setEndView(msf msfVar) {
        Drawable drawableMutate;
        ny8 ny8Var = this.l;
        ny8 ny8Var2 = this.n;
        ny8 ny8Var3 = this.m;
        ny8 ny8Var4 = this.p;
        ny8 ny8Var5 = this.k;
        ny8 ny8Var6 = this.o;
        if (msfVar == null) {
            if (ny8Var6.d()) {
                ((v9c) ny8Var6.getValue()).setVisibility(8);
            }
            if (ny8Var5.d()) {
                ((TextView) ny8Var5.getValue()).setVisibility(8);
            }
            if (ny8Var.d()) {
                ((ImageView) ny8Var.getValue()).setVisibility(8);
            }
            if (ny8Var3.d()) {
                ((ImageView) ny8Var3.getValue()).setVisibility(8);
            }
            if (ny8Var4.d()) {
                ((s6c) ny8Var4.getValue()).setVisibility(8);
            }
            if (ny8Var2.d()) {
                ((CheckBox) ny8Var2.getValue()).setVisibility(8);
            }
        } else {
            if (msfVar instanceof ksf) {
                ksf ksfVar = (ksf) msfVar;
                boolean z = ksfVar.a;
                boolean z2 = ksfVar.b;
                if (ny8Var5.d()) {
                    ((TextView) ny8Var5.getValue()).setVisibility(8);
                }
                if (ny8Var.d()) {
                    ((ImageView) ny8Var.getValue()).setVisibility(8);
                }
                if (ny8Var3.d()) {
                    ((ImageView) ny8Var3.getValue()).setVisibility(8);
                }
                if (ny8Var4.d()) {
                    ((s6c) ny8Var4.getValue()).setVisibility(8);
                }
                if (ny8Var2.d()) {
                    ((CheckBox) ny8Var2.getValue()).setVisibility(8);
                }
                v9c v9cVar = (v9c) ny8Var6.getValue();
                v9cVar.setId(R.id.oneme_settings_itemcontent_end_switch);
                v9cVar.setVisibility(0);
                if (v9cVar.isChecked() != z) {
                    v9cVar.setChecked(z);
                }
                v9cVar.setEnabled(z2);
                v9cVar.setClickable(z2);
                v9cVar.setCustomTheme(getThemeDepended() != usf.a ? getCurrentTheme() : null);
            } else if (msfVar instanceof fsf) {
                if (ny8Var6.d()) {
                    ((v9c) ny8Var6.getValue()).setVisibility(8);
                }
                if (ny8Var5.d()) {
                    ((TextView) ny8Var5.getValue()).setVisibility(8);
                }
                if (ny8Var4.d()) {
                    ((s6c) ny8Var4.getValue()).setVisibility(8);
                }
                if (ny8Var3.d()) {
                    ((ImageView) ny8Var3.getValue()).setVisibility(8);
                }
                if (ny8Var2.d()) {
                    ((CheckBox) ny8Var2.getValue()).setVisibility(8);
                }
                ImageView imageView = (ImageView) ny8Var.getValue();
                imageView.setId(R.id.oneme_settings_itemcontent_end_icon);
                imageView.setVisibility(0);
            } else {
                if (msfVar instanceof isf) {
                    isf isfVar = (isf) msfVar;
                    CharSequence charSequenceB = isfVar.a.b(getContext());
                    CharSequence charSequence = charSequenceB != null ? charSequenceB : "";
                    Integer num = isfVar.b;
                    if (ny8Var6.d()) {
                        ((v9c) ny8Var6.getValue()).setVisibility(8);
                    }
                    if (ny8Var4.d()) {
                        ((s6c) ny8Var4.getValue()).setVisibility(8);
                    }
                    TextView textView = (TextView) ny8Var5.getValue();
                    textView.setId(R.id.oneme_settings_itemcontent_end_text);
                    textView.setText(charSequence);
                    textView.setVisibility(0);
                    textView.setCompoundDrawablePadding(6);
                    textView.setCompoundDrawableTintList(ColorStateList.valueOf(getCurrentTheme().getIcon().d));
                    if (num != null) {
                        drawableMutate = textView.getContext().getDrawable(num.intValue()).mutate();
                        drawableMutate.setBounds(0, 0, gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), gm0.K(16.0f * yl5.d().getDisplayMetrics().density));
                    } else {
                        drawableMutate = null;
                    }
                    textView.setCompoundDrawablesRelative(null, null, drawableMutate, null);
                    ImageView imageView2 = (ImageView) ny8Var.getValue();
                    imageView2.setId(R.id.oneme_settings_itemcontent_end_icon);
                    imageView2.setVisibility(0);
                } else if (msfVar instanceof lsf) {
                    CharSequence charSequenceB2 = ((lsf) msfVar).a.b(getContext());
                    setupEndText(charSequenceB2 != null ? charSequenceB2 : "");
                } else if (msfVar instanceof jsf) {
                    jsf jsfVar = (jsf) msfVar;
                    boolean z3 = jsfVar.a;
                    boolean z4 = jsfVar.b;
                    if (ny8Var5.d()) {
                        ((TextView) ny8Var5.getValue()).setVisibility(8);
                    }
                    if (ny8Var.d()) {
                        ((ImageView) ny8Var.getValue()).setVisibility(8);
                    }
                    if (ny8Var3.d()) {
                        ((ImageView) ny8Var3.getValue()).setVisibility(8);
                    }
                    if (ny8Var6.d()) {
                        ((v9c) ny8Var6.getValue()).setVisibility(8);
                    }
                    if (ny8Var2.d()) {
                        ((CheckBox) ny8Var2.getValue()).setVisibility(8);
                    }
                    s6c s6cVar = (s6c) ny8Var4.getValue();
                    s6cVar.setId(R.id.oneme_settings_itemcontent_end_radio);
                    s6cVar.setVisibility(0);
                    s6cVar.setChecked(z3);
                    s6cVar.setEnabled(z4);
                    s6cVar.setOnCheckedChangeListener(new xo3(this, 2));
                } else if (msfVar instanceof hsf) {
                    setupEndIcon(((hsf) msfVar).a);
                } else {
                    if (!(msfVar instanceof gsf)) {
                        ore.o();
                        return;
                    }
                    setupEndCheckbox(((gsf) msfVar).a);
                }
            }
        }
        ny8 ny8Var7 = this.j;
        if (n7j.o(ny8Var7)) {
            LinearLayout linearLayout = (LinearLayout) ny8Var7.getValue();
            ny8 ny8Var8 = this.q;
            if (ny8Var8.d()) {
                getEndContainer().removeView((v0c) ny8Var8.getValue());
            }
            if (ny8Var5.d()) {
                getEndContainer().removeView((TextView) ny8Var5.getValue());
            }
            if (ny8Var.d()) {
                getEndContainer().removeView((ImageView) ny8Var.getValue());
            }
            if (ny8Var3.d()) {
                getEndContainer().removeView((ImageView) ny8Var3.getValue());
            }
            if (ny8Var2.d()) {
                getEndContainer().removeView((CheckBox) ny8Var2.getValue());
            }
            n(linearLayout, ny8Var8);
            n(linearLayout, ny8Var5);
            n(linearLayout, ny8Var);
            n(linearLayout, ny8Var3);
            n(linearLayout, ny8Var6);
            n(linearLayout, ny8Var4);
            n(linearLayout, ny8Var2);
            linearLayout.requestLayout();
            linearLayout.invalidate();
        }
    }

    public final void setItemId(long j) {
    }

    public final void setModelItem(psf psfVar) {
        this.z.B(this, C[0], psfVar);
    }

    public final void setOnSwitchCheckedListener(qf7 qf7Var) {
        if (qf7Var != null) {
            setOnSwitchListener(new pld(3, qf7Var));
        } else {
            setOnSwitchListener(null);
        }
    }

    public final void setOnSwitchListener(final wsf wsfVar) {
        ny8 ny8Var = this.o;
        if (ny8Var.d()) {
            this.s = wsfVar;
            if (wsfVar != null) {
                ((v9c) ny8Var.getValue()).setOnCheckedChangeListener(null);
                ((v9c) ny8Var.getValue()).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: tsf
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        atf atfVar = this.a;
                        if (!atfVar.u && compoundButton.isPressed()) {
                            vsf vsfVar = atfVar.t;
                            if (vsfVar != null) {
                                if (!((ProfileEditScreen) ((lp0) ((qyb) vsfVar).b).g).s1().c.i(atfVar.getModelItem().getItemId(), z)) {
                                    atfVar.u = true;
                                    compoundButton.setChecked(true ^ z);
                                    atfVar.u = false;
                                    return;
                                }
                            }
                            if (atfVar.getModelItem().d() instanceof ksf) {
                                msf msfVarD = atfVar.getModelItem().d();
                                ksf ksfVar = msfVarD instanceof ksf ? (ksf) msfVarD : null;
                                if (ksfVar == null || ksfVar.a != z) {
                                    msf msfVarD2 = atfVar.getModelItem().d();
                                    ksf ksfVar2 = msfVarD2 instanceof ksf ? (ksf) msfVarD2 : null;
                                    if (ksfVar2 != null) {
                                        ksfVar2.a = z;
                                    }
                                }
                            }
                            wsfVar.j(atfVar.getModelItem().getItemId(), z);
                        }
                    }
                });
            } else {
                ((v9c) ny8Var.getValue()).setOnCheckedChangeListener(null);
                this.t = null;
            }
        }
    }

    @Override // defpackage.oqe
    public void setRippleMask(Shape shape) {
        this.v.setShape(shape);
    }

    public final void setStartView(dz8 dz8Var) {
        getStartContainer().setVisibility(dz8Var != null ? 0 : 8);
        ny8 ny8Var = this.g;
        ny8 ny8Var2 = this.h;
        i1f i1fVar = null;
        if (dz8Var == null) {
            if (ny8Var2.d()) {
                ((TextView) ny8Var2.getValue()).setVisibility(8);
            }
            if (ny8Var.d()) {
                t6g t6gVar = (t6g) ny8Var.getValue();
                t6gVar.setVisibility(8);
                t6gVar.setController(null);
                ((wj7) t6gVar.getHierarchy()).i(5, null);
                ((wj7) t6gVar.getHierarchy()).k(null);
                t6gVar.setPadding(0, 0, 0, 0);
            }
        } else if (dz8Var instanceof az8) {
            if (ny8Var.d()) {
                t6g t6gVar2 = (t6g) ny8Var.getValue();
                t6gVar2.setVisibility(8);
                t6gVar2.setController(null);
                ((wj7) t6gVar2.getHierarchy()).i(5, null);
                ((wj7) t6gVar2.getHierarchy()).k(null);
                t6gVar2.setPadding(0, 0, 0, 0);
            }
            TextView textView = (TextView) ny8Var2.getValue();
            textView.setVisibility(0);
            textView.setText(((az8) dz8Var).a);
        } else if (dz8Var instanceof bz8) {
            if (ny8Var2.d()) {
                ((TextView) ny8Var2.getValue()).setVisibility(8);
            }
            t6g t6gVar3 = (t6g) ny8Var.getValue();
            t6gVar3.setVisibility(0);
            t6gVar3.setController(null);
            ((wj7) t6gVar3.getHierarchy()).i(5, null);
            wj7 wj7Var = (wj7) t6gVar3.getHierarchy();
            bz8 bz8Var = (bz8) dz8Var;
            int i = bz8Var.a;
            int iD = qt4.D(bz8Var.c);
            if (iD != 0) {
                if (iD != 1) {
                    ore.o();
                    return;
                }
                i1fVar = i1f.m;
            }
            Drawable h1fVar = i1fVar != null ? new h1f(t6gVar3.getContext().getDrawable(i).mutate(), i1fVar) : t6gVar3.getContext().getDrawable(i).mutate();
            int i2 = bz8Var.b;
            if (i2 != 0) {
                h1fVar.setTint(i2);
            }
            this.e = h1fVar;
            wj7Var.k(h1fVar);
            int iK = gm0.K(yl5.d().getDisplayMetrics().density * 16.0f) / 2;
            int iK2 = gm0.K(16.0f * yl5.d().getDisplayMetrics().density) / 2;
            t6gVar3.setPaddingRelative(iK, iK2, iK, iK2);
        } else {
            if (!(dz8Var instanceof cz8)) {
                ore.o();
                return;
            }
            if (ny8Var2.d()) {
                ((TextView) ny8Var2.getValue()).setVisibility(8);
            }
            t6g t6gVar4 = (t6g) ny8Var.getValue();
            t6gVar4.setVisibility(0);
            ((wj7) t6gVar4.getHierarchy()).i(5, null);
            ((wj7) t6gVar4.getHierarchy()).k(null);
            cz8 cz8Var = (cz8) dz8Var;
            tj0 tj0Var = cz8Var.c;
            if (tj0Var != null && tj0Var != tj0.c && (tj0Var.a != 0 || tj0Var.b.length() != 0)) {
                sj0 sj0Var = new sj0(t6gVar4.getContext(), cz8Var.b, tj0Var, pq3.j.h(t6gVar4));
                ((wj7) t6gVar4.getHierarchy()).i(5, sj0Var);
                this.e = sj0Var;
                t6gVar4.requestLayout();
                t6gVar4.invalidate();
            }
            t1d t1dVar = vd7.a.get();
            t1dVar.j = t6gVar4.getController();
            t1dVar.c = (v78) cz8Var.e.getValue();
            t6gVar4.setController(t1dVar.a());
            int iK3 = gm0.K(0.0f * yl5.d().getDisplayMetrics().density) / 2;
            t6gVar4.setPaddingRelative(iK3, 0, iK3, 0);
        }
        requestLayout();
        invalidate();
    }

    public final void setSwitchInterceptor(vsf vsfVar) {
        this.t = vsfVar;
    }

    public final void setThemeDepended(usf usfVar) {
        this.A.B(this, C[1], usfVar);
    }

    public final void setTitle(CharSequence charSequence) {
        zsf zsfVar = this.b;
        zsfVar.setText(charSequence);
        boolean z = charSequence != null;
        zsfVar.setVisibility(z ? 0 : 8);
        ny8 ny8Var = this.a;
        if (ny8Var.d()) {
            TextView textView = (TextView) ny8Var.getValue();
            textView.setPaddingRelative(textView.getPaddingStart(), textView.getPaddingTop(), textView.getPaddingEnd(), z ? gm0.K(2.0f * yl5.d().getDisplayMetrics().density) : 0);
        }
        requestLayout();
        invalidate();
    }

    public final void setTitleMaxLines(int i) {
        this.b.setMaxLines(i);
    }

    public final void setType(osf osfVar) {
        if (this.y == osfVar) {
            return;
        }
        this.y = osfVar;
        onThemeChanged(pq3.j.h(this));
        requestLayout();
        invalidate();
    }

    public final void setUpperText(ynh ynhVar) {
        setupUpperText(ynhVar != null ? ynhVar.b(getContext()) : null);
        requestLayout();
        invalidate();
    }

    public final void setDescription(CharSequence charSequence) {
        setupDescription(charSequence);
        requestLayout();
        invalidate();
    }

    public final void setUpperText(CharSequence charSequence) {
        setupUpperText(charSequence);
        requestLayout();
        invalidate();
    }

    public final void setTitle(ynh ynhVar) {
        o(ynhVar, ynh.b);
    }
}
