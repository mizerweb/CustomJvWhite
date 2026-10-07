package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.recyclerview.widget.RecyclerView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class ym9 extends tee {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public ym9(int i) {
        this.a = i;
        switch (i) {
            case 2:
                this.b = new nvh(yl5.d().getDisplayMetrics().density * 16.0f);
                this.c = new nt4(yl5.d().getDisplayMetrics().density * 16.0f);
                this.d = new i11(0, yl5.d().getDisplayMetrics().density * 16.0f);
                break;
            default:
                c8b c8bVar = new c8b();
                c8bVar.e(65536, gm0.K(mw7.g(12.0f, mw7.g(24.0f, mw7.g(24.0f, mw7.g(12.0f, mw7.g(12.0f, mw7.g(12.0f, mw7.g(12.0f, mw7.g(12.0f, mw7.g(12.0f, mw7.g(12.0f, mw7.g(12.0f, mw7.g(12.0f, mw7.g(12.0f, mw7.g(12.0f, yl5.d().getDisplayMetrics().density, c8bVar, 1).density, c8bVar, 131072).density, c8bVar, 2).density, c8bVar, 4).density, c8bVar, 8).density, c8bVar, 16).density, c8bVar, 64).density, c8bVar, np0.m).density, c8bVar, np0.n).density, c8bVar, 1024).density, c8bVar, np0.o).density, c8bVar, np0.q).density, c8bVar, np0.r).density, c8bVar, 8192).density * 12.0f));
                c8b c8bVar2 = new c8b();
                c8bVar2.e(np0.q, gm0.K(6.0f * mw7.g(16.0f, mw7.g(8.0f, mw7.g(16.0f, mw7.g(8.0f, mw7.g(8.0f, mw7.g(8.0f, mw7.g(8.0f, mw7.g(8.0f, mw7.g(8.0f, mw7.g(8.0f, mw7.g(8.0f, yl5.d().getDisplayMetrics().density, c8bVar2, 1).density, c8bVar2, 131072).density, c8bVar2, 2).density, c8bVar2, 4).density, c8bVar2, 8).density, c8bVar2, 16).density, c8bVar2, 64).density, c8bVar2, np0.m).density, c8bVar2, np0.n).density, c8bVar2, 1024).density, c8bVar2, np0.o).density));
                c8bVar2.e(np0.r, 0);
                c8bVar2.e(65536, gm0.K(mw7.g(8.0f, yl5.d().getDisplayMetrics().density, c8bVar2, 8192).density * 8.0f));
                c8b c8bVar3 = new c8b();
                c8bVar3.e(65536, gm0.K(8.0f * mw7.g(8.0f, mw7.g(12.0f, mw7.g(3.0f, mw7.g(8.0f, mw7.g(8.0f, mw7.g(8.0f, mw7.g(8.0f, mw7.g(8.0f, mw7.g(8.0f, mw7.g(8.0f, mw7.g(8.0f, mw7.g(8.0f, mw7.g(8.0f, mw7.g(8.0f, yl5.d().getDisplayMetrics().density, c8bVar3, 1).density, c8bVar3, 131072).density, c8bVar3, 2).density, c8bVar3, 4).density, c8bVar3, 8).density, c8bVar3, 16).density, c8bVar3, 64).density, c8bVar3, np0.m).density, c8bVar3, np0.n).density, c8bVar3, np0.o).density, c8bVar3, 1024).density, c8bVar3, np0.q).density, c8bVar3, np0.r).density, c8bVar3, 8192).density));
                this(c8bVar, c8bVar2, c8bVar3, 0);
                break;
        }
    }

    public static Integer i(RecyclerView recyclerView, int i) {
        nee adapter = recyclerView.getAdapter();
        if (adapter != null) {
            return Integer.valueOf(adapter.n(i));
        }
        return null;
    }

    @Override // defpackage.tee
    public void f(Rect rect, View view, RecyclerView recyclerView, hfe hfeVar) {
        int i;
        int i2;
        int i3 = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i3) {
            case 0:
                c8b c8bVar = (c8b) obj3;
                lfe lfeVarS = recyclerView.S(view);
                if (lfeVarS != null && (i = lfeVarS.f) != 0) {
                    int i4 = 536870911 & i;
                    rect.left = c8bVar.c(i4);
                    rect.right = c8bVar.c(i4);
                    if ((i & 1073741824) == 0) {
                        if (lfeVarS.l() != 0 && (i & Integer.MIN_VALUE) == 0) {
                            rect.top = ((c8b) obj2).c(i4);
                        }
                        if (lfeVarS.l() != hfeVar.b() - 1 && (i & 536870912) == 0) {
                            rect.bottom = ((c8b) obj).c(i4);
                            break;
                        }
                    }
                }
                break;
            case 1:
                c8b c8bVar2 = (c8b) obj3;
                lfe lfeVarS2 = recyclerView.S(view);
                if (lfeVarS2 != null && (i2 = lfeVarS2.f) != 0) {
                    int i5 = 268435455 & i2;
                    rect.left = c8bVar2.c(i5);
                    rect.right = c8bVar2.c(i5);
                    if ((i2 & 1073741824) == 0) {
                        if (lfeVarS2.l() != 0 && (i2 & Integer.MIN_VALUE) == 0) {
                            rect.top = ((c8b) obj2).c(i5);
                        }
                        if (lfeVarS2.l() != hfeVar.b() - 1 && (i2 & 536870912) == 0) {
                            rect.bottom = ((c8b) obj).c(i5);
                            break;
                        }
                    }
                }
                break;
            default:
                super.f(rect, view, recyclerView, hfeVar);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x020d  */
    /* JADX WARN: Code duplicated, block: B:127:0x0210 A[SYNTHETIC] */
    @Override // defpackage.tee
    public void g(Canvas canvas, RecyclerView recyclerView, hfe hfeVar) {
        Integer numI;
        Integer numI2;
        Integer numI3;
        Integer numI4;
        Integer numI5;
        Integer numI6;
        Integer numI7;
        Integer numI8;
        Integer numI9;
        switch (this.a) {
            case 2:
                nvh nvhVar = (nvh) this.b;
                i11 i11Var = (i11) this.d;
                int iK = gm0.K(48.0f * yl5.d().getDisplayMetrics().density);
                int iK2 = gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
                int i = 0;
                while (true) {
                    if (i < recyclerView.getChildCount()) {
                        int i2 = i + 1;
                        View childAt = recyclerView.getChildAt(i);
                        if (childAt == null) {
                            ore.i();
                        } else {
                            ViewOutlineProvider viewOutlineProvider = null;
                            bni bniVar = childAt instanceof bni ? (bni) childAt : null;
                            if (bniVar != null) {
                                int iP = RecyclerView.P(bniVar);
                                nee adapter = recyclerView.getAdapter();
                                Integer numValueOf = adapter != null ? Integer.valueOf(adapter.l()) : null;
                                if (iP != -1 && numValueOf != null) {
                                    if (iP == 0) {
                                        int i3 = iK + iK2;
                                        if (bniVar.getHeight() != i3) {
                                            bniVar.getLayoutParams().height = i3;
                                            bniVar.setPadding(bniVar.getPaddingLeft(), iK2, bniVar.getPaddingRight(), 0);
                                        }
                                    } else {
                                        Integer numI10 = i(recyclerView, iP);
                                        if (numI10 != null && numI10.intValue() == R.id.oneme_folders_list_create_folder_view_type) {
                                            int i4 = iK + iK2;
                                            if (bniVar.getHeight() != i4) {
                                                bniVar.getLayoutParams().height = i4;
                                                bniVar.setPadding(bniVar.getPaddingLeft(), 0, bniVar.getPaddingRight(), iK2);
                                            }
                                        } else {
                                            if (iP == numValueOf.intValue() - 1 && (numI8 = i(recyclerView, iP)) != null && numI8.intValue() == R.id.oneme_folders_list_recommended_folder_view_type && ((numI9 = i(recyclerView, iP - 1)) == null || numI9.intValue() != R.id.oneme_folders_list_recommended_folder_view_type)) {
                                                int i5 = (iK2 * 2) + iK;
                                                if (bniVar.getHeight() != i5) {
                                                    bniVar.getLayoutParams().height = i5;
                                                    bniVar.setPadding(bniVar.getPaddingLeft(), iK2, bniVar.getPaddingRight(), iK2);
                                                }
                                                viewOutlineProvider = (nt4) this.c;
                                            } else if (iP == numValueOf.intValue() - 1 && (numI6 = i(recyclerView, iP)) != null && numI6.intValue() == R.id.oneme_folders_list_recommended_folder_view_type && ((numI7 = i(recyclerView, iP - 1)) == null || numI7.intValue() != R.id.oneme_folders_list_recommended_folder_view_type)) {
                                                int i6 = iK + iK2;
                                                if (bniVar.getHeight() != i6) {
                                                    bniVar.getLayoutParams().height = i6;
                                                    bniVar.setPadding(bniVar.getPaddingLeft(), 0, bniVar.getPaddingRight(), iK2);
                                                }
                                            } else if (iP == numValueOf.intValue() - 1 && (numI4 = i(recyclerView, iP)) != null && numI4.intValue() == R.id.oneme_folders_list_recommended_folder_view_type && (numI5 = i(recyclerView, iP - 1)) != null && numI5.intValue() == R.id.oneme_folders_list_recommended_folder_view_type) {
                                                int i7 = iK + iK2;
                                                if (bniVar.getHeight() != i7) {
                                                    bniVar.getLayoutParams().height = i7;
                                                    bniVar.setPadding(bniVar.getPaddingLeft(), 0, bniVar.getPaddingRight(), iK2);
                                                }
                                            } else {
                                                Integer numI11 = i(recyclerView, iP);
                                                if (numI11 != null && numI11.intValue() == R.id.oneme_folders_list_recommended_folder_view_type && ((numI3 = i(recyclerView, iP - 1)) == null || numI3.intValue() != R.id.oneme_folders_list_recommended_folder_view_type)) {
                                                    int i8 = iK + iK2;
                                                    if (bniVar.getHeight() != i8) {
                                                        bniVar.getLayoutParams().height = i8;
                                                        bniVar.setPadding(bniVar.getPaddingLeft(), iK2, bniVar.getPaddingRight(), 0);
                                                    }
                                                } else if (iP == numValueOf.intValue() - 1 && (numI = i(recyclerView, iP)) != null && numI.intValue() == R.id.oneme_folders_list_user_folder_view_type && (numI2 = i(recyclerView, iP - 1)) != null && numI2.intValue() == R.id.oneme_folders_list_user_folder_view_type) {
                                                    int i9 = iK + iK2;
                                                    if (bniVar.getHeight() != i9) {
                                                        bniVar.getLayoutParams().height = i9;
                                                        bniVar.setPadding(bniVar.getPaddingLeft(), 0, bniVar.getPaddingRight(), iK2);
                                                    }
                                                } else {
                                                    bniVar.getLayoutParams().height = iK;
                                                    bniVar.setPadding(bniVar.getPaddingLeft(), 0, bniVar.getPaddingRight(), 0);
                                                }
                                            }
                                            bniVar.setOutlineProvider(viewOutlineProvider);
                                            if (bniVar.getOutlineProvider() != null) {
                                                bniVar.setClipToOutline(true);
                                            }
                                        }
                                        viewOutlineProvider = i11Var;
                                        bniVar.setOutlineProvider(viewOutlineProvider);
                                        if (bniVar.getOutlineProvider() != null) {
                                            bniVar.setClipToOutline(true);
                                        }
                                    }
                                    viewOutlineProvider = nvhVar;
                                    bniVar.setOutlineProvider(viewOutlineProvider);
                                    if (bniVar.getOutlineProvider() != null) {
                                        bniVar.setClipToOutline(true);
                                    }
                                }
                            }
                            i = i2;
                        }
                    }
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ym9(c8b c8bVar, c8b c8bVar2, c8b c8bVar3, int i) {
        this.a = i;
        this.b = c8bVar;
        this.c = c8bVar2;
        this.d = c8bVar3;
    }
}
