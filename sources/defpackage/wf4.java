package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Guideline;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;

/* JADX INFO: loaded from: classes.dex */
public class wf4 extends ViewGroup {
    public static g0g r;
    public final SparseArray a;
    public final ArrayList b;
    public final ig4 c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public int i;
    public eg4 j;
    public fik k;
    public int l;
    public HashMap m;
    public final SparseArray n;
    public final vf4 o;
    public int p;
    public int q;

    public wf4(Context context) {
        super(context);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new ig4();
        this.d = 0;
        this.e = 0;
        this.f = Integer.MAX_VALUE;
        this.g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 257;
        this.j = null;
        this.k = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = new SparseArray();
        this.o = new vf4(this, this);
        this.p = 0;
        this.q = 0;
        r(null);
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static g0g getSharedValues() {
        if (r == null) {
            r = new g0g();
        }
        return r;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof uf4;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((sf4) arrayList.get(i)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        int i6 = (int) ((i3 / 1080.0f) * width);
                        int i7 = (int) ((i4 / 1920.0f) * height);
                        int i8 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i6;
                        float f2 = i7;
                        float f3 = i6 + ((int) ((i5 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = i7 + i8;
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.h = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new uf4(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        uf4 uf4Var = new uf4(context, attributeSet);
        uf4Var.a = -1;
        uf4Var.b = -1;
        uf4Var.c = -1.0f;
        uf4Var.d = true;
        uf4Var.e = -1;
        uf4Var.f = -1;
        uf4Var.g = -1;
        uf4Var.h = -1;
        uf4Var.i = -1;
        uf4Var.j = -1;
        uf4Var.k = -1;
        uf4Var.l = -1;
        uf4Var.m = -1;
        uf4Var.n = -1;
        uf4Var.o = -1;
        uf4Var.p = -1;
        uf4Var.q = 0;
        uf4Var.r = 0.0f;
        uf4Var.s = -1;
        uf4Var.t = -1;
        uf4Var.u = -1;
        uf4Var.v = -1;
        uf4Var.w = Integer.MIN_VALUE;
        uf4Var.x = Integer.MIN_VALUE;
        uf4Var.y = Integer.MIN_VALUE;
        uf4Var.z = Integer.MIN_VALUE;
        uf4Var.A = Integer.MIN_VALUE;
        uf4Var.B = Integer.MIN_VALUE;
        uf4Var.C = Integer.MIN_VALUE;
        uf4Var.D = 0;
        uf4Var.E = 0.5f;
        uf4Var.F = 0.5f;
        uf4Var.G = null;
        uf4Var.H = -1.0f;
        uf4Var.I = -1.0f;
        uf4Var.J = 0;
        uf4Var.K = 0;
        uf4Var.L = 0;
        uf4Var.M = 0;
        uf4Var.N = 0;
        uf4Var.O = 0;
        uf4Var.P = 0;
        uf4Var.Q = 0;
        uf4Var.R = 1.0f;
        uf4Var.S = 1.0f;
        uf4Var.T = -1;
        uf4Var.U = -1;
        uf4Var.V = -1;
        uf4Var.W = false;
        uf4Var.X = false;
        uf4Var.Y = null;
        uf4Var.Z = 0;
        uf4Var.a0 = true;
        uf4Var.b0 = true;
        uf4Var.c0 = false;
        uf4Var.d0 = false;
        uf4Var.e0 = false;
        uf4Var.f0 = -1;
        uf4Var.g0 = -1;
        uf4Var.h0 = -1;
        uf4Var.i0 = -1;
        uf4Var.j0 = Integer.MIN_VALUE;
        uf4Var.k0 = Integer.MIN_VALUE;
        uf4Var.l0 = 0.5f;
        uf4Var.p0 = new hg4();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e3e.b);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            int i2 = tf4.a.get(index);
            switch (i2) {
                case 1:
                    uf4Var.V = typedArrayObtainStyledAttributes.getInt(index, uf4Var.V);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, uf4Var.p);
                    uf4Var.p = resourceId;
                    if (resourceId == -1) {
                        uf4Var.p = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 3:
                    uf4Var.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, uf4Var.q);
                    break;
                case 4:
                    float f = typedArrayObtainStyledAttributes.getFloat(index, uf4Var.r) % 360.0f;
                    uf4Var.r = f;
                    if (f < 0.0f) {
                        uf4Var.r = (360.0f - f) % 360.0f;
                    }
                    break;
                case 5:
                    uf4Var.a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, uf4Var.a);
                    break;
                case 6:
                    uf4Var.b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, uf4Var.b);
                    break;
                case 7:
                    uf4Var.c = typedArrayObtainStyledAttributes.getFloat(index, uf4Var.c);
                    break;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, uf4Var.e);
                    uf4Var.e = resourceId2;
                    if (resourceId2 == -1) {
                        uf4Var.e = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, uf4Var.f);
                    uf4Var.f = resourceId3;
                    if (resourceId3 == -1) {
                        uf4Var.f = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, uf4Var.g);
                    uf4Var.g = resourceId4;
                    if (resourceId4 == -1) {
                        uf4Var.g = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, uf4Var.h);
                    uf4Var.h = resourceId5;
                    if (resourceId5 == -1) {
                        uf4Var.h = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 12:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, uf4Var.i);
                    uf4Var.i = resourceId6;
                    if (resourceId6 == -1) {
                        uf4Var.i = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, uf4Var.j);
                    uf4Var.j = resourceId7;
                    if (resourceId7 == -1) {
                        uf4Var.j = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 14:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, uf4Var.k);
                    uf4Var.k = resourceId8;
                    if (resourceId8 == -1) {
                        uf4Var.k = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, uf4Var.l);
                    uf4Var.l = resourceId9;
                    if (resourceId9 == -1) {
                        uf4Var.l = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, uf4Var.m);
                    uf4Var.m = resourceId10;
                    if (resourceId10 == -1) {
                        uf4Var.m = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 17:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, uf4Var.s);
                    uf4Var.s = resourceId11;
                    if (resourceId11 == -1) {
                        uf4Var.s = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 18:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, uf4Var.t);
                    uf4Var.t = resourceId12;
                    if (resourceId12 == -1) {
                        uf4Var.t = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 19:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, uf4Var.u);
                    uf4Var.u = resourceId13;
                    if (resourceId13 == -1) {
                        uf4Var.u = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, uf4Var.v);
                    uf4Var.v = resourceId14;
                    if (resourceId14 == -1) {
                        uf4Var.v = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 21:
                    uf4Var.w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, uf4Var.w);
                    break;
                case 22:
                    uf4Var.x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, uf4Var.x);
                    break;
                case 23:
                    uf4Var.y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, uf4Var.y);
                    break;
                case 24:
                    uf4Var.z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, uf4Var.z);
                    break;
                case 25:
                    uf4Var.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, uf4Var.A);
                    break;
                case 26:
                    uf4Var.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, uf4Var.B);
                    break;
                case 27:
                    uf4Var.W = typedArrayObtainStyledAttributes.getBoolean(index, uf4Var.W);
                    break;
                case 28:
                    uf4Var.X = typedArrayObtainStyledAttributes.getBoolean(index, uf4Var.X);
                    break;
                case 29:
                    uf4Var.E = typedArrayObtainStyledAttributes.getFloat(index, uf4Var.E);
                    break;
                case 30:
                    uf4Var.F = typedArrayObtainStyledAttributes.getFloat(index, uf4Var.F);
                    break;
                case 31:
                    int i3 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    uf4Var.L = i3;
                    if (i3 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                    }
                    break;
                case 32:
                    int i4 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    uf4Var.M = i4;
                    if (i4 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                    }
                    break;
                case 33:
                    try {
                        uf4Var.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, uf4Var.N);
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, uf4Var.N) == -2) {
                            uf4Var.N = -2;
                        }
                    }
                    break;
                case 34:
                    try {
                        uf4Var.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, uf4Var.P);
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, uf4Var.P) == -2) {
                            uf4Var.P = -2;
                        }
                    }
                    break;
                case vg8.l /* 35 */:
                    uf4Var.R = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, uf4Var.R));
                    uf4Var.L = 2;
                    break;
                case 36:
                    try {
                        uf4Var.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, uf4Var.O);
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, uf4Var.O) == -2) {
                            uf4Var.O = -2;
                        }
                    }
                    break;
                case LangUtils.HASH_OFFSET /* 37 */:
                    try {
                        uf4Var.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, uf4Var.Q);
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, uf4Var.Q) == -2) {
                            uf4Var.Q = -2;
                        }
                    }
                    break;
                case 38:
                    uf4Var.S = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, uf4Var.S));
                    uf4Var.M = 2;
                    break;
                default:
                    switch (i2) {
                        case 44:
                            eg4.k(uf4Var, typedArrayObtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            uf4Var.H = typedArrayObtainStyledAttributes.getFloat(index, uf4Var.H);
                            break;
                        case 46:
                            uf4Var.I = typedArrayObtainStyledAttributes.getFloat(index, uf4Var.I);
                            break;
                        case 47:
                            uf4Var.J = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            uf4Var.K = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            uf4Var.T = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, uf4Var.T);
                            break;
                        case 50:
                            uf4Var.U = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, uf4Var.U);
                            break;
                        case 51:
                            uf4Var.Y = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, uf4Var.n);
                            uf4Var.n = resourceId15;
                            if (resourceId15 == -1) {
                                uf4Var.n = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 53:
                            int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, uf4Var.o);
                            uf4Var.o = resourceId16;
                            if (resourceId16 == -1) {
                                uf4Var.o = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 54:
                            uf4Var.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, uf4Var.D);
                            break;
                        case 55:
                            uf4Var.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, uf4Var.C);
                            break;
                        default:
                            switch (i2) {
                                case 64:
                                    eg4.j(uf4Var, typedArrayObtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    eg4.j(uf4Var, typedArrayObtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    uf4Var.Z = typedArrayObtainStyledAttributes.getInt(index, uf4Var.Z);
                                    break;
                                case 67:
                                    uf4Var.d = typedArrayObtainStyledAttributes.getBoolean(index, uf4Var.d);
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        uf4Var.a();
        return uf4Var;
    }

    public int getMaxHeight() {
        return this.g;
    }

    public int getMaxWidth() {
        return this.f;
    }

    public int getMinHeight() {
        return this.e;
    }

    public int getMinWidth() {
        return this.d;
    }

    public int getOptimizationLevel() {
        return this.c.C0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        ig4 ig4Var = this.c;
        if (ig4Var.j == null) {
            int id2 = getId();
            if (id2 != -1) {
                ig4Var.j = getContext().getResources().getResourceEntryName(id2);
            } else {
                ig4Var.j = "parent";
            }
        }
        if (ig4Var.g0 == null) {
            ig4Var.g0 = ig4Var.j;
            Log.v("ConstraintLayout", " setDebugName " + ig4Var.g0);
        }
        for (hg4 hg4Var : ig4Var.p0) {
            View view = hg4Var.e0;
            if (view != null) {
                if (hg4Var.j == null && (id = view.getId()) != -1) {
                    hg4Var.j = getContext().getResources().getResourceEntryName(id);
                }
                if (hg4Var.g0 == null) {
                    hg4Var.g0 = hg4Var.j;
                    Log.v("ConstraintLayout", " setDebugName " + hg4Var.g0);
                }
            }
        }
        ig4Var.l(sb);
        return sb.toString();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            uf4 uf4Var = (uf4) childAt.getLayoutParams();
            hg4 hg4Var = uf4Var.p0;
            if (childAt.getVisibility() != 8 || uf4Var.d0 || uf4Var.e0 || zIsInEditMode) {
                int iP = hg4Var.p();
                int iQ = hg4Var.q();
                childAt.layout(iP, iQ, hg4Var.o() + iP, hg4Var.i() + iQ);
            }
        }
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((sf4) arrayList.get(i6)).getClass();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:207:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:209:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:212:0x0405  */
    /* JADX WARN: Code duplicated, block: B:219:0x0428  */
    /* JADX WARN: Code duplicated, block: B:221:0x0439  */
    /* JADX WARN: Code duplicated, block: B:223:0x0445  */
    /* JADX WARN: Code duplicated, block: B:224:0x0451  */
    /* JADX WARN: Code duplicated, block: B:226:0x045a  */
    /* JADX WARN: Code duplicated, block: B:229:0x0463  */
    /* JADX WARN: Code duplicated, block: B:232:0x046b  */
    /* JADX WARN: Code duplicated, block: B:305:0x058d  */
    /* JADX WARN: Code duplicated, block: B:366:0x06d9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:367:0x06db  */
    /* JADX WARN: Code duplicated, block: B:369:0x06df  */
    /* JADX WARN: Code duplicated, block: B:370:0x06e4  */
    /* JADX WARN: Code duplicated, block: B:371:0x06f1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:372:0x06f3  */
    /* JADX WARN: Code duplicated, block: B:374:0x0700  */
    /* JADX WARN: Code duplicated, block: B:376:0x0704  */
    /* JADX WARN: Code duplicated, block: B:378:0x0707  */
    /* JADX WARN: Code duplicated, block: B:379:0x070e  */
    /* JADX WARN: Code duplicated, block: B:382:0x071a  */
    /* JADX WARN: Code duplicated, block: B:384:0x0720  */
    /* JADX WARN: Code duplicated, block: B:390:0x0755  */
    /* JADX WARN: Code duplicated, block: B:391:0x0758  */
    /* JADX WARN: Code duplicated, block: B:394:0x0760  */
    /* JADX WARN: Code duplicated, block: B:395:0x0763  */
    /* JADX WARN: Code duplicated, block: B:398:0x078b  */
    /* JADX WARN: Code duplicated, block: B:402:0x0794  */
    /* JADX WARN: Code duplicated, block: B:404:0x0797  */
    /* JADX WARN: Code duplicated, block: B:406:0x079a  */
    /* JADX WARN: Code duplicated, block: B:408:0x07b3  */
    /* JADX WARN: Code duplicated, block: B:410:0x07b8  */
    /* JADX WARN: Code duplicated, block: B:413:0x07bf  */
    /* JADX WARN: Code duplicated, block: B:414:0x07c1  */
    /* JADX WARN: Code duplicated, block: B:416:0x07c4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:420:0x07d0  */
    /* JADX WARN: Code duplicated, block: B:423:0x07d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:425:0x07de  */
    /* JADX WARN: Code duplicated, block: B:435:0x07fb A[PHI: r1 r5
  0x07fb: PHI (r1v12 boolean) = (r1v11 boolean), (r1v112 boolean) binds: [B:403:0x0795, B:740:0x07fb] A[DONT_GENERATE, DONT_INLINE]
  0x07fb: PHI (r5v6 int[]) = (r5v5 int[]), (r5v44 int[]) binds: [B:403:0x0795, B:740:0x07fb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:437:0x0803 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:438:0x0805 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:443:0x080e  */
    /* JADX WARN: Code duplicated, block: B:445:0x0823  */
    /* JADX WARN: Code duplicated, block: B:449:0x0832  */
    /* JADX WARN: Code duplicated, block: B:451:0x0836  */
    /* JADX WARN: Code duplicated, block: B:453:0x083c  */
    /* JADX WARN: Code duplicated, block: B:456:0x0845 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:500:0x0949  */
    /* JADX WARN: Code duplicated, block: B:502:0x0967  */
    /* JADX WARN: Code duplicated, block: B:504:0x096a  */
    /* JADX WARN: Code duplicated, block: B:509:0x098c  */
    /* JADX WARN: Code duplicated, block: B:518:0x09a9  */
    /* JADX WARN: Code duplicated, block: B:540:0x09e5  */
    /* JADX WARN: Code duplicated, block: B:542:0x09f3  */
    /* JADX WARN: Code duplicated, block: B:545:0x09ff A[LOOP:21: B:543:0x09f9->B:545:0x09ff, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:547:0x0a42  */
    /* JADX WARN: Code duplicated, block: B:550:0x0a60  */
    /* JADX WARN: Code duplicated, block: B:551:0x0a66  */
    /* JADX WARN: Code duplicated, block: B:553:0x0a6a  */
    /* JADX WARN: Code duplicated, block: B:555:0x0a74 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:556:0x0a76  */
    /* JADX WARN: Code duplicated, block: B:557:0x0a78  */
    /* JADX WARN: Code duplicated, block: B:559:0x0a7b  */
    /* JADX WARN: Code duplicated, block: B:560:0x0a7d  */
    /* JADX WARN: Code duplicated, block: B:562:0x0a82  */
    /* JADX WARN: Code duplicated, block: B:564:0x0a8c  */
    /* JADX WARN: Code duplicated, block: B:566:0x0a8f  */
    /* JADX WARN: Code duplicated, block: B:568:0x0a93  */
    /* JADX WARN: Code duplicated, block: B:570:0x0aa4  */
    /* JADX WARN: Code duplicated, block: B:572:0x0ab0  */
    /* JADX WARN: Code duplicated, block: B:573:0x0ab7  */
    /* JADX WARN: Code duplicated, block: B:578:0x0ac1  */
    /* JADX WARN: Code duplicated, block: B:589:0x0ae5  */
    /* JADX WARN: Code duplicated, block: B:595:0x0af1  */
    /* JADX WARN: Code duplicated, block: B:597:0x0af4  */
    /* JADX WARN: Code duplicated, block: B:621:0x0b2b  */
    /* JADX WARN: Code duplicated, block: B:624:0x0b30  */
    /* JADX WARN: Code duplicated, block: B:628:0x0b45 A[LOOP:14: B:627:0x0b43->B:628:0x0b45, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:631:0x0b51  */
    /* JADX WARN: Code duplicated, block: B:633:0x0b54 A[LOOP:15: B:632:0x0b52->B:633:0x0b54, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:636:0x0b6a  */
    /* JADX WARN: Code duplicated, block: B:638:0x0b6f  */
    /* JADX WARN: Code duplicated, block: B:640:0x0b76  */
    /* JADX WARN: Code duplicated, block: B:642:0x0b7a  */
    /* JADX WARN: Code duplicated, block: B:645:0x0b80  */
    /* JADX WARN: Code duplicated, block: B:646:0x0b82  */
    /* JADX WARN: Code duplicated, block: B:649:0x0b9a A[LOOP:16: B:648:0x0b98->B:649:0x0b9a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:653:0x0ba9  */
    /* JADX WARN: Code duplicated, block: B:655:0x0baf  */
    /* JADX WARN: Code duplicated, block: B:657:0x0bbb  */
    /* JADX WARN: Code duplicated, block: B:658:0x0bbe  */
    /* JADX WARN: Code duplicated, block: B:664:0x0bcc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:669:0x0bde A[PHI: r17
  0x0bde: PHI (r17v6 int) = (r17v4 int), (r17v4 int), (r17v7 int) binds: [B:662:0x0bc9, B:668:0x0bdc, B:657:0x0bbb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:672:0x0bfd  */
    /* JADX WARN: Code duplicated, block: B:675:0x0c13  */
    /* JADX WARN: Code duplicated, block: B:677:0x0c18  */
    /* JADX WARN: Code duplicated, block: B:680:0x0c38  */
    /* JADX WARN: Code duplicated, block: B:682:0x0c3c  */
    /* JADX WARN: Code duplicated, block: B:684:0x0c3f  */
    /* JADX WARN: Code duplicated, block: B:686:0x0c44  */
    /* JADX WARN: Code duplicated, block: B:689:0x0c63  */
    /* JADX WARN: Code duplicated, block: B:691:0x0c67  */
    /* JADX WARN: Code duplicated, block: B:694:0x0c6c  */
    /* JADX WARN: Code duplicated, block: B:700:0x0c93 A[LOOP:17: B:651:0x0ba6->B:700:0x0c93, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:740:0x07fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:751:0x09d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:767:0x0b34 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:772:0x0ca6 A[EDGE_INSN: B:772:0x0ca6->B:701:0x0ca6 BREAK  A[LOOP:17: B:651:0x0ba6->B:700:0x0c93], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:776:0x0c72 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int iMax;
        int i3;
        int iMax2;
        int i4;
        int iO;
        int[] iArr;
        char c;
        int i5;
        int i6;
        ig4 ig4Var;
        ArrayList arrayList;
        vf4 vf4Var;
        int size;
        int iO2;
        int i7;
        boolean zQ;
        boolean z;
        boolean z2;
        int[] iArr2;
        int i8;
        boolean z3;
        boolean z4;
        vf4 vf4Var2;
        int i9;
        boolean zP;
        int i10;
        int size2;
        int i11;
        int[] iArr3;
        boolean z5;
        boolean z6;
        int i12;
        int i13;
        int i14;
        int i15;
        int iMax3;
        int iMax4;
        int i16;
        int i17;
        int i18;
        boolean z7;
        boolean z8;
        int i19;
        vf4 vf4Var3;
        hg4 hg4Var;
        int i20;
        int iO3;
        int i21;
        boolean z9;
        boolean z10;
        int i22;
        vf4 vf4Var4;
        int iO4;
        int i23;
        int i24;
        int size3;
        boolean zS;
        vf4 vf4Var5;
        int i25;
        wf4 wf4Var;
        int childCount;
        ArrayList arrayList2;
        int i26;
        int size4;
        int i27;
        hg4 hg4Var2;
        int iH;
        int i28;
        boolean z11;
        cz7 cz7Var;
        bti btiVar;
        int iMin;
        boolean z12;
        int i29;
        ig4 ig4Var2;
        int i30;
        int i31;
        boolean z13;
        boolean z14;
        ArrayList<zvj> arrayList3;
        int i32;
        int i33;
        int i34;
        int i35;
        boolean z15;
        Iterator it;
        boolean z16;
        zvj zvjVar;
        int i36;
        boolean z17;
        hg4 hg4Var3;
        int i37;
        int[] iArr4;
        boolean z18;
        boolean z19;
        boolean z20;
        byte b;
        int i38;
        int i39;
        hg4 hg4Var4;
        hg4 hg4Var5;
        int i40;
        int i41;
        hg4 hg4Var6;
        int i42;
        int i43;
        int i44;
        int i45;
        hg4 hg4Var7;
        uf4 uf4Var;
        int i46;
        int i47;
        int i48;
        float f;
        float f2;
        int i49;
        int i50;
        hg4 hg4Var8;
        int i51;
        float f3;
        hg4 hg4Var9;
        int i52;
        int i53;
        float fAbs;
        int i54;
        SparseArray sparseArray;
        ArrayList arrayList4;
        String str;
        int iD;
        int i55;
        hg4 hg4Var10;
        wf4 wf4Var2 = this;
        if (wf4Var2.p == i) {
            int i56 = wf4Var2.q;
        }
        int i57 = 1;
        int i58 = 0;
        if (!wf4Var2.h) {
            int childCount2 = wf4Var2.getChildCount();
            for (int i59 = 0; i59 < childCount2; i59++) {
                if (wf4Var2.getChildAt(i59).isLayoutRequested()) {
                    wf4Var2.h = true;
                    break;
                }
            }
        }
        wf4Var2.p = i;
        wf4Var2.q = i2;
        int i60 = 4194304;
        boolean z21 = (wf4Var2.getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == wf4Var2.getLayoutDirection();
        ig4 ig4Var3 = wf4Var2.c;
        ig4Var3.u0 = z21;
        ks6 ks6Var = ig4Var3.q0;
        th5 th5Var = ig4Var3.r0;
        int i61 = 4;
        if (wf4Var2.h) {
            wf4Var2.h = false;
            int childCount3 = wf4Var2.getChildCount();
            int i62 = 0;
            while (true) {
                if (i62 >= childCount3) {
                    b = false;
                    break;
                } else {
                    if (wf4Var2.getChildAt(i62).isLayoutRequested()) {
                        b = true;
                        break;
                    }
                    i62++;
                }
            }
            if (b != false) {
                boolean zIsInEditMode = wf4Var2.isInEditMode();
                int childCount4 = wf4Var2.getChildCount();
                for (int i63 = 0; i63 < childCount4; i63++) {
                    hg4 hg4VarQ = wf4Var2.q(wf4Var2.getChildAt(i63));
                    if (hg4VarQ != null) {
                        hg4VarQ.A();
                    }
                }
                SparseArray sparseArray2 = wf4Var2.a;
                Object obj = null;
                if (zIsInEditMode) {
                    int i64 = 0;
                    while (i64 < childCount4) {
                        View childAt = wf4Var2.getChildAt(i64);
                        try {
                            try {
                                String resourceName = wf4Var2.getResources().getResourceName(childAt.getId());
                                Integer numValueOf = Integer.valueOf(childAt.getId());
                                if (resourceName != null) {
                                    if (wf4Var2.m == null) {
                                        wf4Var2.m = new HashMap();
                                    }
                                    int iIndexOf = resourceName.indexOf("/");
                                    i55 = i57;
                                    try {
                                        wf4Var2.m.put(iIndexOf != -1 ? resourceName.substring(iIndexOf + 1) : resourceName, numValueOf);
                                    } catch (Resources.NotFoundException unused) {
                                    }
                                } else {
                                    i55 = i57;
                                }
                                int iIndexOf2 = resourceName.indexOf(47);
                                if (iIndexOf2 != -1) {
                                    resourceName = resourceName.substring(iIndexOf2 + 1);
                                }
                                int id = childAt.getId();
                                if (id != 0) {
                                    View viewFindViewById = (View) sparseArray2.get(id);
                                    if (viewFindViewById == null && (viewFindViewById = wf4Var2.findViewById(id)) != null && viewFindViewById != wf4Var2 && viewFindViewById.getParent() == wf4Var2) {
                                        wf4Var2.onViewAdded(viewFindViewById);
                                    }
                                    hg4Var10 = viewFindViewById == wf4Var2 ? ig4Var3 : viewFindViewById == null ? null : ((uf4) viewFindViewById.getLayoutParams()).p0;
                                }
                                hg4Var10.g0 = resourceName;
                            } catch (Resources.NotFoundException unused2) {
                                i55 = i57;
                            }
                        } catch (Resources.NotFoundException unused3) {
                            i55 = i57;
                        }
                        i64++;
                        i57 = i55;
                    }
                }
                int i65 = i57;
                if (wf4Var2.l != -1) {
                    for (int i66 = 0; i66 < childCount4; i66++) {
                        wf4Var2.getChildAt(i66).getId();
                    }
                }
                eg4 eg4Var = wf4Var2.j;
                if (eg4Var != null) {
                    eg4Var.b(wf4Var2);
                }
                ig4Var3.p0.clear();
                ArrayList arrayList5 = wf4Var2.b;
                int size5 = arrayList5.size();
                if (size5 > 0) {
                    int i67 = 0;
                    while (i67 < size5) {
                        sf4 sf4Var = (sf4) arrayList5.get(i67);
                        HashMap map = sf4Var.g;
                        if (sf4Var.isInEditMode()) {
                            sf4Var.setIds(sf4Var.e);
                        }
                        tp0 tp0Var = sf4Var.d;
                        if (tp0Var == null) {
                            sparseArray = sparseArray2;
                            arrayList4 = arrayList5;
                        } else {
                            tp0Var.q0 = i58;
                            Arrays.fill(tp0Var.p0, obj);
                            int i68 = i58;
                            while (i68 < sf4Var.b) {
                                int i69 = sf4Var.a[i68];
                                View view = (View) sparseArray2.get(i69);
                                if (view == null && (iD = sf4Var.d(wf4Var2, (str = (String) map.get(Integer.valueOf(i69))))) != 0) {
                                    sf4Var.a[i68] = iD;
                                    map.put(Integer.valueOf(iD), str);
                                    view = (View) sparseArray2.get(iD);
                                }
                                View view2 = view;
                                if (view2 != null) {
                                    tp0 tp0Var2 = sf4Var.d;
                                    hg4 hg4VarQ2 = wf4Var2.q(view2);
                                    tp0Var2.getClass();
                                    if (hg4VarQ2 != tp0Var2 && hg4VarQ2 != null) {
                                        int i70 = tp0Var2.q0 + 1;
                                        hg4[] hg4VarArr = tp0Var2.p0;
                                        if (i70 > hg4VarArr.length) {
                                            tp0Var2.p0 = (hg4[]) Arrays.copyOf(hg4VarArr, hg4VarArr.length * 2);
                                        }
                                        hg4[] hg4VarArr2 = tp0Var2.p0;
                                        int i71 = tp0Var2.q0;
                                        hg4VarArr2[i71] = hg4VarQ2;
                                        tp0Var2.q0 = i71 + 1;
                                    }
                                }
                                i68++;
                                sparseArray2 = sparseArray2;
                                arrayList5 = arrayList5;
                            }
                            sparseArray = sparseArray2;
                            arrayList4 = arrayList5;
                            sf4Var.d.getClass();
                        }
                        i67++;
                        sparseArray2 = sparseArray;
                        arrayList5 = arrayList4;
                        i58 = 0;
                        obj = null;
                    }
                }
                for (int i72 = 0; i72 < childCount4; i72++) {
                    wf4Var2.getChildAt(i72);
                }
                SparseArray sparseArray3 = wf4Var2.n;
                sparseArray3.clear();
                sparseArray3.put(0, ig4Var3);
                sparseArray3.put(wf4Var2.getId(), ig4Var3);
                for (int i73 = 0; i73 < childCount4; i73++) {
                    View childAt2 = wf4Var2.getChildAt(i73);
                    sparseArray3.put(childAt2.getId(), wf4Var2.q(childAt2));
                }
                int i74 = 0;
                while (i74 < childCount4) {
                    View childAt3 = wf4Var2.getChildAt(i74);
                    hg4 hg4VarQ3 = wf4Var2.q(childAt3);
                    if (hg4VarQ3 == null) {
                        i38 = childCount4;
                    } else {
                        uf4 uf4Var2 = (uf4) childAt3.getLayoutParams();
                        ig4Var3.p0.add(hg4VarQ3);
                        hg4 hg4Var11 = hg4VarQ3.S;
                        if (hg4Var11 != null) {
                            ((ig4) hg4Var11).p0.remove(hg4VarQ3);
                            hg4VarQ3.A();
                        }
                        hg4VarQ3.S = ig4Var3;
                        uf4Var2.a();
                        hg4VarQ3.f0 = childAt3.getVisibility();
                        hg4VarQ3.e0 = childAt3;
                        if (childAt3 instanceof sf4) {
                            boolean z22 = ig4Var3.u0;
                            sp0 sp0Var = (sp0) ((sf4) childAt3);
                            int i75 = sp0Var.h;
                            sp0Var.i = i75;
                            if (z22) {
                                if (i75 == 5) {
                                    sp0Var.i = i65;
                                } else if (i75 == 6) {
                                    sp0Var.i = 0;
                                }
                            } else if (i75 == 5) {
                                sp0Var.i = 0;
                            } else if (i75 == 6) {
                                sp0Var.i = 1;
                            }
                            if (hg4VarQ3 instanceof tp0) {
                                ((tp0) hg4VarQ3).r0 = sp0Var.i;
                            }
                        }
                        if (uf4Var2.d0) {
                            or7 or7Var = (or7) hg4VarQ3;
                            int i76 = uf4Var2.m0;
                            int i77 = uf4Var2.n0;
                            float f4 = uf4Var2.o0;
                            if (f4 != -1.0f) {
                                if (f4 > -1.0f) {
                                    or7Var.p0 = f4;
                                    or7Var.q0 = -1;
                                    or7Var.r0 = -1;
                                }
                            } else if (i76 != -1) {
                                if (i76 > -1) {
                                    or7Var.p0 = -1.0f;
                                    or7Var.q0 = i76;
                                    or7Var.r0 = -1;
                                }
                            } else if (i77 != -1 && i77 > -1) {
                                or7Var.p0 = -1.0f;
                                or7Var.q0 = -1;
                                or7Var.r0 = i77;
                            }
                            i38 = childCount4;
                        } else {
                            int i78 = uf4Var2.f0;
                            int i79 = uf4Var2.g0;
                            int i80 = uf4Var2.h0;
                            int i81 = uf4Var2.i0;
                            int i82 = uf4Var2.j0;
                            int i83 = uf4Var2.k0;
                            float f5 = uf4Var2.l0;
                            int i84 = uf4Var2.p;
                            i38 = childCount4;
                            if (i84 != -1) {
                                hg4 hg4Var12 = (hg4) sparseArray3.get(i84);
                                if (hg4Var12 != null) {
                                    float f6 = uf4Var2.r;
                                    hg4VarQ3.t(7, 7, uf4Var2.q, 0, hg4Var12);
                                    hg4VarQ3.D = f6;
                                }
                                uf4Var = uf4Var2;
                                hg4Var8 = hg4VarQ3;
                                i51 = 3;
                                i47 = 4;
                                i48 = 3;
                                f = 0.0f;
                                wf4Var2 = this;
                            } else {
                                if (i78 != -1) {
                                    hg4 hg4Var13 = (hg4) sparseArray3.get(i78);
                                    if (hg4Var13 != null) {
                                        i39 = 2;
                                        hg4VarQ3.t(2, 2, ((ViewGroup.MarginLayoutParams) uf4Var2).leftMargin, i82, hg4Var13);
                                    } else {
                                        i39 = 2;
                                    }
                                } else {
                                    i39 = 2;
                                    if (i79 != -1 && (hg4Var4 = (hg4) sparseArray3.get(i79)) != null) {
                                        int i85 = i61;
                                        hg4VarQ3.t(2, i85, ((ViewGroup.MarginLayoutParams) uf4Var2).leftMargin, i82, hg4Var4);
                                        i61 = i85;
                                    }
                                }
                                if (i80 != -1) {
                                    hg4 hg4Var14 = (hg4) sparseArray3.get(i80);
                                    if (hg4Var14 != null) {
                                        hg4VarQ3.t(i61, i39, ((ViewGroup.MarginLayoutParams) uf4Var2).rightMargin, i83, hg4Var14);
                                    }
                                } else if (i81 != -1 && (hg4Var5 = (hg4) sparseArray3.get(i81)) != null) {
                                    hg4VarQ3.t(i61, i61, ((ViewGroup.MarginLayoutParams) uf4Var2).rightMargin, i83, hg4Var5);
                                }
                                int i86 = uf4Var2.i;
                                if (i86 != -1) {
                                    hg4 hg4Var15 = (hg4) sparseArray3.get(i86);
                                    if (hg4Var15 != null) {
                                        hg4VarQ3.t(3, 3, ((ViewGroup.MarginLayoutParams) uf4Var2).topMargin, uf4Var2.x, hg4Var15);
                                        i40 = 3;
                                    } else {
                                        i40 = 3;
                                    }
                                    i41 = -1;
                                } else {
                                    i40 = 3;
                                    int i87 = uf4Var2.j;
                                    i41 = -1;
                                    if (i87 != -1 && (hg4Var6 = (hg4) sparseArray3.get(i87)) != null) {
                                        f5 = f5;
                                        hg4VarQ3.t(3, 5, ((ViewGroup.MarginLayoutParams) uf4Var2).topMargin, uf4Var2.x, hg4Var6);
                                        i40 = 3;
                                        i42 = 5;
                                    }
                                    i43 = uf4Var2.k;
                                    if (i43 != i41) {
                                        hg4Var9 = (hg4) sparseArray3.get(i43);
                                        if (hg4Var9 != null) {
                                            hg4VarQ3.t(i42, i40, ((ViewGroup.MarginLayoutParams) uf4Var2).bottomMargin, uf4Var2.z, hg4Var9);
                                        }
                                        i44 = i40;
                                    } else {
                                        i44 = i40;
                                        i45 = uf4Var2.l;
                                        if (i45 != i41 && (hg4Var7 = (hg4) sparseArray3.get(i45)) != null) {
                                            hg4VarQ3.t(i42, i42, ((ViewGroup.MarginLayoutParams) uf4Var2).bottomMargin, uf4Var2.z, hg4Var7);
                                        }
                                    }
                                    uf4Var = uf4Var2;
                                    i46 = uf4Var.m;
                                    if (i46 != -1) {
                                        hg4Var8 = hg4VarQ3;
                                        i47 = 4;
                                        i48 = 3;
                                        f = 0.0f;
                                        f2 = f5;
                                        wf4Var2 = this;
                                        wf4Var2.t(hg4Var8, uf4Var, sparseArray3, i46, 6);
                                    } else {
                                        i47 = 4;
                                        i48 = 3;
                                        f = 0.0f;
                                        f2 = f5;
                                        i49 = uf4Var.n;
                                        if (i49 != -1) {
                                            wf4Var2 = this;
                                            hg4Var8 = hg4VarQ3;
                                            int i88 = i44;
                                            wf4Var2.t(hg4Var8, uf4Var, sparseArray3, i49, i88);
                                            i51 = i88;
                                        } else {
                                            i50 = uf4Var.o;
                                            wf4Var2 = this;
                                            hg4Var8 = hg4VarQ3;
                                            if (i50 != -1) {
                                                i51 = i44;
                                                wf4Var2.t(hg4Var8, uf4Var, sparseArray3, i50, 5);
                                            }
                                        }
                                        if (f2 >= f) {
                                            hg4Var8.c0 = f2;
                                        }
                                        f3 = uf4Var.F;
                                        if (f3 >= f) {
                                            hg4Var8.d0 = f3;
                                        }
                                    }
                                    i51 = i44;
                                    if (f2 >= f) {
                                        hg4Var8.c0 = f2;
                                    }
                                    f3 = uf4Var.F;
                                    if (f3 >= f) {
                                        hg4Var8.d0 = f3;
                                    }
                                }
                                i42 = 5;
                                i43 = uf4Var2.k;
                                if (i43 != i41) {
                                    hg4Var9 = (hg4) sparseArray3.get(i43);
                                    if (hg4Var9 != null) {
                                        hg4VarQ3.t(i42, i40, ((ViewGroup.MarginLayoutParams) uf4Var2).bottomMargin, uf4Var2.z, hg4Var9);
                                    }
                                    i44 = i40;
                                } else {
                                    i44 = i40;
                                    i45 = uf4Var2.l;
                                    if (i45 != i41) {
                                        hg4VarQ3.t(i42, i42, ((ViewGroup.MarginLayoutParams) uf4Var2).bottomMargin, uf4Var2.z, hg4Var7);
                                    }
                                }
                                uf4Var = uf4Var2;
                                i46 = uf4Var.m;
                                if (i46 != -1) {
                                    hg4Var8 = hg4VarQ3;
                                    i47 = 4;
                                    i48 = 3;
                                    f = 0.0f;
                                    f2 = f5;
                                    wf4Var2 = this;
                                    wf4Var2.t(hg4Var8, uf4Var, sparseArray3, i46, 6);
                                } else {
                                    i47 = 4;
                                    i48 = 3;
                                    f = 0.0f;
                                    f2 = f5;
                                    i49 = uf4Var.n;
                                    if (i49 != -1) {
                                        wf4Var2 = this;
                                        hg4Var8 = hg4VarQ3;
                                        int i89 = i44;
                                        wf4Var2.t(hg4Var8, uf4Var, sparseArray3, i49, i89);
                                        i51 = i89;
                                    } else {
                                        i50 = uf4Var.o;
                                        wf4Var2 = this;
                                        hg4Var8 = hg4VarQ3;
                                        if (i50 != -1) {
                                            i51 = i44;
                                            wf4Var2.t(hg4Var8, uf4Var, sparseArray3, i50, 5);
                                        }
                                    }
                                    if (f2 >= f) {
                                        hg4Var8.c0 = f2;
                                    }
                                    f3 = uf4Var.F;
                                    if (f3 >= f) {
                                        hg4Var8.d0 = f3;
                                    }
                                }
                                i51 = i44;
                                if (f2 >= f) {
                                    hg4Var8.c0 = f2;
                                }
                                f3 = uf4Var.F;
                                if (f3 >= f) {
                                    hg4Var8.d0 = f3;
                                }
                            }
                            if (zIsInEditMode && ((i54 = uf4Var.T) != -1 || uf4Var.U != -1)) {
                                int i90 = uf4Var.U;
                                hg4Var8.X = i54;
                                hg4Var8.Y = i90;
                            }
                            if (uf4Var.a0) {
                                hg4Var8.I(1);
                                hg4Var8.K(((ViewGroup.MarginLayoutParams) uf4Var).width);
                                if (((ViewGroup.MarginLayoutParams) uf4Var).width == -2) {
                                    hg4Var8.I(2);
                                }
                            } else if (((ViewGroup.MarginLayoutParams) uf4Var).width == -1) {
                                if (uf4Var.W) {
                                    hg4Var8.I(i48);
                                } else {
                                    hg4Var8.I(i47);
                                }
                                hg4Var8.g(2).g = ((ViewGroup.MarginLayoutParams) uf4Var).leftMargin;
                                hg4Var8.g(4).g = ((ViewGroup.MarginLayoutParams) uf4Var).rightMargin;
                            } else {
                                hg4Var8.I(i48);
                                hg4Var8.K(0);
                            }
                            if (uf4Var.b0) {
                                hg4Var8.J(1);
                                hg4Var8.H(((ViewGroup.MarginLayoutParams) uf4Var).height);
                                if (((ViewGroup.MarginLayoutParams) uf4Var).height == -2) {
                                    hg4Var8.J(2);
                                }
                            } else if (((ViewGroup.MarginLayoutParams) uf4Var).height == -1) {
                                if (uf4Var.X) {
                                    hg4Var8.J(i48);
                                } else {
                                    hg4Var8.J(i47);
                                }
                                hg4Var8.g(i51).g = ((ViewGroup.MarginLayoutParams) uf4Var).topMargin;
                                hg4Var8.g(5).g = ((ViewGroup.MarginLayoutParams) uf4Var).bottomMargin;
                            } else {
                                hg4Var8.J(i48);
                                hg4Var8.H(0);
                            }
                            String str2 = uf4Var.G;
                            if (str2 == null || str2.length() == 0) {
                                hg4Var8.V = f;
                            } else {
                                int length = str2.length();
                                int iIndexOf3 = str2.indexOf(44);
                                if (iIndexOf3 <= 0 || iIndexOf3 >= length - 1) {
                                    i52 = 0;
                                    i53 = -1;
                                } else {
                                    String strSubstring = str2.substring(0, iIndexOf3);
                                    i53 = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                                    i52 = iIndexOf3 + 1;
                                }
                                int iIndexOf4 = str2.indexOf(58);
                                if (iIndexOf4 < 0 || iIndexOf4 >= length - 1) {
                                    String strSubstring2 = str2.substring(i52);
                                    if (strSubstring2.length() > 0) {
                                        fAbs = Float.parseFloat(strSubstring2);
                                    } else {
                                        fAbs = f;
                                    }
                                } else {
                                    String strSubstring3 = str2.substring(i52, iIndexOf4);
                                    String strSubstring4 = str2.substring(iIndexOf4 + 1);
                                    if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                                        fAbs = f;
                                    } else {
                                        try {
                                            float f7 = Float.parseFloat(strSubstring3);
                                            float f8 = Float.parseFloat(strSubstring4);
                                            if (f7 <= f || f8 <= f) {
                                                fAbs = f;
                                            } else {
                                                fAbs = i53 == 1 ? Math.abs(f8 / f7) : Math.abs(f7 / f8);
                                            }
                                        } catch (NumberFormatException unused4) {
                                        }
                                    }
                                }
                                if (fAbs > f) {
                                    hg4Var8.V = fAbs;
                                    hg4Var8.W = i53;
                                }
                            }
                            float f9 = uf4Var.H;
                            float[] fArr = hg4Var8.j0;
                            fArr[0] = f9;
                            fArr[1] = uf4Var.I;
                            hg4Var8.h0 = uf4Var.J;
                            hg4Var8.i0 = uf4Var.K;
                            int i91 = uf4Var.Z;
                            if (i91 >= 0 && i91 <= i48) {
                                hg4Var8.q = i91;
                            }
                            int i92 = uf4Var.L;
                            int i93 = uf4Var.N;
                            int i94 = uf4Var.P;
                            float f10 = uf4Var.R;
                            hg4Var8.r = i92;
                            hg4Var8.u = i93;
                            if (i94 == Integer.MAX_VALUE) {
                                i94 = 0;
                            }
                            hg4Var8.v = i94;
                            hg4Var8.w = f10;
                            if (f10 > 0.0f && f10 < 1.0f && i92 == 0) {
                                hg4Var8.r = 2;
                            }
                            int i95 = uf4Var.M;
                            int i96 = uf4Var.O;
                            int i97 = uf4Var.Q;
                            float f11 = uf4Var.S;
                            hg4Var8.s = i95;
                            hg4Var8.x = i96;
                            if (i97 == Integer.MAX_VALUE) {
                                i97 = 0;
                            }
                            hg4Var8.y = i97;
                            hg4Var8.z = f11;
                            if (f11 > 0.0f && f11 < 1.0f && i95 == 0) {
                                hg4Var8.s = 2;
                            }
                        }
                    }
                    i74++;
                    childCount4 = i38;
                    i61 = 4;
                    i65 = 1;
                }
            }
            if (b != false) {
                ks6Var.g(ig4Var3);
            }
        } else {
            i60 = 4194304;
        }
        int i98 = wf4Var2.i;
        int mode = View.MeasureSpec.getMode(i);
        int size6 = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size7 = View.MeasureSpec.getSize(i2);
        int iMax5 = Math.max(0, wf4Var2.getPaddingTop());
        int iMax6 = Math.max(0, wf4Var2.getPaddingBottom());
        int i99 = iMax5 + iMax6;
        int paddingWidth = wf4Var2.getPaddingWidth();
        vf4 vf4Var6 = wf4Var2.o;
        vf4Var6.b = iMax5;
        vf4Var6.c = iMax6;
        vf4Var6.d = paddingWidth;
        vf4Var6.e = i99;
        vf4Var6.f = i;
        vf4Var6.g = i2;
        int iMax7 = Math.max(0, wf4Var2.getPaddingStart());
        int iMax8 = Math.max(0, wf4Var2.getPaddingEnd());
        if (iMax7 <= 0 && iMax8 <= 0) {
            iMax7 = Math.max(0, wf4Var2.getPaddingLeft());
        } else if ((wf4Var2.getContext().getApplicationInfo().flags & i60) != 0 && 1 == wf4Var2.getLayoutDirection()) {
            iMax7 = iMax8;
        }
        int i100 = size6 - paddingWidth;
        int i101 = size7 - i99;
        int i102 = vf4Var6.e;
        int i103 = vf4Var6.d;
        int childCount5 = wf4Var2.getChildCount();
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                if (childCount5 == 0) {
                    iMax = Math.max(0, wf4Var2.d);
                } else {
                    iMax = 0;
                }
                i3 = 2;
            } else if (mode != 1073741824) {
                i102 = i102;
                i3 = 1;
                iMax = 0;
            } else {
                iMax = Math.min(wf4Var2.f - i103, i100);
                i102 = i102;
                i3 = 1;
            }
            if (mode2 != Integer.MIN_VALUE) {
                if (mode2 != 0) {
                    if (childCount5 == 0) {
                        iMax2 = Math.max(0, wf4Var2.e);
                    } else {
                        iMax2 = 0;
                    }
                    i4 = 2;
                } else if (mode2 != 1073741824) {
                    i103 = i103;
                    i4 = 1;
                    iMax2 = 0;
                } else {
                    iMax2 = Math.min(wf4Var2.g - i102, i101);
                    i103 = i103;
                    i4 = 1;
                }
                iO = ig4Var3.o();
                iArr = ig4Var3.C;
                if (iMax == iO || iMax2 != ig4Var3.i()) {
                    th5Var.b = true;
                    c = 1;
                } else {
                    c = 1;
                }
                ig4Var3.X = 0;
                ig4Var3.Y = 0;
                iArr[0] = wf4Var2.f - i103;
                iArr[c] = wf4Var2.g - i102;
                ig4Var3.a0 = 0;
                ig4Var3.b0 = 0;
                ig4Var3.I(i3);
                ig4Var3.K(iMax);
                ig4Var3.J(i4);
                ig4Var3.H(iMax2);
                i5 = wf4Var2.d - i103;
                if (i5 < 0) {
                    ig4Var3.a0 = 0;
                } else {
                    ig4Var3.a0 = i5;
                }
                i6 = wf4Var2.e - i102;
                if (i6 < 0) {
                    ig4Var3.b0 = 0;
                } else {
                    ig4Var3.b0 = i6;
                }
                ig4Var3.w0 = iMax7;
                ig4Var3.x0 = iMax5;
                ig4Var = (ig4) ks6Var.c;
                arrayList = (ArrayList) ks6Var.a;
                vf4Var = ig4Var3.t0;
                size = ig4Var3.p0.size();
                iO2 = ig4Var3.o();
                i7 = ig4Var3.i();
                zQ = sb8.q(i98, np0.m);
                if (!zQ || sb8.q(i98, 64)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i36 = 0;
                    while (true) {
                        if (i36 < size) {
                            z17 = z;
                            hg4Var3 = (hg4) ig4Var3.p0.get(i36);
                            i37 = i36;
                            iArr4 = hg4Var3.o0;
                            iArr2 = iArr;
                            if (iArr4[0] == 3) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            if (iArr4[1] == 3) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            if (z18 || !z19 || hg4Var3.V <= 0.0f) {
                                z20 = false;
                            } else {
                                z20 = true;
                            }
                            if ((hg4Var3.v() || !z20) && !((hg4Var3.w() && z20) || hg4Var3.v() || hg4Var3.w())) {
                                i36 = i37 + 1;
                                z = z17;
                                iArr = iArr2;
                            } else {
                                i8 = 1073741824;
                                z2 = false;
                            }
                        } else {
                            z2 = z;
                            iArr2 = iArr;
                            i8 = 1073741824;
                        }
                    }
                } else {
                    z2 = z;
                    iArr2 = iArr;
                    i8 = 1073741824;
                }
                z3 = z2 & ((mode != i8 && mode2 == i8) || zQ);
                if (z3) {
                    int iMin2 = Math.min(iArr2[0], i100);
                    iMin = Math.min(iArr2[1], i101);
                    if (mode == 1073741824 || ig4Var3.o() == iMin2) {
                        z12 = true;
                    } else {
                        ig4Var3.K(iMin2);
                        z12 = true;
                        th5Var.a = true;
                    }
                    i29 = 1073741824;
                    if (mode2 == 1073741824) {
                        if (ig4Var3.i() != iMin) {
                            ig4Var3.H(iMin);
                            th5Var.a = z12;
                        }
                        i29 = 1073741824;
                    }
                    if (mode == i29 || mode2 != i29) {
                        z4 = z3;
                        vf4Var2 = vf4Var;
                        i9 = size;
                        ig4Var2 = (ig4) th5Var.c;
                        if (th5Var.a) {
                            for (hg4 hg4Var16 : ig4Var2.p0) {
                                hg4Var16.f();
                                hg4Var16.a = false;
                                cz7 cz7Var2 = hg4Var16.d;
                                cz7Var2.e.j = false;
                                cz7Var2.g = false;
                                cz7Var2.n();
                                bti btiVar2 = hg4Var16.e;
                                btiVar2.e.j = false;
                                btiVar2.g = false;
                                btiVar2.m();
                            }
                            i30 = 0;
                            ig4Var2.f();
                            ig4Var2.a = false;
                            cz7 cz7Var3 = ig4Var2.d;
                            cz7Var3.e.j = false;
                            cz7Var3.g = false;
                            cz7Var3.n();
                            bti btiVar3 = ig4Var2.e;
                            btiVar3.e.j = false;
                            btiVar3.g = false;
                            btiVar3.m();
                            th5Var.d();
                        } else {
                            i30 = 0;
                        }
                        th5Var.c((ig4) th5Var.d);
                        ig4Var2.X = i30;
                        ig4Var2.Y = i30;
                        ig4Var2.d.h.d(i30);
                        ig4Var2.e.h.d(i30);
                        i31 = 1073741824;
                        if (mode == 1073741824) {
                            zP = ig4Var3.P(i30, zQ);
                            i10 = 1;
                        } else {
                            zP = true;
                            i10 = 0;
                        }
                        if (mode2 == 1073741824) {
                            zP &= ig4Var3.P(1, zQ);
                            i10++;
                        }
                    } else {
                        ArrayList arrayList6 = (ArrayList) th5Var.e;
                        ig4 ig4Var4 = (ig4) th5Var.c;
                        if (th5Var.a || th5Var.b) {
                            for (hg4 hg4Var17 : ig4Var4.p0) {
                                hg4Var17.f();
                                hg4Var17.a = false;
                                hg4Var17.d.n();
                                hg4Var17.e.m();
                                arrayList6 = arrayList6;
                                z3 = z3;
                            }
                            z4 = z3;
                            arrayList3 = arrayList6;
                            ig4Var4.f();
                            i32 = 0;
                            ig4Var4.a = false;
                            ig4Var4.d.n();
                            ig4Var4.e.m();
                            th5Var.b = false;
                        } else {
                            z4 = z3;
                            arrayList3 = arrayList6;
                            i32 = 0;
                        }
                        th5Var.c((ig4) th5Var.d);
                        ig4Var4.X = i32;
                        int[] iArr5 = ig4Var4.o0;
                        ig4Var4.Y = i32;
                        int iH2 = ig4Var4.h(i32);
                        int iH3 = ig4Var4.h(1);
                        if (th5Var.a) {
                            th5Var.d();
                        }
                        int iP = ig4Var4.p();
                        i9 = size;
                        int iQ = ig4Var4.q();
                        vf4Var2 = vf4Var;
                        ig4Var4.d.h.d(iP);
                        ig4Var4.e.h.d(iQ);
                        th5Var.i();
                        if (iH2 == 2 || iH3 == 2) {
                            if (zQ) {
                                Iterator it2 = arrayList3.iterator();
                                while (it2.hasNext()) {
                                    if (!((zvj) it2.next()).k()) {
                                        zQ = false;
                                        break;
                                    }
                                }
                            }
                            if (zQ && iH2 == 2) {
                                ig4Var4.I(1);
                                ig4Var4.K(th5Var.e(ig4Var4, 0));
                                ig4Var4.d.e.d(ig4Var4.o());
                            }
                            if (zQ && iH3 == 2) {
                                i33 = 1;
                                ig4Var4.J(1);
                                ig4Var4.H(th5Var.e(ig4Var4, 1));
                                ig4Var4.e.e.d(ig4Var4.i());
                            }
                            i34 = iArr5[0];
                            if (i34 != i33 || i34 == 4) {
                                int iO5 = ig4Var4.o() + iP;
                                ig4Var4.d.i.d(iO5);
                                ig4Var4.d.e.d(iO5 - iP);
                                th5Var.i();
                                i35 = iArr5[1];
                                if (i35 != 1 || i35 == 4) {
                                    int i104 = ig4Var4.i() + iQ;
                                    ig4Var4.e.i.d(i104);
                                    ig4Var4.e.e.d(i104 - iQ);
                                }
                                th5Var.i();
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            for (zvj zvjVar2 : arrayList3) {
                                if (zvjVar2.b == ig4Var4 || zvjVar2.g) {
                                    zvjVar2.e();
                                }
                            }
                            it = arrayList3.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    z16 = true;
                                    break;
                                }
                                zvjVar = (zvj) it.next();
                                if (!z15 || zvjVar.b != ig4Var4) {
                                    if (zvjVar.h.j || ((!zvjVar.i.j && !(zvjVar instanceof pr7)) || (!zvjVar.e.j && !(zvjVar instanceof wo2) && !(zvjVar instanceof pr7)))) {
                                        z16 = false;
                                        break;
                                    }
                                }
                            }
                            ig4Var4.I(iH2);
                            ig4Var4.J(iH3);
                            zP = z16;
                            i31 = 1073741824;
                            i10 = 2;
                        } else {
                            iP = iP;
                        }
                        i33 = 1;
                        i34 = iArr5[0];
                        if (i34 != i33) {
                            int iO6 = ig4Var4.o() + iP;
                            ig4Var4.d.i.d(iO6);
                            ig4Var4.d.e.d(iO6 - iP);
                            th5Var.i();
                            i35 = iArr5[1];
                            if (i35 != 1) {
                                int i105 = ig4Var4.i() + iQ;
                                ig4Var4.e.i.d(i105);
                                ig4Var4.e.e.d(i105 - iQ);
                            } else {
                                int i106 = ig4Var4.i() + iQ;
                                ig4Var4.e.i.d(i106);
                                ig4Var4.e.e.d(i106 - iQ);
                            }
                            th5Var.i();
                            z15 = true;
                        } else {
                            int iO7 = ig4Var4.o() + iP;
                            ig4Var4.d.i.d(iO7);
                            ig4Var4.d.e.d(iO7 - iP);
                            th5Var.i();
                            i35 = iArr5[1];
                            if (i35 != 1) {
                                int i107 = ig4Var4.i() + iQ;
                                ig4Var4.e.i.d(i107);
                                ig4Var4.e.e.d(i107 - iQ);
                            } else {
                                int i108 = ig4Var4.i() + iQ;
                                ig4Var4.e.i.d(i108);
                                ig4Var4.e.e.d(i108 - iQ);
                            }
                            th5Var.i();
                            z15 = true;
                        }
                        while (r8.hasNext()) {
                            if (zvjVar2.b == ig4Var4) {
                            }
                            zvjVar2.e();
                        }
                        it = arrayList3.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                z16 = true;
                                break;
                            }
                            zvjVar = (zvj) it.next();
                            if (!z15) {
                            }
                            if (zvjVar.h.j) {
                            }
                            z16 = false;
                            break;
                        }
                        ig4Var4.I(iH2);
                        ig4Var4.J(iH3);
                        zP = z16;
                        i31 = 1073741824;
                        i10 = 2;
                    }
                    if (zP) {
                        if (mode == i31) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (mode2 == i31) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        ig4Var3.L(z13, z14);
                    }
                } else {
                    z4 = z3;
                    vf4Var2 = vf4Var;
                    i9 = size;
                    zP = false;
                    i10 = 0;
                }
                if (zP || i10 != 2) {
                    int i109 = ig4Var3.C0;
                    if (i9 > 0) {
                        size3 = ig4Var3.p0.size();
                        zS = ig4Var3.S(64);
                        vf4Var5 = ig4Var3.t0;
                        i25 = 0;
                        while (i25 < size3) {
                            hg4Var2 = (hg4) ig4Var3.p0.get(i25);
                            if ((hg4Var2 instanceof or7) && !(hg4Var2 instanceof tp0)) {
                                hg4Var2.getClass();
                                if (zS || (cz7Var = hg4Var2.d) == null || (btiVar = hg4Var2.e) == null || !cz7Var.e.j || !btiVar.e.j) {
                                    iH = hg4Var2.h(0);
                                    int iH4 = hg4Var2.h(1);
                                    i28 = size3;
                                    if (iH == 3 || hg4Var2.r == 1 || iH4 != 3 || hg4Var2.s == 1) {
                                        z11 = false;
                                    } else {
                                        z11 = true;
                                    }
                                    if (z11 && ig4Var3.S(1)) {
                                        if (iH == 3 && hg4Var2.r == 0 && iH4 != 3 && !hg4Var2.v()) {
                                            z11 = true;
                                        }
                                        if (iH4 == 3 && hg4Var2.s == 0 && iH != 3 && !hg4Var2.v()) {
                                            z11 = true;
                                        }
                                        if (iH == 3 || iH4 == 3) {
                                            if (hg4Var2.V > 0.0f) {
                                                z11 = true;
                                            }
                                        }
                                        if (z11) {
                                            ks6Var.d(0, vf4Var5, hg4Var2);
                                        }
                                    }
                                    if (z11) {
                                        ks6Var.d(0, vf4Var5, hg4Var2);
                                    }
                                } else {
                                    i28 = size3;
                                }
                            } else {
                                i28 = size3;
                            }
                            i25++;
                            size3 = i28;
                        }
                        wf4Var = vf4Var5.a;
                        childCount = wf4Var.getChildCount();
                        arrayList2 = wf4Var.b;
                        for (i26 = 0; i26 < childCount; i26++) {
                            wf4Var.getChildAt(i26);
                        }
                        size4 = arrayList2.size();
                        if (size4 > 0) {
                            for (i27 = 0; i27 < size4; i27++) {
                                ((sf4) arrayList2.get(i27)).getClass();
                            }
                        }
                    }
                    ks6Var.g(ig4Var3);
                    size2 = arrayList.size();
                    i11 = 0;
                    if (i9 > 0) {
                        ks6Var.f(ig4Var3, 0, iO2, i7);
                    }
                    if (size2 > 0) {
                        iArr3 = ig4Var3.o0;
                        if (iArr3[0] == 2) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (iArr3[1] == 2) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        int iMax9 = Math.max(ig4Var3.o(), ig4Var.a0);
                        int iMax10 = Math.max(ig4Var3.i(), ig4Var.b0);
                        for (i12 = 0; i12 < size2; i12++) {
                        }
                        i13 = iMax10;
                        i14 = iMax9;
                        i15 = 0;
                        while (i15 < 2) {
                            iMax3 = i14;
                            iMax4 = i13;
                            i16 = i11;
                            i17 = i16;
                            while (i16 < size2) {
                                hg4Var = (hg4) arrayList.get(i16);
                                if ((hg4Var instanceof tp0) && !(hg4Var instanceof or7)) {
                                    i20 = size2;
                                    if (hg4Var.f0 == 8 && (!z4 || !hg4Var.d.e.j || !hg4Var.e.e.j)) {
                                        iO3 = hg4Var.o();
                                        i21 = hg4Var.i();
                                        z9 = z6;
                                        int i110 = hg4Var.Z;
                                        z10 = z5;
                                        int i111 = i15 == 1 ? 2 : 1;
                                        i22 = i15;
                                        vf4Var4 = vf4Var2;
                                        int i112 = (ks6Var.d(i111, vf4Var4, hg4Var) ? 1 : 0) | i17;
                                        iO4 = hg4Var.o();
                                        i23 = i112;
                                        i24 = hg4Var.i();
                                        if (iO4 != iO3) {
                                            hg4Var.K(iO4);
                                            if (!z10 && hg4Var.p() + hg4Var.T > iMax3) {
                                                iMax3 = Math.max(iMax3, hg4Var.g(4).d() + hg4Var.p() + hg4Var.T);
                                            }
                                            i23 = 1;
                                        }
                                        if (i24 != i21) {
                                            hg4Var.H(i24);
                                            if (!z9 && hg4Var.q() + hg4Var.U > iMax4) {
                                                iMax4 = Math.max(iMax4, hg4Var.g(5).d() + hg4Var.q() + hg4Var.U);
                                            }
                                            i23 = 1;
                                        }
                                        if (!hg4Var.E && i110 != hg4Var.Z) {
                                            i23 = 1;
                                        }
                                    }
                                    i16++;
                                    vf4Var2 = vf4Var4;
                                    size2 = i20;
                                    z6 = z9;
                                    z5 = z10;
                                    i15 = i22;
                                    i17 = i23;
                                } else {
                                    i20 = size2;
                                }
                                z9 = z6;
                                z10 = z5;
                                i22 = i15;
                                i23 = i17;
                                vf4Var4 = vf4Var2;
                                i16++;
                                vf4Var2 = vf4Var4;
                                size2 = i20;
                                z6 = z9;
                                z5 = z10;
                                i15 = i22;
                                i17 = i23;
                            }
                            i18 = size2;
                            z7 = z6;
                            z8 = z5;
                            i19 = i15;
                            vf4Var3 = vf4Var2;
                            if (i17 == 0) {
                                break;
                            }
                            int i113 = i19 + 1;
                            ks6Var.f(ig4Var3, i113, iO2, i7);
                            vf4Var2 = vf4Var3;
                            i14 = iMax3;
                            i13 = iMax4;
                            z6 = z7;
                            z5 = z8;
                            i11 = 0;
                            i15 = i113;
                            size2 = i18;
                        }
                    }
                    ig4Var3.C0 = i109;
                    b29.p = ig4Var3.S(np0.o);
                }
                s(i, i2, ig4Var3.o(), ig4Var3.i(), ig4Var3.D0, ig4Var3.E0);
            }
            if (childCount5 == 0) {
                iMax2 = Math.max(0, wf4Var2.e);
            } else {
                iMax2 = i101;
            }
            i4 = 2;
            iO = ig4Var3.o();
            iArr = ig4Var3.C;
            if (iMax == iO) {
                th5Var.b = true;
                c = 1;
            } else {
                th5Var.b = true;
                c = 1;
            }
            ig4Var3.X = 0;
            ig4Var3.Y = 0;
            iArr[0] = wf4Var2.f - i103;
            iArr[c] = wf4Var2.g - i102;
            ig4Var3.a0 = 0;
            ig4Var3.b0 = 0;
            ig4Var3.I(i3);
            ig4Var3.K(iMax);
            ig4Var3.J(i4);
            ig4Var3.H(iMax2);
            i5 = wf4Var2.d - i103;
            if (i5 < 0) {
                ig4Var3.a0 = 0;
            } else {
                ig4Var3.a0 = i5;
            }
            i6 = wf4Var2.e - i102;
            if (i6 < 0) {
                ig4Var3.b0 = 0;
            } else {
                ig4Var3.b0 = i6;
            }
            ig4Var3.w0 = iMax7;
            ig4Var3.x0 = iMax5;
            ig4Var = (ig4) ks6Var.c;
            arrayList = (ArrayList) ks6Var.a;
            vf4Var = ig4Var3.t0;
            size = ig4Var3.p0.size();
            iO2 = ig4Var3.o();
            i7 = ig4Var3.i();
            zQ = sb8.q(i98, np0.m);
            if (zQ) {
                z = true;
            } else {
                z = true;
            }
            if (z) {
                i36 = 0;
                while (true) {
                    if (i36 < size) {
                        z17 = z;
                        hg4Var3 = (hg4) ig4Var3.p0.get(i36);
                        i37 = i36;
                        iArr4 = hg4Var3.o0;
                        iArr2 = iArr;
                        if (iArr4[0] == 3) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if (iArr4[1] == 3) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        if (z18) {
                            z20 = false;
                        } else {
                            z20 = false;
                        }
                        if (hg4Var3.v()) {
                            i36 = i37 + 1;
                            z = z17;
                            iArr = iArr2;
                        } else {
                            i36 = i37 + 1;
                            z = z17;
                            iArr = iArr2;
                        }
                        i8 = 1073741824;
                        z2 = false;
                    } else {
                        z2 = z;
                        iArr2 = iArr;
                        i8 = 1073741824;
                    }
                }
            } else {
                z2 = z;
                iArr2 = iArr;
                i8 = 1073741824;
            }
            z3 = z2 & ((mode != i8 && mode2 == i8) || zQ);
            if (z3) {
                int iMin3 = Math.min(iArr2[0], i100);
                iMin = Math.min(iArr2[1], i101);
                if (mode == 1073741824) {
                    z12 = true;
                } else {
                    z12 = true;
                }
                i29 = 1073741824;
                if (mode2 == 1073741824) {
                    if (ig4Var3.i() != iMin) {
                        ig4Var3.H(iMin);
                        th5Var.a = z12;
                    }
                    i29 = 1073741824;
                }
                if (mode == i29) {
                    z4 = z3;
                    vf4Var2 = vf4Var;
                    i9 = size;
                    ig4Var2 = (ig4) th5Var.c;
                    if (th5Var.a) {
                        while (r1.hasNext()) {
                            hg4Var16.f();
                            hg4Var16.a = false;
                            cz7 cz7Var4 = hg4Var16.d;
                            cz7Var4.e.j = false;
                            cz7Var4.g = false;
                            cz7Var4.n();
                            bti btiVar4 = hg4Var16.e;
                            btiVar4.e.j = false;
                            btiVar4.g = false;
                            btiVar4.m();
                        }
                        i30 = 0;
                        ig4Var2.f();
                        ig4Var2.a = false;
                        cz7 cz7Var5 = ig4Var2.d;
                        cz7Var5.e.j = false;
                        cz7Var5.g = false;
                        cz7Var5.n();
                        bti btiVar5 = ig4Var2.e;
                        btiVar5.e.j = false;
                        btiVar5.g = false;
                        btiVar5.m();
                        th5Var.d();
                    } else {
                        i30 = 0;
                    }
                    th5Var.c((ig4) th5Var.d);
                    ig4Var2.X = i30;
                    ig4Var2.Y = i30;
                    ig4Var2.d.h.d(i30);
                    ig4Var2.e.h.d(i30);
                    i31 = 1073741824;
                    if (mode == 1073741824) {
                        zP = ig4Var3.P(i30, zQ);
                        i10 = 1;
                    } else {
                        zP = true;
                        i10 = 0;
                    }
                    if (mode2 == 1073741824) {
                        zP &= ig4Var3.P(1, zQ);
                        i10++;
                    }
                } else {
                    z4 = z3;
                    vf4Var2 = vf4Var;
                    i9 = size;
                    ig4Var2 = (ig4) th5Var.c;
                    if (th5Var.a) {
                        while (r1.hasNext()) {
                            hg4Var16.f();
                            hg4Var16.a = false;
                            cz7 cz7Var6 = hg4Var16.d;
                            cz7Var6.e.j = false;
                            cz7Var6.g = false;
                            cz7Var6.n();
                            bti btiVar6 = hg4Var16.e;
                            btiVar6.e.j = false;
                            btiVar6.g = false;
                            btiVar6.m();
                        }
                        i30 = 0;
                        ig4Var2.f();
                        ig4Var2.a = false;
                        cz7 cz7Var7 = ig4Var2.d;
                        cz7Var7.e.j = false;
                        cz7Var7.g = false;
                        cz7Var7.n();
                        bti btiVar7 = ig4Var2.e;
                        btiVar7.e.j = false;
                        btiVar7.g = false;
                        btiVar7.m();
                        th5Var.d();
                    } else {
                        i30 = 0;
                    }
                    th5Var.c((ig4) th5Var.d);
                    ig4Var2.X = i30;
                    ig4Var2.Y = i30;
                    ig4Var2.d.h.d(i30);
                    ig4Var2.e.h.d(i30);
                    i31 = 1073741824;
                    if (mode == 1073741824) {
                        zP = ig4Var3.P(i30, zQ);
                        i10 = 1;
                    } else {
                        zP = true;
                        i10 = 0;
                    }
                    if (mode2 == 1073741824) {
                        zP &= ig4Var3.P(1, zQ);
                        i10++;
                    }
                }
                if (zP) {
                    if (mode == i31) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (mode2 == i31) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    ig4Var3.L(z13, z14);
                }
            } else {
                z4 = z3;
                vf4Var2 = vf4Var;
                i9 = size;
                zP = false;
                i10 = 0;
            }
            if (zP) {
                int i1010 = ig4Var3.C0;
                if (i9 > 0) {
                    size3 = ig4Var3.p0.size();
                    zS = ig4Var3.S(64);
                    vf4Var5 = ig4Var3.t0;
                    i25 = 0;
                    while (i25 < size3) {
                        hg4Var2 = (hg4) ig4Var3.p0.get(i25);
                        if (hg4Var2 instanceof or7) {
                            i28 = size3;
                        } else {
                            hg4Var2.getClass();
                            if (zS) {
                            }
                            iH = hg4Var2.h(0);
                            int iH5 = hg4Var2.h(1);
                            i28 = size3;
                            if (iH == 3) {
                                z11 = false;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                            }
                            if (z11) {
                                ks6Var.d(0, vf4Var5, hg4Var2);
                            }
                        }
                        i25++;
                        size3 = i28;
                    }
                    wf4Var = vf4Var5.a;
                    childCount = wf4Var.getChildCount();
                    arrayList2 = wf4Var.b;
                    while (i26 < childCount) {
                        wf4Var.getChildAt(i26);
                    }
                    size4 = arrayList2.size();
                    if (size4 > 0) {
                        while (i27 < size4) {
                            ((sf4) arrayList2.get(i27)).getClass();
                        }
                    }
                }
                ks6Var.g(ig4Var3);
                size2 = arrayList.size();
                i11 = 0;
                if (i9 > 0) {
                    ks6Var.f(ig4Var3, 0, iO2, i7);
                }
                if (size2 > 0) {
                    iArr3 = ig4Var3.o0;
                    if (iArr3[0] == 2) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (iArr3[1] == 2) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    int iMax11 = Math.max(ig4Var3.o(), ig4Var.a0);
                    int iMax12 = Math.max(ig4Var3.i(), ig4Var.b0);
                    while (i12 < size2) {
                    }
                    i13 = iMax12;
                    i14 = iMax11;
                    i15 = 0;
                    while (i15 < 2) {
                        iMax3 = i14;
                        iMax4 = i13;
                        i16 = i11;
                        i17 = i16;
                        while (i16 < size2) {
                            hg4Var = (hg4) arrayList.get(i16);
                            if (hg4Var instanceof tp0) {
                                i20 = size2;
                                z9 = z6;
                                z10 = z5;
                                i22 = i15;
                                i23 = i17;
                                vf4Var4 = vf4Var2;
                            } else {
                                i20 = size2;
                                if (hg4Var.f0 == 8) {
                                    z9 = z6;
                                    z10 = z5;
                                    i22 = i15;
                                    i23 = i17;
                                    vf4Var4 = vf4Var2;
                                } else {
                                    iO3 = hg4Var.o();
                                    i21 = hg4Var.i();
                                    z9 = z6;
                                    int i114 = hg4Var.Z;
                                    z10 = z5;
                                    if (i15 == 1) {
                                    }
                                    i22 = i15;
                                    vf4Var4 = vf4Var2;
                                    int i115 = (ks6Var.d(i111, vf4Var4, hg4Var) ? 1 : 0) | i17;
                                    iO4 = hg4Var.o();
                                    i23 = i115;
                                    i24 = hg4Var.i();
                                    if (iO4 != iO3) {
                                        hg4Var.K(iO4);
                                        if (!z10) {
                                        }
                                        i23 = 1;
                                    }
                                    if (i24 != i21) {
                                        hg4Var.H(i24);
                                        if (!z9) {
                                        }
                                        i23 = 1;
                                    }
                                    if (!hg4Var.E) {
                                    }
                                }
                            }
                            i16++;
                            vf4Var2 = vf4Var4;
                            size2 = i20;
                            z6 = z9;
                            z5 = z10;
                            i15 = i22;
                            i17 = i23;
                        }
                        i18 = size2;
                        z7 = z6;
                        z8 = z5;
                        i19 = i15;
                        vf4Var3 = vf4Var2;
                        if (i17 == 0) {
                            break;
                            break;
                        }
                        int i116 = i19 + 1;
                        ks6Var.f(ig4Var3, i116, iO2, i7);
                        vf4Var2 = vf4Var3;
                        i14 = iMax3;
                        i13 = iMax4;
                        z6 = z7;
                        z5 = z8;
                        i11 = 0;
                        i15 = i116;
                        size2 = i18;
                    }
                }
                ig4Var3.C0 = i1010;
                b29.p = ig4Var3.S(np0.o);
            } else {
                int i1011 = ig4Var3.C0;
                if (i9 > 0) {
                    size3 = ig4Var3.p0.size();
                    zS = ig4Var3.S(64);
                    vf4Var5 = ig4Var3.t0;
                    i25 = 0;
                    while (i25 < size3) {
                        hg4Var2 = (hg4) ig4Var3.p0.get(i25);
                        if (hg4Var2 instanceof or7) {
                            i28 = size3;
                        } else {
                            hg4Var2.getClass();
                            if (zS) {
                            }
                            iH = hg4Var2.h(0);
                            int iH6 = hg4Var2.h(1);
                            i28 = size3;
                            if (iH == 3) {
                                z11 = false;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                            }
                            if (z11) {
                                ks6Var.d(0, vf4Var5, hg4Var2);
                            }
                        }
                        i25++;
                        size3 = i28;
                    }
                    wf4Var = vf4Var5.a;
                    childCount = wf4Var.getChildCount();
                    arrayList2 = wf4Var.b;
                    while (i26 < childCount) {
                        wf4Var.getChildAt(i26);
                    }
                    size4 = arrayList2.size();
                    if (size4 > 0) {
                        while (i27 < size4) {
                            ((sf4) arrayList2.get(i27)).getClass();
                        }
                    }
                }
                ks6Var.g(ig4Var3);
                size2 = arrayList.size();
                i11 = 0;
                if (i9 > 0) {
                    ks6Var.f(ig4Var3, 0, iO2, i7);
                }
                if (size2 > 0) {
                    iArr3 = ig4Var3.o0;
                    if (iArr3[0] == 2) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (iArr3[1] == 2) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    int iMax13 = Math.max(ig4Var3.o(), ig4Var.a0);
                    int iMax14 = Math.max(ig4Var3.i(), ig4Var.b0);
                    while (i12 < size2) {
                    }
                    i13 = iMax14;
                    i14 = iMax13;
                    i15 = 0;
                    while (i15 < 2) {
                        iMax3 = i14;
                        iMax4 = i13;
                        i16 = i11;
                        i17 = i16;
                        while (i16 < size2) {
                            hg4Var = (hg4) arrayList.get(i16);
                            if (hg4Var instanceof tp0) {
                                i20 = size2;
                                z9 = z6;
                                z10 = z5;
                                i22 = i15;
                                i23 = i17;
                                vf4Var4 = vf4Var2;
                            } else {
                                i20 = size2;
                                if (hg4Var.f0 == 8) {
                                    z9 = z6;
                                    z10 = z5;
                                    i22 = i15;
                                    i23 = i17;
                                    vf4Var4 = vf4Var2;
                                } else {
                                    iO3 = hg4Var.o();
                                    i21 = hg4Var.i();
                                    z9 = z6;
                                    int i117 = hg4Var.Z;
                                    z10 = z5;
                                    if (i15 == 1) {
                                    }
                                    i22 = i15;
                                    vf4Var4 = vf4Var2;
                                    int i118 = (ks6Var.d(i111, vf4Var4, hg4Var) ? 1 : 0) | i17;
                                    iO4 = hg4Var.o();
                                    i23 = i118;
                                    i24 = hg4Var.i();
                                    if (iO4 != iO3) {
                                        hg4Var.K(iO4);
                                        if (!z10) {
                                        }
                                        i23 = 1;
                                    }
                                    if (i24 != i21) {
                                        hg4Var.H(i24);
                                        if (!z9) {
                                        }
                                        i23 = 1;
                                    }
                                    if (!hg4Var.E) {
                                    }
                                }
                            }
                            i16++;
                            vf4Var2 = vf4Var4;
                            size2 = i20;
                            z6 = z9;
                            z5 = z10;
                            i15 = i22;
                            i17 = i23;
                        }
                        i18 = size2;
                        z7 = z6;
                        z8 = z5;
                        i19 = i15;
                        vf4Var3 = vf4Var2;
                        if (i17 == 0) {
                            break;
                            break;
                        }
                        int i119 = i19 + 1;
                        ks6Var.f(ig4Var3, i119, iO2, i7);
                        vf4Var2 = vf4Var3;
                        i14 = iMax3;
                        i13 = iMax4;
                        z6 = z7;
                        z5 = z8;
                        i11 = 0;
                        i15 = i119;
                        size2 = i18;
                    }
                }
                ig4Var3.C0 = i1011;
                b29.p = ig4Var3.S(np0.o);
            }
            s(i, i2, ig4Var3.o(), ig4Var3.i(), ig4Var3.D0, ig4Var3.E0);
        }
        iMax = childCount5 == 0 ? Math.max(0, wf4Var2.d) : i100;
        i3 = 2;
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 0) {
                if (childCount5 == 0) {
                    iMax2 = Math.max(0, wf4Var2.e);
                } else {
                    iMax2 = 0;
                }
                i4 = 2;
            } else if (mode2 != 1073741824) {
                i103 = i103;
                i4 = 1;
                iMax2 = 0;
            } else {
                iMax2 = Math.min(wf4Var2.g - i102, i101);
                i103 = i103;
                i4 = 1;
            }
            iO = ig4Var3.o();
            iArr = ig4Var3.C;
            if (iMax == iO) {
                th5Var.b = true;
                c = 1;
            } else {
                th5Var.b = true;
                c = 1;
            }
            ig4Var3.X = 0;
            ig4Var3.Y = 0;
            iArr[0] = wf4Var2.f - i103;
            iArr[c] = wf4Var2.g - i102;
            ig4Var3.a0 = 0;
            ig4Var3.b0 = 0;
            ig4Var3.I(i3);
            ig4Var3.K(iMax);
            ig4Var3.J(i4);
            ig4Var3.H(iMax2);
            i5 = wf4Var2.d - i103;
            if (i5 < 0) {
                ig4Var3.a0 = 0;
            } else {
                ig4Var3.a0 = i5;
            }
            i6 = wf4Var2.e - i102;
            if (i6 < 0) {
                ig4Var3.b0 = 0;
            } else {
                ig4Var3.b0 = i6;
            }
            ig4Var3.w0 = iMax7;
            ig4Var3.x0 = iMax5;
            ig4Var = (ig4) ks6Var.c;
            arrayList = (ArrayList) ks6Var.a;
            vf4Var = ig4Var3.t0;
            size = ig4Var3.p0.size();
            iO2 = ig4Var3.o();
            i7 = ig4Var3.i();
            zQ = sb8.q(i98, np0.m);
            if (zQ) {
                z = true;
            } else {
                z = true;
            }
            if (z) {
                i36 = 0;
                while (true) {
                    if (i36 < size) {
                        z17 = z;
                        hg4Var3 = (hg4) ig4Var3.p0.get(i36);
                        i37 = i36;
                        iArr4 = hg4Var3.o0;
                        iArr2 = iArr;
                        if (iArr4[0] == 3) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if (iArr4[1] == 3) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        if (z18) {
                            z20 = false;
                        } else {
                            z20 = false;
                        }
                        if (hg4Var3.v()) {
                            i36 = i37 + 1;
                            z = z17;
                            iArr = iArr2;
                        } else {
                            i36 = i37 + 1;
                            z = z17;
                            iArr = iArr2;
                        }
                        i8 = 1073741824;
                        z2 = false;
                    } else {
                        z2 = z;
                        iArr2 = iArr;
                        i8 = 1073741824;
                    }
                }
            } else {
                z2 = z;
                iArr2 = iArr;
                i8 = 1073741824;
            }
            z3 = z2 & ((mode != i8 && mode2 == i8) || zQ);
            if (z3) {
                int iMin4 = Math.min(iArr2[0], i100);
                iMin = Math.min(iArr2[1], i101);
                if (mode == 1073741824) {
                    z12 = true;
                } else {
                    z12 = true;
                }
                i29 = 1073741824;
                if (mode2 == 1073741824) {
                    if (ig4Var3.i() != iMin) {
                        ig4Var3.H(iMin);
                        th5Var.a = z12;
                    }
                    i29 = 1073741824;
                }
                if (mode == i29) {
                    z4 = z3;
                    vf4Var2 = vf4Var;
                    i9 = size;
                    ig4Var2 = (ig4) th5Var.c;
                    if (th5Var.a) {
                        while (r1.hasNext()) {
                            hg4Var16.f();
                            hg4Var16.a = false;
                            cz7 cz7Var8 = hg4Var16.d;
                            cz7Var8.e.j = false;
                            cz7Var8.g = false;
                            cz7Var8.n();
                            bti btiVar8 = hg4Var16.e;
                            btiVar8.e.j = false;
                            btiVar8.g = false;
                            btiVar8.m();
                        }
                        i30 = 0;
                        ig4Var2.f();
                        ig4Var2.a = false;
                        cz7 cz7Var9 = ig4Var2.d;
                        cz7Var9.e.j = false;
                        cz7Var9.g = false;
                        cz7Var9.n();
                        bti btiVar9 = ig4Var2.e;
                        btiVar9.e.j = false;
                        btiVar9.g = false;
                        btiVar9.m();
                        th5Var.d();
                    } else {
                        i30 = 0;
                    }
                    th5Var.c((ig4) th5Var.d);
                    ig4Var2.X = i30;
                    ig4Var2.Y = i30;
                    ig4Var2.d.h.d(i30);
                    ig4Var2.e.h.d(i30);
                    i31 = 1073741824;
                    if (mode == 1073741824) {
                        zP = ig4Var3.P(i30, zQ);
                        i10 = 1;
                    } else {
                        zP = true;
                        i10 = 0;
                    }
                    if (mode2 == 1073741824) {
                        zP &= ig4Var3.P(1, zQ);
                        i10++;
                    }
                } else {
                    z4 = z3;
                    vf4Var2 = vf4Var;
                    i9 = size;
                    ig4Var2 = (ig4) th5Var.c;
                    if (th5Var.a) {
                        while (r1.hasNext()) {
                            hg4Var16.f();
                            hg4Var16.a = false;
                            cz7 cz7Var10 = hg4Var16.d;
                            cz7Var10.e.j = false;
                            cz7Var10.g = false;
                            cz7Var10.n();
                            bti btiVar10 = hg4Var16.e;
                            btiVar10.e.j = false;
                            btiVar10.g = false;
                            btiVar10.m();
                        }
                        i30 = 0;
                        ig4Var2.f();
                        ig4Var2.a = false;
                        cz7 cz7Var11 = ig4Var2.d;
                        cz7Var11.e.j = false;
                        cz7Var11.g = false;
                        cz7Var11.n();
                        bti btiVar11 = ig4Var2.e;
                        btiVar11.e.j = false;
                        btiVar11.g = false;
                        btiVar11.m();
                        th5Var.d();
                    } else {
                        i30 = 0;
                    }
                    th5Var.c((ig4) th5Var.d);
                    ig4Var2.X = i30;
                    ig4Var2.Y = i30;
                    ig4Var2.d.h.d(i30);
                    ig4Var2.e.h.d(i30);
                    i31 = 1073741824;
                    if (mode == 1073741824) {
                        zP = ig4Var3.P(i30, zQ);
                        i10 = 1;
                    } else {
                        zP = true;
                        i10 = 0;
                    }
                    if (mode2 == 1073741824) {
                        zP &= ig4Var3.P(1, zQ);
                        i10++;
                    }
                }
                if (zP) {
                    if (mode == i31) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (mode2 == i31) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    ig4Var3.L(z13, z14);
                }
            } else {
                z4 = z3;
                vf4Var2 = vf4Var;
                i9 = size;
                zP = false;
                i10 = 0;
            }
            if (zP) {
                int i1012 = ig4Var3.C0;
                if (i9 > 0) {
                    size3 = ig4Var3.p0.size();
                    zS = ig4Var3.S(64);
                    vf4Var5 = ig4Var3.t0;
                    i25 = 0;
                    while (i25 < size3) {
                        hg4Var2 = (hg4) ig4Var3.p0.get(i25);
                        if (hg4Var2 instanceof or7) {
                            i28 = size3;
                        } else {
                            hg4Var2.getClass();
                            if (zS) {
                            }
                            iH = hg4Var2.h(0);
                            int iH7 = hg4Var2.h(1);
                            i28 = size3;
                            if (iH == 3) {
                                z11 = false;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                            }
                            if (z11) {
                                ks6Var.d(0, vf4Var5, hg4Var2);
                            }
                        }
                        i25++;
                        size3 = i28;
                    }
                    wf4Var = vf4Var5.a;
                    childCount = wf4Var.getChildCount();
                    arrayList2 = wf4Var.b;
                    while (i26 < childCount) {
                        wf4Var.getChildAt(i26);
                    }
                    size4 = arrayList2.size();
                    if (size4 > 0) {
                        while (i27 < size4) {
                            ((sf4) arrayList2.get(i27)).getClass();
                        }
                    }
                }
                ks6Var.g(ig4Var3);
                size2 = arrayList.size();
                i11 = 0;
                if (i9 > 0) {
                    ks6Var.f(ig4Var3, 0, iO2, i7);
                }
                if (size2 > 0) {
                    iArr3 = ig4Var3.o0;
                    if (iArr3[0] == 2) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (iArr3[1] == 2) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    int iMax15 = Math.max(ig4Var3.o(), ig4Var.a0);
                    int iMax16 = Math.max(ig4Var3.i(), ig4Var.b0);
                    while (i12 < size2) {
                    }
                    i13 = iMax16;
                    i14 = iMax15;
                    i15 = 0;
                    while (i15 < 2) {
                        iMax3 = i14;
                        iMax4 = i13;
                        i16 = i11;
                        i17 = i16;
                        while (i16 < size2) {
                            hg4Var = (hg4) arrayList.get(i16);
                            if (hg4Var instanceof tp0) {
                                i20 = size2;
                                z9 = z6;
                                z10 = z5;
                                i22 = i15;
                                i23 = i17;
                                vf4Var4 = vf4Var2;
                            } else {
                                i20 = size2;
                                if (hg4Var.f0 == 8) {
                                    z9 = z6;
                                    z10 = z5;
                                    i22 = i15;
                                    i23 = i17;
                                    vf4Var4 = vf4Var2;
                                } else {
                                    iO3 = hg4Var.o();
                                    i21 = hg4Var.i();
                                    z9 = z6;
                                    int i1110 = hg4Var.Z;
                                    z10 = z5;
                                    if (i15 == 1) {
                                    }
                                    i22 = i15;
                                    vf4Var4 = vf4Var2;
                                    int i1111 = (ks6Var.d(i111, vf4Var4, hg4Var) ? 1 : 0) | i17;
                                    iO4 = hg4Var.o();
                                    i23 = i1111;
                                    i24 = hg4Var.i();
                                    if (iO4 != iO3) {
                                        hg4Var.K(iO4);
                                        if (!z10) {
                                        }
                                        i23 = 1;
                                    }
                                    if (i24 != i21) {
                                        hg4Var.H(i24);
                                        if (!z9) {
                                        }
                                        i23 = 1;
                                    }
                                    if (!hg4Var.E) {
                                    }
                                }
                            }
                            i16++;
                            vf4Var2 = vf4Var4;
                            size2 = i20;
                            z6 = z9;
                            z5 = z10;
                            i15 = i22;
                            i17 = i23;
                        }
                        i18 = size2;
                        z7 = z6;
                        z8 = z5;
                        i19 = i15;
                        vf4Var3 = vf4Var2;
                        if (i17 == 0) {
                            break;
                            break;
                        }
                        int i1112 = i19 + 1;
                        ks6Var.f(ig4Var3, i1112, iO2, i7);
                        vf4Var2 = vf4Var3;
                        i14 = iMax3;
                        i13 = iMax4;
                        z6 = z7;
                        z5 = z8;
                        i11 = 0;
                        i15 = i1112;
                        size2 = i18;
                    }
                }
                ig4Var3.C0 = i1012;
                b29.p = ig4Var3.S(np0.o);
            } else {
                int i1013 = ig4Var3.C0;
                if (i9 > 0) {
                    size3 = ig4Var3.p0.size();
                    zS = ig4Var3.S(64);
                    vf4Var5 = ig4Var3.t0;
                    i25 = 0;
                    while (i25 < size3) {
                        hg4Var2 = (hg4) ig4Var3.p0.get(i25);
                        if (hg4Var2 instanceof or7) {
                            i28 = size3;
                        } else {
                            hg4Var2.getClass();
                            if (zS) {
                            }
                            iH = hg4Var2.h(0);
                            int iH8 = hg4Var2.h(1);
                            i28 = size3;
                            if (iH == 3) {
                                z11 = false;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                            }
                            if (z11) {
                                ks6Var.d(0, vf4Var5, hg4Var2);
                            }
                        }
                        i25++;
                        size3 = i28;
                    }
                    wf4Var = vf4Var5.a;
                    childCount = wf4Var.getChildCount();
                    arrayList2 = wf4Var.b;
                    while (i26 < childCount) {
                        wf4Var.getChildAt(i26);
                    }
                    size4 = arrayList2.size();
                    if (size4 > 0) {
                        while (i27 < size4) {
                            ((sf4) arrayList2.get(i27)).getClass();
                        }
                    }
                }
                ks6Var.g(ig4Var3);
                size2 = arrayList.size();
                i11 = 0;
                if (i9 > 0) {
                    ks6Var.f(ig4Var3, 0, iO2, i7);
                }
                if (size2 > 0) {
                    iArr3 = ig4Var3.o0;
                    if (iArr3[0] == 2) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (iArr3[1] == 2) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    int iMax17 = Math.max(ig4Var3.o(), ig4Var.a0);
                    int iMax18 = Math.max(ig4Var3.i(), ig4Var.b0);
                    while (i12 < size2) {
                    }
                    i13 = iMax18;
                    i14 = iMax17;
                    i15 = 0;
                    while (i15 < 2) {
                        iMax3 = i14;
                        iMax4 = i13;
                        i16 = i11;
                        i17 = i16;
                        while (i16 < size2) {
                            hg4Var = (hg4) arrayList.get(i16);
                            if (hg4Var instanceof tp0) {
                                i20 = size2;
                                z9 = z6;
                                z10 = z5;
                                i22 = i15;
                                i23 = i17;
                                vf4Var4 = vf4Var2;
                            } else {
                                i20 = size2;
                                if (hg4Var.f0 == 8) {
                                    z9 = z6;
                                    z10 = z5;
                                    i22 = i15;
                                    i23 = i17;
                                    vf4Var4 = vf4Var2;
                                } else {
                                    iO3 = hg4Var.o();
                                    i21 = hg4Var.i();
                                    z9 = z6;
                                    int i1113 = hg4Var.Z;
                                    z10 = z5;
                                    if (i15 == 1) {
                                    }
                                    i22 = i15;
                                    vf4Var4 = vf4Var2;
                                    int i1114 = (ks6Var.d(i111, vf4Var4, hg4Var) ? 1 : 0) | i17;
                                    iO4 = hg4Var.o();
                                    i23 = i1114;
                                    i24 = hg4Var.i();
                                    if (iO4 != iO3) {
                                        hg4Var.K(iO4);
                                        if (!z10) {
                                        }
                                        i23 = 1;
                                    }
                                    if (i24 != i21) {
                                        hg4Var.H(i24);
                                        if (!z9) {
                                        }
                                        i23 = 1;
                                    }
                                    if (!hg4Var.E) {
                                    }
                                }
                            }
                            i16++;
                            vf4Var2 = vf4Var4;
                            size2 = i20;
                            z6 = z9;
                            z5 = z10;
                            i15 = i22;
                            i17 = i23;
                        }
                        i18 = size2;
                        z7 = z6;
                        z8 = z5;
                        i19 = i15;
                        vf4Var3 = vf4Var2;
                        if (i17 == 0) {
                            break;
                            break;
                        }
                        int i1115 = i19 + 1;
                        ks6Var.f(ig4Var3, i1115, iO2, i7);
                        vf4Var2 = vf4Var3;
                        i14 = iMax3;
                        i13 = iMax4;
                        z6 = z7;
                        z5 = z8;
                        i11 = 0;
                        i15 = i1115;
                        size2 = i18;
                    }
                }
                ig4Var3.C0 = i1013;
                b29.p = ig4Var3.S(np0.o);
            }
            s(i, i2, ig4Var3.o(), ig4Var3.i(), ig4Var3.D0, ig4Var3.E0);
        }
        if (childCount5 == 0) {
            iMax2 = Math.max(0, wf4Var2.e);
        } else {
            iMax2 = i101;
        }
        i4 = 2;
        iO = ig4Var3.o();
        iArr = ig4Var3.C;
        if (iMax == iO) {
            th5Var.b = true;
            c = 1;
        } else {
            th5Var.b = true;
            c = 1;
        }
        ig4Var3.X = 0;
        ig4Var3.Y = 0;
        iArr[0] = wf4Var2.f - i103;
        iArr[c] = wf4Var2.g - i102;
        ig4Var3.a0 = 0;
        ig4Var3.b0 = 0;
        ig4Var3.I(i3);
        ig4Var3.K(iMax);
        ig4Var3.J(i4);
        ig4Var3.H(iMax2);
        i5 = wf4Var2.d - i103;
        if (i5 < 0) {
            ig4Var3.a0 = 0;
        } else {
            ig4Var3.a0 = i5;
        }
        i6 = wf4Var2.e - i102;
        if (i6 < 0) {
            ig4Var3.b0 = 0;
        } else {
            ig4Var3.b0 = i6;
        }
        ig4Var3.w0 = iMax7;
        ig4Var3.x0 = iMax5;
        ig4Var = (ig4) ks6Var.c;
        arrayList = (ArrayList) ks6Var.a;
        vf4Var = ig4Var3.t0;
        size = ig4Var3.p0.size();
        iO2 = ig4Var3.o();
        i7 = ig4Var3.i();
        zQ = sb8.q(i98, np0.m);
        if (zQ) {
            z = true;
        } else {
            z = true;
        }
        if (z) {
            i36 = 0;
            while (true) {
                if (i36 < size) {
                    z17 = z;
                    hg4Var3 = (hg4) ig4Var3.p0.get(i36);
                    i37 = i36;
                    iArr4 = hg4Var3.o0;
                    iArr2 = iArr;
                    if (iArr4[0] == 3) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (iArr4[1] == 3) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    if (z18) {
                        z20 = false;
                    } else {
                        z20 = false;
                    }
                    if (hg4Var3.v()) {
                        i36 = i37 + 1;
                        z = z17;
                        iArr = iArr2;
                    } else {
                        i36 = i37 + 1;
                        z = z17;
                        iArr = iArr2;
                    }
                    i8 = 1073741824;
                    z2 = false;
                } else {
                    z2 = z;
                    iArr2 = iArr;
                    i8 = 1073741824;
                }
            }
        } else {
            z2 = z;
            iArr2 = iArr;
            i8 = 1073741824;
        }
        z3 = z2 & ((mode != i8 && mode2 == i8) || zQ);
        if (z3) {
            int iMin5 = Math.min(iArr2[0], i100);
            iMin = Math.min(iArr2[1], i101);
            if (mode == 1073741824) {
                z12 = true;
            } else {
                z12 = true;
            }
            i29 = 1073741824;
            if (mode2 == 1073741824) {
                if (ig4Var3.i() != iMin) {
                    ig4Var3.H(iMin);
                    th5Var.a = z12;
                }
                i29 = 1073741824;
            }
            if (mode == i29) {
                z4 = z3;
                vf4Var2 = vf4Var;
                i9 = size;
                ig4Var2 = (ig4) th5Var.c;
                if (th5Var.a) {
                    while (r1.hasNext()) {
                        hg4Var16.f();
                        hg4Var16.a = false;
                        cz7 cz7Var12 = hg4Var16.d;
                        cz7Var12.e.j = false;
                        cz7Var12.g = false;
                        cz7Var12.n();
                        bti btiVar12 = hg4Var16.e;
                        btiVar12.e.j = false;
                        btiVar12.g = false;
                        btiVar12.m();
                    }
                    i30 = 0;
                    ig4Var2.f();
                    ig4Var2.a = false;
                    cz7 cz7Var13 = ig4Var2.d;
                    cz7Var13.e.j = false;
                    cz7Var13.g = false;
                    cz7Var13.n();
                    bti btiVar13 = ig4Var2.e;
                    btiVar13.e.j = false;
                    btiVar13.g = false;
                    btiVar13.m();
                    th5Var.d();
                } else {
                    i30 = 0;
                }
                th5Var.c((ig4) th5Var.d);
                ig4Var2.X = i30;
                ig4Var2.Y = i30;
                ig4Var2.d.h.d(i30);
                ig4Var2.e.h.d(i30);
                i31 = 1073741824;
                if (mode == 1073741824) {
                    zP = ig4Var3.P(i30, zQ);
                    i10 = 1;
                } else {
                    zP = true;
                    i10 = 0;
                }
                if (mode2 == 1073741824) {
                    zP &= ig4Var3.P(1, zQ);
                    i10++;
                }
            } else {
                z4 = z3;
                vf4Var2 = vf4Var;
                i9 = size;
                ig4Var2 = (ig4) th5Var.c;
                if (th5Var.a) {
                    while (r1.hasNext()) {
                        hg4Var16.f();
                        hg4Var16.a = false;
                        cz7 cz7Var14 = hg4Var16.d;
                        cz7Var14.e.j = false;
                        cz7Var14.g = false;
                        cz7Var14.n();
                        bti btiVar14 = hg4Var16.e;
                        btiVar14.e.j = false;
                        btiVar14.g = false;
                        btiVar14.m();
                    }
                    i30 = 0;
                    ig4Var2.f();
                    ig4Var2.a = false;
                    cz7 cz7Var15 = ig4Var2.d;
                    cz7Var15.e.j = false;
                    cz7Var15.g = false;
                    cz7Var15.n();
                    bti btiVar15 = ig4Var2.e;
                    btiVar15.e.j = false;
                    btiVar15.g = false;
                    btiVar15.m();
                    th5Var.d();
                } else {
                    i30 = 0;
                }
                th5Var.c((ig4) th5Var.d);
                ig4Var2.X = i30;
                ig4Var2.Y = i30;
                ig4Var2.d.h.d(i30);
                ig4Var2.e.h.d(i30);
                i31 = 1073741824;
                if (mode == 1073741824) {
                    zP = ig4Var3.P(i30, zQ);
                    i10 = 1;
                } else {
                    zP = true;
                    i10 = 0;
                }
                if (mode2 == 1073741824) {
                    zP &= ig4Var3.P(1, zQ);
                    i10++;
                }
            }
            if (zP) {
                if (mode == i31) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (mode2 == i31) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                ig4Var3.L(z13, z14);
            }
        } else {
            z4 = z3;
            vf4Var2 = vf4Var;
            i9 = size;
            zP = false;
            i10 = 0;
        }
        if (zP) {
            int i1014 = ig4Var3.C0;
            if (i9 > 0) {
                size3 = ig4Var3.p0.size();
                zS = ig4Var3.S(64);
                vf4Var5 = ig4Var3.t0;
                i25 = 0;
                while (i25 < size3) {
                    hg4Var2 = (hg4) ig4Var3.p0.get(i25);
                    if (hg4Var2 instanceof or7) {
                        i28 = size3;
                    } else {
                        hg4Var2.getClass();
                        if (zS) {
                        }
                        iH = hg4Var2.h(0);
                        int iH9 = hg4Var2.h(1);
                        i28 = size3;
                        if (iH == 3) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                        }
                        if (z11) {
                            ks6Var.d(0, vf4Var5, hg4Var2);
                        }
                    }
                    i25++;
                    size3 = i28;
                }
                wf4Var = vf4Var5.a;
                childCount = wf4Var.getChildCount();
                arrayList2 = wf4Var.b;
                while (i26 < childCount) {
                    wf4Var.getChildAt(i26);
                }
                size4 = arrayList2.size();
                if (size4 > 0) {
                    while (i27 < size4) {
                        ((sf4) arrayList2.get(i27)).getClass();
                    }
                }
            }
            ks6Var.g(ig4Var3);
            size2 = arrayList.size();
            i11 = 0;
            if (i9 > 0) {
                ks6Var.f(ig4Var3, 0, iO2, i7);
            }
            if (size2 > 0) {
                iArr3 = ig4Var3.o0;
                if (iArr3[0] == 2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (iArr3[1] == 2) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                int iMax19 = Math.max(ig4Var3.o(), ig4Var.a0);
                int iMax110 = Math.max(ig4Var3.i(), ig4Var.b0);
                while (i12 < size2) {
                }
                i13 = iMax110;
                i14 = iMax19;
                i15 = 0;
                while (i15 < 2) {
                    iMax3 = i14;
                    iMax4 = i13;
                    i16 = i11;
                    i17 = i16;
                    while (i16 < size2) {
                        hg4Var = (hg4) arrayList.get(i16);
                        if (hg4Var instanceof tp0) {
                            i20 = size2;
                            z9 = z6;
                            z10 = z5;
                            i22 = i15;
                            i23 = i17;
                            vf4Var4 = vf4Var2;
                        } else {
                            i20 = size2;
                            if (hg4Var.f0 == 8) {
                                z9 = z6;
                                z10 = z5;
                                i22 = i15;
                                i23 = i17;
                                vf4Var4 = vf4Var2;
                            } else {
                                iO3 = hg4Var.o();
                                i21 = hg4Var.i();
                                z9 = z6;
                                int i1116 = hg4Var.Z;
                                z10 = z5;
                                if (i15 == 1) {
                                }
                                i22 = i15;
                                vf4Var4 = vf4Var2;
                                int i1117 = (ks6Var.d(i111, vf4Var4, hg4Var) ? 1 : 0) | i17;
                                iO4 = hg4Var.o();
                                i23 = i1117;
                                i24 = hg4Var.i();
                                if (iO4 != iO3) {
                                    hg4Var.K(iO4);
                                    if (!z10) {
                                    }
                                    i23 = 1;
                                }
                                if (i24 != i21) {
                                    hg4Var.H(i24);
                                    if (!z9) {
                                    }
                                    i23 = 1;
                                }
                                if (!hg4Var.E) {
                                }
                            }
                        }
                        i16++;
                        vf4Var2 = vf4Var4;
                        size2 = i20;
                        z6 = z9;
                        z5 = z10;
                        i15 = i22;
                        i17 = i23;
                    }
                    i18 = size2;
                    z7 = z6;
                    z8 = z5;
                    i19 = i15;
                    vf4Var3 = vf4Var2;
                    if (i17 == 0) {
                        break;
                        break;
                    }
                    int i1118 = i19 + 1;
                    ks6Var.f(ig4Var3, i1118, iO2, i7);
                    vf4Var2 = vf4Var3;
                    i14 = iMax3;
                    i13 = iMax4;
                    z6 = z7;
                    z5 = z8;
                    i11 = 0;
                    i15 = i1118;
                    size2 = i18;
                }
            }
            ig4Var3.C0 = i1014;
            b29.p = ig4Var3.S(np0.o);
        } else {
            int i1015 = ig4Var3.C0;
            if (i9 > 0) {
                size3 = ig4Var3.p0.size();
                zS = ig4Var3.S(64);
                vf4Var5 = ig4Var3.t0;
                i25 = 0;
                while (i25 < size3) {
                    hg4Var2 = (hg4) ig4Var3.p0.get(i25);
                    if (hg4Var2 instanceof or7) {
                        i28 = size3;
                    } else {
                        hg4Var2.getClass();
                        if (zS) {
                        }
                        iH = hg4Var2.h(0);
                        int iH10 = hg4Var2.h(1);
                        i28 = size3;
                        if (iH == 3) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                        }
                        if (z11) {
                            ks6Var.d(0, vf4Var5, hg4Var2);
                        }
                    }
                    i25++;
                    size3 = i28;
                }
                wf4Var = vf4Var5.a;
                childCount = wf4Var.getChildCount();
                arrayList2 = wf4Var.b;
                while (i26 < childCount) {
                    wf4Var.getChildAt(i26);
                }
                size4 = arrayList2.size();
                if (size4 > 0) {
                    while (i27 < size4) {
                        ((sf4) arrayList2.get(i27)).getClass();
                    }
                }
            }
            ks6Var.g(ig4Var3);
            size2 = arrayList.size();
            i11 = 0;
            if (i9 > 0) {
                ks6Var.f(ig4Var3, 0, iO2, i7);
            }
            if (size2 > 0) {
                iArr3 = ig4Var3.o0;
                if (iArr3[0] == 2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (iArr3[1] == 2) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                int iMax111 = Math.max(ig4Var3.o(), ig4Var.a0);
                int iMax112 = Math.max(ig4Var3.i(), ig4Var.b0);
                while (i12 < size2) {
                }
                i13 = iMax112;
                i14 = iMax111;
                i15 = 0;
                while (i15 < 2) {
                    iMax3 = i14;
                    iMax4 = i13;
                    i16 = i11;
                    i17 = i16;
                    while (i16 < size2) {
                        hg4Var = (hg4) arrayList.get(i16);
                        if (hg4Var instanceof tp0) {
                            i20 = size2;
                            z9 = z6;
                            z10 = z5;
                            i22 = i15;
                            i23 = i17;
                            vf4Var4 = vf4Var2;
                        } else {
                            i20 = size2;
                            if (hg4Var.f0 == 8) {
                                z9 = z6;
                                z10 = z5;
                                i22 = i15;
                                i23 = i17;
                                vf4Var4 = vf4Var2;
                            } else {
                                iO3 = hg4Var.o();
                                i21 = hg4Var.i();
                                z9 = z6;
                                int i1119 = hg4Var.Z;
                                z10 = z5;
                                if (i15 == 1) {
                                }
                                i22 = i15;
                                vf4Var4 = vf4Var2;
                                int i11110 = (ks6Var.d(i111, vf4Var4, hg4Var) ? 1 : 0) | i17;
                                iO4 = hg4Var.o();
                                i23 = i11110;
                                i24 = hg4Var.i();
                                if (iO4 != iO3) {
                                    hg4Var.K(iO4);
                                    if (!z10) {
                                    }
                                    i23 = 1;
                                }
                                if (i24 != i21) {
                                    hg4Var.H(i24);
                                    if (!z9) {
                                    }
                                    i23 = 1;
                                }
                                if (!hg4Var.E) {
                                }
                            }
                        }
                        i16++;
                        vf4Var2 = vf4Var4;
                        size2 = i20;
                        z6 = z9;
                        z5 = z10;
                        i15 = i22;
                        i17 = i23;
                    }
                    i18 = size2;
                    z7 = z6;
                    z8 = z5;
                    i19 = i15;
                    vf4Var3 = vf4Var2;
                    if (i17 == 0) {
                        break;
                        break;
                    }
                    int i11111 = i19 + 1;
                    ks6Var.f(ig4Var3, i11111, iO2, i7);
                    vf4Var2 = vf4Var3;
                    i14 = iMax3;
                    i13 = iMax4;
                    z6 = z7;
                    z5 = z8;
                    i11 = 0;
                    i15 = i11111;
                    size2 = i18;
                }
            }
            ig4Var3.C0 = i1015;
            b29.p = ig4Var3.S(np0.o);
        }
        s(i, i2, ig4Var3.o(), ig4Var3.i(), ig4Var3.D0, ig4Var3.E0);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        hg4 hg4VarQ = q(view);
        if ((view instanceof Guideline) && !(hg4VarQ instanceof or7)) {
            uf4 uf4Var = (uf4) view.getLayoutParams();
            or7 or7Var = new or7();
            uf4Var.p0 = or7Var;
            uf4Var.d0 = true;
            or7Var.O(uf4Var.V);
        }
        if (view instanceof sf4) {
            sf4 sf4Var = (sf4) view;
            sf4Var.e();
            ((uf4) view.getLayoutParams()).e0 = true;
            ArrayList arrayList = this.b;
            if (!arrayList.contains(sf4Var)) {
                arrayList.add(sf4Var);
            }
        }
        this.a.put(view.getId(), view);
        this.h = true;
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.a.remove(view.getId());
        hg4 hg4VarQ = q(view);
        this.c.p0.remove(hg4VarQ);
        hg4VarQ.A();
        this.b.remove(view);
        this.h = true;
    }

    public final hg4 q(View view) {
        if (view == this) {
            return this.c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof uf4) {
            return ((uf4) view.getLayoutParams()).p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof uf4) {
            return ((uf4) view.getLayoutParams()).p0;
        }
        return null;
    }

    public final void r(AttributeSet attributeSet) {
        ig4 ig4Var = this.c;
        ig4Var.e0 = this;
        vf4 vf4Var = this.o;
        ig4Var.t0 = vf4Var;
        ig4Var.r0.g = vf4Var;
        this.a.put(getId(), this);
        this.j = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e3e.b, 0, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 16) {
                    this.d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.d);
                } else if (index == 17) {
                    this.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                } else if (index == 14) {
                    this.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                } else if (index == 15) {
                    this.g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.g);
                } else if (index == 113) {
                    this.i = typedArrayObtainStyledAttributes.getInt(index, this.i);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            this.k = new fik(getContext(), resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.k = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        eg4 eg4Var = new eg4();
                        this.j = eg4Var;
                        eg4Var.h(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.j = null;
                    }
                    this.l = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        ig4Var.C0 = this.i;
        b29.p = ig4Var.S(np0.o);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.h = true;
        super.requestLayout();
    }

    public final void s(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        vf4 vf4Var = this.o;
        int i5 = vf4Var.e;
        int iResolveSizeAndState = View.resolveSizeAndState(i3 + vf4Var.d, i, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i4 + i5, i2, 0) & 16777215;
        int iMin = Math.min(this.f, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.g, iResolveSizeAndState2);
        if (z) {
            iMin |= 16777216;
        }
        if (z2) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
    }

    public void setConstraintSet(eg4 eg4Var) {
        this.j = eg4Var;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.a;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.g) {
            return;
        }
        this.g = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f) {
            return;
        }
        this.f = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.e) {
            return;
        }
        this.e = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.d) {
            return;
        }
        this.d = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(lg4 lg4Var) {
        fik fikVar = this.k;
        if (fikVar != null) {
            fikVar.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.i = i;
        ig4 ig4Var = this.c;
        ig4Var.C0 = i;
        b29.p = ig4Var.S(np0.o);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void t(hg4 hg4Var, uf4 uf4Var, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.a.get(i);
        hg4 hg4Var2 = (hg4) sparseArray.get(i);
        if (hg4Var2 == null || view == null || !(view.getLayoutParams() instanceof uf4)) {
            return;
        }
        uf4Var.c0 = true;
        if (i2 == 6) {
            uf4 uf4Var2 = (uf4) view.getLayoutParams();
            uf4Var2.c0 = true;
            uf4Var2.p0.E = true;
        }
        hg4Var.g(6).a(hg4Var2.g(i2), uf4Var.D, uf4Var.C);
        hg4Var.E = true;
        hg4Var.g(3).g();
        hg4Var.g(5).g();
    }

    public wf4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new ig4();
        this.d = 0;
        this.e = 0;
        this.f = Integer.MAX_VALUE;
        this.g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 257;
        this.j = null;
        this.k = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = new SparseArray();
        this.o = new vf4(this, this);
        this.p = 0;
        this.q = 0;
        r(attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        uf4 uf4Var = new uf4(layoutParams);
        uf4Var.a = -1;
        uf4Var.b = -1;
        uf4Var.c = -1.0f;
        uf4Var.d = true;
        uf4Var.e = -1;
        uf4Var.f = -1;
        uf4Var.g = -1;
        uf4Var.h = -1;
        uf4Var.i = -1;
        uf4Var.j = -1;
        uf4Var.k = -1;
        uf4Var.l = -1;
        uf4Var.m = -1;
        uf4Var.n = -1;
        uf4Var.o = -1;
        uf4Var.p = -1;
        uf4Var.q = 0;
        uf4Var.r = 0.0f;
        uf4Var.s = -1;
        uf4Var.t = -1;
        uf4Var.u = -1;
        uf4Var.v = -1;
        uf4Var.w = Integer.MIN_VALUE;
        uf4Var.x = Integer.MIN_VALUE;
        uf4Var.y = Integer.MIN_VALUE;
        uf4Var.z = Integer.MIN_VALUE;
        uf4Var.A = Integer.MIN_VALUE;
        uf4Var.B = Integer.MIN_VALUE;
        uf4Var.C = Integer.MIN_VALUE;
        uf4Var.D = 0;
        uf4Var.E = 0.5f;
        uf4Var.F = 0.5f;
        uf4Var.G = null;
        uf4Var.H = -1.0f;
        uf4Var.I = -1.0f;
        uf4Var.J = 0;
        uf4Var.K = 0;
        uf4Var.L = 0;
        uf4Var.M = 0;
        uf4Var.N = 0;
        uf4Var.O = 0;
        uf4Var.P = 0;
        uf4Var.Q = 0;
        uf4Var.R = 1.0f;
        uf4Var.S = 1.0f;
        uf4Var.T = -1;
        uf4Var.U = -1;
        uf4Var.V = -1;
        uf4Var.W = false;
        uf4Var.X = false;
        uf4Var.Y = null;
        uf4Var.Z = 0;
        uf4Var.a0 = true;
        uf4Var.b0 = true;
        uf4Var.c0 = false;
        uf4Var.d0 = false;
        uf4Var.e0 = false;
        uf4Var.f0 = -1;
        uf4Var.g0 = -1;
        uf4Var.h0 = -1;
        uf4Var.i0 = -1;
        uf4Var.j0 = Integer.MIN_VALUE;
        uf4Var.k0 = Integer.MIN_VALUE;
        uf4Var.l0 = 0.5f;
        uf4Var.p0 = new hg4();
        return uf4Var;
    }
}
