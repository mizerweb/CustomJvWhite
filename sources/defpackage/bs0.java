package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class bs0 {
    public final /* synthetic */ int a;
    public int b;
    public int c;

    public /* synthetic */ bs0(int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.c = i2;
    }

    public void a(int i) {
        int i2;
        int i3 = this.c;
        if (i3 < i || (i2 = this.b) <= 0) {
            pj6.m("com.facebook.imagepipeline.memory.BasePool.Counter", "Unexpected decrement of %d. Current numBytes = %d, count = %d", Integer.valueOf(i), Integer.valueOf(this.c), Integer.valueOf(this.b));
        } else {
            this.b = i2 - 1;
            this.c = i3 - i;
        }
    }

    public int b() {
        switch (this.a) {
            case 6:
                return this.b;
            default:
                return this.c;
        }
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.b;
    }

    public int e() {
        switch (this.a) {
            case 12:
                break;
            case 18:
                break;
        }
        return this.c;
    }

    public int f() {
        switch (this.a) {
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
        }
        return this.b;
    }

    public int g() {
        return this.b;
    }

    public int h() {
        switch (this.a) {
            case 6:
                return this.c;
            default:
                return this.b;
        }
    }

    public int i() {
        return this.c;
    }

    public int j() {
        switch (this.a) {
            case 12:
                return this.b;
            case 13:
                return this.c;
            case 14:
                return this.c;
            case 15:
                return this.c;
            case 16:
                return this.c;
            case 17:
                return this.c;
            case 18:
                return this.b;
            case 19:
                return this.c;
            default:
                return this.b;
        }
    }

    public int k() {
        switch (this.a) {
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
        }
        return this.b;
    }

    public int l() {
        switch (this.a) {
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
        }
        return this.c;
    }

    public void m(lfe lfeVar) {
        View view = lfeVar.a;
        this.b = view.getLeft();
        this.c = view.getTop();
        view.getRight();
        view.getBottom();
    }

    public /* synthetic */ bs0(int i) {
        this.a = i;
    }
}
