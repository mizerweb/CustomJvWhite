package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.widget.FrameLayout;
import android.widget.ImageView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class t5a {
    public final FrameLayout a;
    public final s5a b;
    public final String c = t5a.class.getName();
    public final xc8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public int h;
    public final ny8 i;

    public t5a(FrameLayout frameLayout, s5a s5aVar) {
        this.a = frameLayout;
        this.b = s5aVar;
        xc8 xc8Var = new xc8(frameLayout.getContext());
        pq3.j.k(frameLayout.getContext());
        xc8Var.setTint(-1);
        this.d = xc8Var;
        final int i = 0;
        af7 af7Var = new af7(this) { // from class: q5a
            public final /* synthetic */ t5a b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                a8g a8gVar = pq3.j;
                t5a t5aVar = this.b;
                switch (i2) {
                    case 0:
                        FrameLayout frameLayout2 = t5aVar.a;
                        Context context = frameLayout2.getContext();
                        a8gVar.k(frameLayout2.getContext());
                        return sb8.D(R.drawable.icon_redo, -1, context);
                    case 1:
                        FrameLayout frameLayout3 = t5aVar.a;
                        Context context2 = frameLayout3.getContext();
                        a8gVar.k(frameLayout3.getContext());
                        return sb8.D(R.drawable.icon_play_fill, -1, context2);
                    case 2:
                        FrameLayout frameLayout4 = t5aVar.a;
                        Context context3 = frameLayout4.getContext();
                        a8gVar.k(frameLayout4.getContext());
                        return sb8.D(R.drawable.icon_pause_fill, -1, context3);
                    default:
                        ImageView imageView = new ImageView(t5aVar.a.getContext());
                        imageView.setId(R.id.oneme_chatmedia_viewer_state_view);
                        imageView.setLayoutParams(new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 52.0f), gm0.K(52.0f * yl5.d().getDisplayMetrics().density), 17));
                        int i3 = ((bs0) a8gVar.l(imageView).b.u().c.g).c;
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        a8gVar.l(imageView);
                        sb8.m0(-1728053248, shapeDrawable);
                        imageView.setBackground(col.c(i3, shapeDrawable, null, 4));
                        x05.j(14.0f, yl5.d().getDisplayMetrics().density, imageView);
                        imageView.setImageDrawable((Drawable) t5aVar.f.getValue());
                        qe7.H(imageView, 300L, new o37(19, t5aVar));
                        return imageView;
                }
            }
        };
        final int i2 = 3;
        this.e = rx8.P(3, af7Var);
        final int i3 = 1;
        this.f = rx8.P(3, new af7(this) { // from class: q5a
            public final /* synthetic */ t5a b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i4 = i3;
                a8g a8gVar = pq3.j;
                t5a t5aVar = this.b;
                switch (i4) {
                    case 0:
                        FrameLayout frameLayout2 = t5aVar.a;
                        Context context = frameLayout2.getContext();
                        a8gVar.k(frameLayout2.getContext());
                        return sb8.D(R.drawable.icon_redo, -1, context);
                    case 1:
                        FrameLayout frameLayout3 = t5aVar.a;
                        Context context2 = frameLayout3.getContext();
                        a8gVar.k(frameLayout3.getContext());
                        return sb8.D(R.drawable.icon_play_fill, -1, context2);
                    case 2:
                        FrameLayout frameLayout4 = t5aVar.a;
                        Context context3 = frameLayout4.getContext();
                        a8gVar.k(frameLayout4.getContext());
                        return sb8.D(R.drawable.icon_pause_fill, -1, context3);
                    default:
                        ImageView imageView = new ImageView(t5aVar.a.getContext());
                        imageView.setId(R.id.oneme_chatmedia_viewer_state_view);
                        imageView.setLayoutParams(new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 52.0f), gm0.K(52.0f * yl5.d().getDisplayMetrics().density), 17));
                        int i5 = ((bs0) a8gVar.l(imageView).b.u().c.g).c;
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        a8gVar.l(imageView);
                        sb8.m0(-1728053248, shapeDrawable);
                        imageView.setBackground(col.c(i5, shapeDrawable, null, 4));
                        x05.j(14.0f, yl5.d().getDisplayMetrics().density, imageView);
                        imageView.setImageDrawable((Drawable) t5aVar.f.getValue());
                        qe7.H(imageView, 300L, new o37(19, t5aVar));
                        return imageView;
                }
            }
        });
        final int i4 = 2;
        this.g = rx8.P(3, new af7(this) { // from class: q5a
            public final /* synthetic */ t5a b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i5 = i4;
                a8g a8gVar = pq3.j;
                t5a t5aVar = this.b;
                switch (i5) {
                    case 0:
                        FrameLayout frameLayout2 = t5aVar.a;
                        Context context = frameLayout2.getContext();
                        a8gVar.k(frameLayout2.getContext());
                        return sb8.D(R.drawable.icon_redo, -1, context);
                    case 1:
                        FrameLayout frameLayout3 = t5aVar.a;
                        Context context2 = frameLayout3.getContext();
                        a8gVar.k(frameLayout3.getContext());
                        return sb8.D(R.drawable.icon_play_fill, -1, context2);
                    case 2:
                        FrameLayout frameLayout4 = t5aVar.a;
                        Context context3 = frameLayout4.getContext();
                        a8gVar.k(frameLayout4.getContext());
                        return sb8.D(R.drawable.icon_pause_fill, -1, context3);
                    default:
                        ImageView imageView = new ImageView(t5aVar.a.getContext());
                        imageView.setId(R.id.oneme_chatmedia_viewer_state_view);
                        imageView.setLayoutParams(new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 52.0f), gm0.K(52.0f * yl5.d().getDisplayMetrics().density), 17));
                        int i6 = ((bs0) a8gVar.l(imageView).b.u().c.g).c;
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        a8gVar.l(imageView);
                        sb8.m0(-1728053248, shapeDrawable);
                        imageView.setBackground(col.c(i6, shapeDrawable, null, 4));
                        x05.j(14.0f, yl5.d().getDisplayMetrics().density, imageView);
                        imageView.setImageDrawable((Drawable) t5aVar.f.getValue());
                        qe7.H(imageView, 300L, new o37(19, t5aVar));
                        return imageView;
                }
            }
        });
        this.h = 1;
        this.i = rx8.P(3, new af7(this) { // from class: q5a
            public final /* synthetic */ t5a b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i5 = i2;
                a8g a8gVar = pq3.j;
                t5a t5aVar = this.b;
                switch (i5) {
                    case 0:
                        FrameLayout frameLayout2 = t5aVar.a;
                        Context context = frameLayout2.getContext();
                        a8gVar.k(frameLayout2.getContext());
                        return sb8.D(R.drawable.icon_redo, -1, context);
                    case 1:
                        FrameLayout frameLayout3 = t5aVar.a;
                        Context context2 = frameLayout3.getContext();
                        a8gVar.k(frameLayout3.getContext());
                        return sb8.D(R.drawable.icon_play_fill, -1, context2);
                    case 2:
                        FrameLayout frameLayout4 = t5aVar.a;
                        Context context3 = frameLayout4.getContext();
                        a8gVar.k(frameLayout4.getContext());
                        return sb8.D(R.drawable.icon_pause_fill, -1, context3);
                    default:
                        ImageView imageView = new ImageView(t5aVar.a.getContext());
                        imageView.setId(R.id.oneme_chatmedia_viewer_state_view);
                        imageView.setLayoutParams(new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 52.0f), gm0.K(52.0f * yl5.d().getDisplayMetrics().density), 17));
                        int i6 = ((bs0) a8gVar.l(imageView).b.u().c.g).c;
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        a8gVar.l(imageView);
                        sb8.m0(-1728053248, shapeDrawable);
                        imageView.setBackground(col.c(i6, shapeDrawable, null, 4));
                        x05.j(14.0f, yl5.d().getDisplayMetrics().density, imageView);
                        imageView.setImageDrawable((Drawable) t5aVar.f.getValue());
                        qe7.H(imageView, 300L, new o37(19, t5aVar));
                        return imageView;
                }
            }
        });
    }

    public final ImageView a() {
        return (ImageView) this.i.getValue();
    }

    public final void b() {
        a().setVisibility(8);
        a().setAlpha(0.0f);
    }

    public final void c() {
        n7j.a(this.a, a(), 1);
    }

    public final void d(int i) {
        ImageView imageViewA;
        float f;
        float f2;
        String str;
        String str2 = this.c;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                if (i == 1) {
                    str = "NONE";
                } else if (i == 2) {
                    str = "PLAY";
                } else if (i == 3) {
                    str = "PAUSE";
                } else if (i != 4) {
                    str = i != 5 ? "null" : "REFRESH";
                } else {
                    str = "LOADING";
                }
                a4cVar.c(je9Var, str2, "Media viewer. New state media page: ".concat(str), null);
            }
        }
        if (i != 1) {
            c();
            e(true);
            if (i == 4) {
                imageViewA = a();
                f = yl5.d().getDisplayMetrics().density;
                f2 = 4.0f;
            } else {
                imageViewA = a();
                f = yl5.d().getDisplayMetrics().density;
                f2 = 14.0f;
            }
            x05.j(f2, f, imageViewA);
        }
        int iD = qt4.D(i);
        if (iD == 0) {
            e(false);
        } else if (iD == 1) {
            a().setImageDrawable((Drawable) this.f.getValue());
        } else if (iD == 2) {
            a().setImageDrawable((Drawable) this.g.getValue());
        } else if (iD == 3) {
            a().setImageDrawable(this.d);
        } else {
            if (iD != 4) {
                ore.o();
                return;
            }
            a().setImageDrawable((Drawable) this.e.getValue());
        }
        this.h = i;
    }

    public final void e(boolean z) {
        a().setVisibility(z ? 0 : 8);
    }
}
