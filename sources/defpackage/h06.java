package defpackage;

import android.view.View;
import android.widget.ImageView;
import java.util.Arrays;
import kotlin.collections.a;
import one.me.stories.edit.EditStoryScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h06 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ImageView b;
    public final /* synthetic */ EditStoryScreen c;

    public /* synthetic */ h06(EditStoryScreen editStoryScreen, ImageView imageView) {
        this.a = 3;
        this.c = editStoryScreen;
        this.b = imageView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        nt7 nt7Var;
        lq4 lq4Var = null;
        int i = 1;
        switch (this.a) {
            case 0:
                ImageView imageView = this.b;
                EditStoryScreen editStoryScreen = this.c;
                zv8[] zv8VarArr = EditStoryScreen.A1;
                p0m.a(imageView, kt7.CLOCK_TICK);
                editStoryScreen.C1().U();
                break;
            case 1:
                ImageView imageView2 = this.b;
                EditStoryScreen editStoryScreen2 = this.c;
                zv8[] zv8VarArr2 = EditStoryScreen.A1;
                p0m.a(imageView2, kt7.CLOCK_TICK);
                p26 p26VarC1 = editStoryScreen2.C1();
                je9 je9Var = je9.f;
                p26VarC1.s.b();
                hb9 hb9VarI = p26VarC1.I();
                if (hb9VarI != null || ((Boolean) p26VarC1.G.a.getValue()).booleanValue()) {
                    if (hb9VarI == null || !hb9VarI.c()) {
                        if (((Boolean) p26VarC1.G.a.getValue()).booleanValue()) {
                            vo8 vo8Var = (vo8) p26VarC1.B.m(p26VarC1, p26.W1[6]);
                            if (vo8Var == null || !vo8Var.isActive()) {
                                p26VarC1.P(h16.a);
                            }
                            break;
                        } else if (hb9VarI != null && hb9VarI.b()) {
                            p3c p3cVar = p26VarC1.B;
                            zv8[] zv8VarArr3 = p26.W1;
                            vo8 vo8Var2 = (vo8) p3cVar.m(p26VarC1, zv8VarArr3[6]);
                            if (vo8Var2 != null && vo8Var2.isActive()) {
                                String str = p26VarC1.j;
                                a4c a4cVar = gm0.f;
                                if (a4cVar != null && a4cVar.b(je9Var)) {
                                    vo8 vo8Var3 = (vo8) p26VarC1.B.m(p26VarC1, zv8VarArr3[6]);
                                    Boolean boolValueOf = vo8Var3 != null ? Boolean.valueOf(vo8Var3.isActive()) : null;
                                    a4cVar.c(je9Var, str, "media editor: onDrawClicked isActive: " + boolValueOf + ", isPhoto: " + hb9VarI.b(), null);
                                }
                            } else {
                                p26VarC1.P(new g16(hb9VarI));
                            }
                            break;
                        }
                    } else {
                        String strA = hb9VarI.a();
                        if (strA != null) {
                            a8j.x(p26VarC1.E1, new e06(strA, p26VarC1.c));
                        } else {
                            String str2 = p26VarC1.j;
                            a4c a4cVar2 = gm0.f;
                            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                                a4cVar2.c(je9Var, str2, "media editor: onDrawClicked video uri is null", null);
                            }
                        }
                        break;
                    }
                } else {
                    String str3 = p26VarC1.j;
                    a4c a4cVar3 = gm0.f;
                    if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                        a4cVar3.c(je9Var, str3, "media editor: onDrawClicked no current item", null);
                    }
                    break;
                }
                break;
            case 2:
                ImageView imageView3 = this.b;
                EditStoryScreen editStoryScreen3 = this.c;
                zv8[] zv8VarArr4 = EditStoryScreen.A1;
                p0m.a(imageView3, kt7.CLOCK_TICK);
                p26 p26VarC2 = editStoryScreen3.C1();
                p26VarC2.s.b();
                p26VarC2.y.B(p26VarC2, p26.W1[3], yab.h0(p26VarC2.b, ((n0c) p26VarC2.H()).a(), 2, new d26(p26VarC2, lq4Var, i)));
                break;
            default:
                EditStoryScreen editStoryScreen4 = this.c;
                ImageView imageView4 = this.b;
                zv8[] zv8VarArr5 = EditStoryScreen.A1;
                p26 p26VarC3 = editStoryScreen4.C1();
                int iIntValue = ((Number) p26VarC3.g.X4.a(e5d.S6[311]).i()).intValue();
                if (p26VarC3.i.b().size() >= iIntValue) {
                    a8j.x(p26VarC3.F1, new z06(new rnh(R.plurals.oneme_stories_link_limit_reached, iIntValue, a.n1(Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue)}, 1))), Integer.valueOf(R.drawable.icon_info_fill), bc1.k(26.0f, yl5.d().getDisplayMetrics().density), 4));
                    nt7Var = mt7.REJECT;
                } else {
                    a8j.x(p26VarC3.E1, f06.b);
                    nt7Var = kt7.CLOCK_TICK;
                }
                p0m.a(imageView4, nt7Var);
                break;
        }
    }

    public /* synthetic */ h06(ImageView imageView, EditStoryScreen editStoryScreen, int i) {
        this.a = i;
        this.b = imageView;
        this.c = editStoryScreen;
    }
}
