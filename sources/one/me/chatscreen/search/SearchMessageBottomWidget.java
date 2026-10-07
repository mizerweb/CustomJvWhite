package one.me.chatscreen.search;

import android.content.res.ColorStateList;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.af7;
import defpackage.bsb;
import defpackage.ch3;
import defpackage.cs;
import defpackage.d97;
import defpackage.dtd;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.eg4;
import defpackage.fz6;
import defpackage.gm0;
import defpackage.jz;
import defpackage.kbc;
import defpackage.lq4;
import defpackage.ltb;
import defpackage.n09;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.ow0;
import defpackage.pq3;
import defpackage.qt4;
import defpackage.t3f;
import defpackage.u8f;
import defpackage.vqa;
import defpackage.vv;
import defpackage.wf4;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.z8b;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.chatscreen.search.SearchMessageBottomWidget;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/chatscreen/search/SearchMessageBottomWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lt3f;", "scopeId", "(Lt3f;)V", "chat-screen"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SearchMessageBottomWidget extends Widget {
    public static final /* synthetic */ zv8[] h = {new z8b(SearchMessageBottomWidget.class, "parentScopeId", "getParentScopeId()Lone/me/sdk/arch/store/ScopeId;"), zo5.f(zfe.a, SearchMessageBottomWidget.class, "searchResultTextView", "getSearchResultTextView()Landroidx/appcompat/widget/AppCompatTextView;", 0), new dwd(SearchMessageBottomWidget.class, "upButton", "getUpButton()Landroidx/appcompat/widget/AppCompatImageView;", 0), new dwd(SearchMessageBottomWidget.class, "downButton", "getDownButton()Landroidx/appcompat/widget/AppCompatImageView;", 0), new dwd(SearchMessageBottomWidget.class, "separatorView", "getSeparatorView()Landroid/view/View;", 0)};
    public final ny8 a;
    public final ow0 b;
    public final ow0 c;
    public final ow0 d;
    public final ow0 e;
    public boolean f;
    public boolean g;

    public SearchMessageBottomWidget(Bundle bundle) {
        super(bundle);
        vv vvVar = new vv(Widget.ARG_SCOPE_ID, t3f.class);
        final int i = 0;
        zv8 zv8Var = h[0];
        this.a = getSharedViewModel((t3f) vvVar.a(this), u8f.class, null);
        this.b = binding(new af7(this) { // from class: m8f
            public final /* synthetic */ SearchMessageBottomWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                final int i3 = 1;
                a8g a8gVar = pq3.j;
                final SearchMessageBottomWidget searchMessageBottomWidget = this.b;
                switch (i2) {
                    case 0:
                        zv8[] zv8VarArr = SearchMessageBottomWidget.h;
                        AppCompatTextView appCompatTextView = new AppCompatTextView(searchMessageBottomWidget.getContext());
                        appCompatTextView.setId(R.id.chat__bottom_container_search);
                        appCompatTextView.setMaxLines(1);
                        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                        q9i.a(q9i.i, appCompatTextView);
                        appCompatTextView.setTextColor(ColorStateList.valueOf(a8gVar.h(appCompatTextView).getText().d));
                        appCompatTextView.setText(R.string.chat_screen__search_result_not_found);
                        appCompatTextView.setLayoutParams(new uf4(-2, -2));
                        return appCompatTextView;
                    case 1:
                        zv8[] zv8VarArr2 = SearchMessageBottomWidget.h;
                        cs csVar = new cs(searchMessageBottomWidget.getContext());
                        csVar.setId(R.id.chat__bottom_container_search_up_button);
                        csVar.setLayoutParams(new uf4(gm0.K(yl5.d().getDisplayMetrics().density * 32.0f), gm0.K(32.0f * yl5.d().getDisplayMetrics().density)));
                        csVar.setImageResource(R.drawable.icon_arrow_up);
                        csVar.setImageTintList(ColorStateList.valueOf(a8gVar.h(csVar).getText().d));
                        csVar.setContentDescription(csVar.getContext().getString(R.string.chat_screen__search_result_up_button_accessibility));
                        int iK = gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
                        csVar.setPadding(iK, iK, iK, iK);
                        qe7.H(csVar, 300L, new View.OnClickListener() { // from class: n8f
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i4 = i3;
                                SearchMessageBottomWidget searchMessageBottomWidget2 = searchMessageBottomWidget;
                                switch (i4) {
                                    case 0:
                                        if (searchMessageBottomWidget2.g) {
                                            searchMessageBottomWidget2.t1().e.d(false);
                                        }
                                        break;
                                    default:
                                        if (searchMessageBottomWidget2.f) {
                                            searchMessageBottomWidget2.t1().e.d(true);
                                        }
                                        break;
                                }
                            }
                        });
                        int i4 = ((bs0) a8gVar.h(csVar).u().c.g).c;
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(-1);
                        csVar.setBackground(col.b(i4, null, shapeDrawable));
                        return csVar;
                    case 2:
                        zv8[] zv8VarArr3 = SearchMessageBottomWidget.h;
                        cs csVar2 = new cs(searchMessageBottomWidget.getContext());
                        csVar2.setId(R.id.chat__bottom_container_search_down_button);
                        csVar2.setLayoutParams(new uf4(gm0.K(yl5.d().getDisplayMetrics().density * 32.0f), gm0.K(32.0f * yl5.d().getDisplayMetrics().density)));
                        csVar2.setImageResource(R.drawable.icon_arrow_down);
                        csVar2.setImageTintList(ColorStateList.valueOf(a8gVar.h(csVar2).getText().d));
                        csVar2.setContentDescription(csVar2.getContext().getString(R.string.chat_screen__search_result_down_button_accessibility));
                        int iK2 = gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
                        csVar2.setPadding(iK2, iK2, iK2, iK2);
                        final int i5 = 0;
                        qe7.H(csVar2, 300L, new View.OnClickListener() { // from class: n8f
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i6 = i5;
                                SearchMessageBottomWidget searchMessageBottomWidget2 = searchMessageBottomWidget;
                                switch (i6) {
                                    case 0:
                                        if (searchMessageBottomWidget2.g) {
                                            searchMessageBottomWidget2.t1().e.d(false);
                                        }
                                        break;
                                    default:
                                        if (searchMessageBottomWidget2.f) {
                                            searchMessageBottomWidget2.t1().e.d(true);
                                        }
                                        break;
                                }
                            }
                        });
                        int i6 = ((bs0) a8gVar.h(csVar2).u().c.g).c;
                        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                        shapeDrawable2.getPaint().setColor(-1);
                        csVar2.setBackground(col.b(i6, null, shapeDrawable2));
                        return csVar2;
                    default:
                        zv8[] zv8VarArr4 = SearchMessageBottomWidget.h;
                        View view = new View(searchMessageBottomWidget.getContext());
                        view.setId(R.id.chat__bottom_container_search_separator);
                        view.setLayoutParams(new uf4(gm0.K(1.0f * yl5.d().getDisplayMetrics().density), gm0.K(18.0f * yl5.d().getDisplayMetrics().density)));
                        view.setBackgroundColor(a8gVar.h(view).getText().d);
                        return view;
                }
            }
        });
        final int i2 = 1;
        this.c = binding(new af7(this) { // from class: m8f
            public final /* synthetic */ SearchMessageBottomWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                final int i4 = 1;
                a8g a8gVar = pq3.j;
                final SearchMessageBottomWidget searchMessageBottomWidget = this.b;
                switch (i3) {
                    case 0:
                        zv8[] zv8VarArr = SearchMessageBottomWidget.h;
                        AppCompatTextView appCompatTextView = new AppCompatTextView(searchMessageBottomWidget.getContext());
                        appCompatTextView.setId(R.id.chat__bottom_container_search);
                        appCompatTextView.setMaxLines(1);
                        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                        q9i.a(q9i.i, appCompatTextView);
                        appCompatTextView.setTextColor(ColorStateList.valueOf(a8gVar.h(appCompatTextView).getText().d));
                        appCompatTextView.setText(R.string.chat_screen__search_result_not_found);
                        appCompatTextView.setLayoutParams(new uf4(-2, -2));
                        return appCompatTextView;
                    case 1:
                        zv8[] zv8VarArr2 = SearchMessageBottomWidget.h;
                        cs csVar = new cs(searchMessageBottomWidget.getContext());
                        csVar.setId(R.id.chat__bottom_container_search_up_button);
                        csVar.setLayoutParams(new uf4(gm0.K(yl5.d().getDisplayMetrics().density * 32.0f), gm0.K(32.0f * yl5.d().getDisplayMetrics().density)));
                        csVar.setImageResource(R.drawable.icon_arrow_up);
                        csVar.setImageTintList(ColorStateList.valueOf(a8gVar.h(csVar).getText().d));
                        csVar.setContentDescription(csVar.getContext().getString(R.string.chat_screen__search_result_up_button_accessibility));
                        int iK = gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
                        csVar.setPadding(iK, iK, iK, iK);
                        qe7.H(csVar, 300L, new View.OnClickListener() { // from class: n8f
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i6 = i4;
                                SearchMessageBottomWidget searchMessageBottomWidget2 = searchMessageBottomWidget;
                                switch (i6) {
                                    case 0:
                                        if (searchMessageBottomWidget2.g) {
                                            searchMessageBottomWidget2.t1().e.d(false);
                                        }
                                        break;
                                    default:
                                        if (searchMessageBottomWidget2.f) {
                                            searchMessageBottomWidget2.t1().e.d(true);
                                        }
                                        break;
                                }
                            }
                        });
                        int i5 = ((bs0) a8gVar.h(csVar).u().c.g).c;
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(-1);
                        csVar.setBackground(col.b(i5, null, shapeDrawable));
                        return csVar;
                    case 2:
                        zv8[] zv8VarArr3 = SearchMessageBottomWidget.h;
                        cs csVar2 = new cs(searchMessageBottomWidget.getContext());
                        csVar2.setId(R.id.chat__bottom_container_search_down_button);
                        csVar2.setLayoutParams(new uf4(gm0.K(yl5.d().getDisplayMetrics().density * 32.0f), gm0.K(32.0f * yl5.d().getDisplayMetrics().density)));
                        csVar2.setImageResource(R.drawable.icon_arrow_down);
                        csVar2.setImageTintList(ColorStateList.valueOf(a8gVar.h(csVar2).getText().d));
                        csVar2.setContentDescription(csVar2.getContext().getString(R.string.chat_screen__search_result_down_button_accessibility));
                        int iK2 = gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
                        csVar2.setPadding(iK2, iK2, iK2, iK2);
                        final int i6 = 0;
                        qe7.H(csVar2, 300L, new View.OnClickListener() { // from class: n8f
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i7 = i6;
                                SearchMessageBottomWidget searchMessageBottomWidget2 = searchMessageBottomWidget;
                                switch (i7) {
                                    case 0:
                                        if (searchMessageBottomWidget2.g) {
                                            searchMessageBottomWidget2.t1().e.d(false);
                                        }
                                        break;
                                    default:
                                        if (searchMessageBottomWidget2.f) {
                                            searchMessageBottomWidget2.t1().e.d(true);
                                        }
                                        break;
                                }
                            }
                        });
                        int i7 = ((bs0) a8gVar.h(csVar2).u().c.g).c;
                        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                        shapeDrawable2.getPaint().setColor(-1);
                        csVar2.setBackground(col.b(i7, null, shapeDrawable2));
                        return csVar2;
                    default:
                        zv8[] zv8VarArr4 = SearchMessageBottomWidget.h;
                        View view = new View(searchMessageBottomWidget.getContext());
                        view.setId(R.id.chat__bottom_container_search_separator);
                        view.setLayoutParams(new uf4(gm0.K(1.0f * yl5.d().getDisplayMetrics().density), gm0.K(18.0f * yl5.d().getDisplayMetrics().density)));
                        view.setBackgroundColor(a8gVar.h(view).getText().d);
                        return view;
                }
            }
        });
        final int i3 = 2;
        this.d = binding(new af7(this) { // from class: m8f
            public final /* synthetic */ SearchMessageBottomWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i4 = i3;
                final int i5 = 1;
                a8g a8gVar = pq3.j;
                final SearchMessageBottomWidget searchMessageBottomWidget = this.b;
                switch (i4) {
                    case 0:
                        zv8[] zv8VarArr = SearchMessageBottomWidget.h;
                        AppCompatTextView appCompatTextView = new AppCompatTextView(searchMessageBottomWidget.getContext());
                        appCompatTextView.setId(R.id.chat__bottom_container_search);
                        appCompatTextView.setMaxLines(1);
                        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                        q9i.a(q9i.i, appCompatTextView);
                        appCompatTextView.setTextColor(ColorStateList.valueOf(a8gVar.h(appCompatTextView).getText().d));
                        appCompatTextView.setText(R.string.chat_screen__search_result_not_found);
                        appCompatTextView.setLayoutParams(new uf4(-2, -2));
                        return appCompatTextView;
                    case 1:
                        zv8[] zv8VarArr2 = SearchMessageBottomWidget.h;
                        cs csVar = new cs(searchMessageBottomWidget.getContext());
                        csVar.setId(R.id.chat__bottom_container_search_up_button);
                        csVar.setLayoutParams(new uf4(gm0.K(yl5.d().getDisplayMetrics().density * 32.0f), gm0.K(32.0f * yl5.d().getDisplayMetrics().density)));
                        csVar.setImageResource(R.drawable.icon_arrow_up);
                        csVar.setImageTintList(ColorStateList.valueOf(a8gVar.h(csVar).getText().d));
                        csVar.setContentDescription(csVar.getContext().getString(R.string.chat_screen__search_result_up_button_accessibility));
                        int iK = gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
                        csVar.setPadding(iK, iK, iK, iK);
                        qe7.H(csVar, 300L, new View.OnClickListener() { // from class: n8f
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i7 = i5;
                                SearchMessageBottomWidget searchMessageBottomWidget2 = searchMessageBottomWidget;
                                switch (i7) {
                                    case 0:
                                        if (searchMessageBottomWidget2.g) {
                                            searchMessageBottomWidget2.t1().e.d(false);
                                        }
                                        break;
                                    default:
                                        if (searchMessageBottomWidget2.f) {
                                            searchMessageBottomWidget2.t1().e.d(true);
                                        }
                                        break;
                                }
                            }
                        });
                        int i6 = ((bs0) a8gVar.h(csVar).u().c.g).c;
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(-1);
                        csVar.setBackground(col.b(i6, null, shapeDrawable));
                        return csVar;
                    case 2:
                        zv8[] zv8VarArr3 = SearchMessageBottomWidget.h;
                        cs csVar2 = new cs(searchMessageBottomWidget.getContext());
                        csVar2.setId(R.id.chat__bottom_container_search_down_button);
                        csVar2.setLayoutParams(new uf4(gm0.K(yl5.d().getDisplayMetrics().density * 32.0f), gm0.K(32.0f * yl5.d().getDisplayMetrics().density)));
                        csVar2.setImageResource(R.drawable.icon_arrow_down);
                        csVar2.setImageTintList(ColorStateList.valueOf(a8gVar.h(csVar2).getText().d));
                        csVar2.setContentDescription(csVar2.getContext().getString(R.string.chat_screen__search_result_down_button_accessibility));
                        int iK2 = gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
                        csVar2.setPadding(iK2, iK2, iK2, iK2);
                        final int i7 = 0;
                        qe7.H(csVar2, 300L, new View.OnClickListener() { // from class: n8f
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i8 = i7;
                                SearchMessageBottomWidget searchMessageBottomWidget2 = searchMessageBottomWidget;
                                switch (i8) {
                                    case 0:
                                        if (searchMessageBottomWidget2.g) {
                                            searchMessageBottomWidget2.t1().e.d(false);
                                        }
                                        break;
                                    default:
                                        if (searchMessageBottomWidget2.f) {
                                            searchMessageBottomWidget2.t1().e.d(true);
                                        }
                                        break;
                                }
                            }
                        });
                        int i8 = ((bs0) a8gVar.h(csVar2).u().c.g).c;
                        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                        shapeDrawable2.getPaint().setColor(-1);
                        csVar2.setBackground(col.b(i8, null, shapeDrawable2));
                        return csVar2;
                    default:
                        zv8[] zv8VarArr4 = SearchMessageBottomWidget.h;
                        View view = new View(searchMessageBottomWidget.getContext());
                        view.setId(R.id.chat__bottom_container_search_separator);
                        view.setLayoutParams(new uf4(gm0.K(1.0f * yl5.d().getDisplayMetrics().density), gm0.K(18.0f * yl5.d().getDisplayMetrics().density)));
                        view.setBackgroundColor(a8gVar.h(view).getText().d);
                        return view;
                }
            }
        });
        final int i4 = 3;
        this.e = binding(new af7(this) { // from class: m8f
            public final /* synthetic */ SearchMessageBottomWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i5 = i4;
                final int i6 = 1;
                a8g a8gVar = pq3.j;
                final SearchMessageBottomWidget searchMessageBottomWidget = this.b;
                switch (i5) {
                    case 0:
                        zv8[] zv8VarArr = SearchMessageBottomWidget.h;
                        AppCompatTextView appCompatTextView = new AppCompatTextView(searchMessageBottomWidget.getContext());
                        appCompatTextView.setId(R.id.chat__bottom_container_search);
                        appCompatTextView.setMaxLines(1);
                        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                        q9i.a(q9i.i, appCompatTextView);
                        appCompatTextView.setTextColor(ColorStateList.valueOf(a8gVar.h(appCompatTextView).getText().d));
                        appCompatTextView.setText(R.string.chat_screen__search_result_not_found);
                        appCompatTextView.setLayoutParams(new uf4(-2, -2));
                        return appCompatTextView;
                    case 1:
                        zv8[] zv8VarArr2 = SearchMessageBottomWidget.h;
                        cs csVar = new cs(searchMessageBottomWidget.getContext());
                        csVar.setId(R.id.chat__bottom_container_search_up_button);
                        csVar.setLayoutParams(new uf4(gm0.K(yl5.d().getDisplayMetrics().density * 32.0f), gm0.K(32.0f * yl5.d().getDisplayMetrics().density)));
                        csVar.setImageResource(R.drawable.icon_arrow_up);
                        csVar.setImageTintList(ColorStateList.valueOf(a8gVar.h(csVar).getText().d));
                        csVar.setContentDescription(csVar.getContext().getString(R.string.chat_screen__search_result_up_button_accessibility));
                        int iK = gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
                        csVar.setPadding(iK, iK, iK, iK);
                        qe7.H(csVar, 300L, new View.OnClickListener() { // from class: n8f
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i8 = i6;
                                SearchMessageBottomWidget searchMessageBottomWidget2 = searchMessageBottomWidget;
                                switch (i8) {
                                    case 0:
                                        if (searchMessageBottomWidget2.g) {
                                            searchMessageBottomWidget2.t1().e.d(false);
                                        }
                                        break;
                                    default:
                                        if (searchMessageBottomWidget2.f) {
                                            searchMessageBottomWidget2.t1().e.d(true);
                                        }
                                        break;
                                }
                            }
                        });
                        int i7 = ((bs0) a8gVar.h(csVar).u().c.g).c;
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(-1);
                        csVar.setBackground(col.b(i7, null, shapeDrawable));
                        return csVar;
                    case 2:
                        zv8[] zv8VarArr3 = SearchMessageBottomWidget.h;
                        cs csVar2 = new cs(searchMessageBottomWidget.getContext());
                        csVar2.setId(R.id.chat__bottom_container_search_down_button);
                        csVar2.setLayoutParams(new uf4(gm0.K(yl5.d().getDisplayMetrics().density * 32.0f), gm0.K(32.0f * yl5.d().getDisplayMetrics().density)));
                        csVar2.setImageResource(R.drawable.icon_arrow_down);
                        csVar2.setImageTintList(ColorStateList.valueOf(a8gVar.h(csVar2).getText().d));
                        csVar2.setContentDescription(csVar2.getContext().getString(R.string.chat_screen__search_result_down_button_accessibility));
                        int iK2 = gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
                        csVar2.setPadding(iK2, iK2, iK2, iK2);
                        final int i8 = 0;
                        qe7.H(csVar2, 300L, new View.OnClickListener() { // from class: n8f
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i9 = i8;
                                SearchMessageBottomWidget searchMessageBottomWidget2 = searchMessageBottomWidget;
                                switch (i9) {
                                    case 0:
                                        if (searchMessageBottomWidget2.g) {
                                            searchMessageBottomWidget2.t1().e.d(false);
                                        }
                                        break;
                                    default:
                                        if (searchMessageBottomWidget2.f) {
                                            searchMessageBottomWidget2.t1().e.d(true);
                                        }
                                        break;
                                }
                            }
                        });
                        int i9 = ((bs0) a8gVar.h(csVar2).u().c.g).c;
                        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                        shapeDrawable2.getPaint().setColor(-1);
                        csVar2.setBackground(col.b(i9, null, shapeDrawable2));
                        return csVar2;
                    default:
                        zv8[] zv8VarArr4 = SearchMessageBottomWidget.h;
                        View view = new View(searchMessageBottomWidget.getContext());
                        view.setId(R.id.chat__bottom_container_search_separator);
                        view.setLayoutParams(new uf4(gm0.K(1.0f * yl5.d().getDisplayMetrics().density), gm0.K(18.0f * yl5.d().getDisplayMetrics().density)));
                        view.setBackgroundColor(a8gVar.h(view).getText().d);
                        return view;
                }
            }
        });
    }

    public final cs o1() {
        zv8 zv8Var = h[3];
        return (cs) this.d.getValue();
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        wf4 wf4Var = new wf4(getContext());
        wf4Var.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 4.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(4.0f * yl5.d().getDisplayMetrics().density));
        wf4Var.setMinHeight(gm0.K(44.0f * yl5.d().getDisplayMetrics().density));
        wf4Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        wf4Var.addView(p1());
        wf4Var.addView(s1());
        wf4Var.addView(q1());
        wf4Var.addView(o1());
        n1g.N(new vqa(this, (lq4) null, 23), wf4Var);
        eg4 eg4VarH = ch3.h(wf4Var);
        int id = p1().getId();
        eg4VarH.d(id, 6, 0, 6);
        eg4VarH.d(id, 3, 0, 3);
        eg4VarH.d(id, 7, s1().getId(), 6);
        qt4.w(12.0f, yl5.d().getDisplayMetrics().density, new bsb(7, eg4VarH, id));
        eg4VarH.d(id, 4, 0, 4);
        eg4VarH.g(id).d.l0 = true;
        eg4VarH.g(id).d.w = 0.0f;
        int id2 = s1().getId();
        eg4VarH.d(id2, 3, 0, 3);
        eg4VarH.d(id2, 7, q1().getId(), 6);
        qt4.w(10.0f, yl5.d().getDisplayMetrics().density, new bsb(7, eg4VarH, id2));
        eg4VarH.d(id2, 4, 0, 4);
        int id3 = q1().getId();
        eg4VarH.d(id3, 3, 0, 3);
        eg4VarH.d(id3, 7, o1().getId(), 6);
        qt4.w(10.0f, yl5.d().getDisplayMetrics().density, new bsb(7, eg4VarH, id3));
        eg4VarH.d(id3, 4, 0, 4);
        int id4 = o1().getId();
        eg4VarH.d(id4, 3, 0, 3);
        eg4VarH.d(id4, 7, 0, 7);
        eg4VarH.d(id4, 4, 0, 4);
        eg4VarH.a(wf4Var);
        return wf4Var;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        t1().B();
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ltb ltbVarH = getRouter().h();
        if (ltbVarH != null) {
            ltbVarH.a(getViewLifecycleOwner(), t1().f);
        }
        lq4 lq4Var = null;
        int i = 3;
        e9i.j0(new fz6(t1().g, new d97(view, this, lq4Var, 27), i), getViewLifecycleScope());
        e9i.j0(new fz6(new jz(n1g.v(t1().i, this.lifecycleOwner.f(), n09.d), 13), new dtd(this, lq4Var, 14), i), getViewLifecycleScope());
    }

    public final AppCompatTextView p1() {
        zv8 zv8Var = h[1];
        return (AppCompatTextView) this.b.getValue();
    }

    public final View q1() {
        zv8 zv8Var = h[4];
        return (View) this.e.getValue();
    }

    public final kbc r1() {
        return pq3.j.e(getContext()).m();
    }

    public final cs s1() {
        zv8 zv8Var = h[2];
        return (cs) this.c.getValue();
    }

    public final u8f t1() {
        return (u8f) this.a.getValue();
    }

    public final void u1(cs csVar, boolean z) {
        csVar.setImageTintList(ColorStateList.valueOf(z ? r1().getText().b : r1().getText().d));
    }

    public SearchMessageBottomWidget(t3f t3fVar) {
        this(n1g.i(new ylc(Widget.ARG_SCOPE_ID, t3fVar)));
    }
}
