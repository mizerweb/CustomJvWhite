package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.view.Surface;

/* JADX INFO: loaded from: classes2.dex */
public final class c38 implements e38 {
    public final IBinder c;

    public c38(IBinder iBinder) {
        this.c = iBinder;
    }

    @Override // defpackage.e38
    public final void A(y28 y28Var, int i, Surface surface, int i2, int i3) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(y28Var);
            parcelObtain.writeInt(i);
            j2m.b(parcelObtain, surface);
            parcelObtain.writeInt(i2);
            parcelObtain.writeInt(i3);
            this.c.transact(3061, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.e38
    public final void B(y28 y28Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(y28Var);
            parcelObtain.writeInt(i);
            this.c.transact(3034, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.e38
    public final void D(y28 y28Var, int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(y28Var);
            parcelObtain.writeInt(i);
            j2m.b(parcelObtain, bundle);
            this.c.transact(3014, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.e38
    public final void E(y28 y28Var, int i, Bundle bundle, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(y28Var);
            parcelObtain.writeInt(i);
            j2m.b(parcelObtain, bundle);
            parcelObtain.writeInt(z ? 1 : 0);
            this.c.transact(3057, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.e38
    public final void F(y28 y28Var, int i, Bundle bundle, long j) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(y28Var);
            parcelObtain.writeInt(i);
            j2m.b(parcelObtain, bundle);
            parcelObtain.writeLong(j);
            this.c.transact(3008, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.e38
    public final void H(y28 y28Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(y28Var);
            parcelObtain.writeInt(i);
            this.c.transact(3059, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.e38
    public final void I(y28 y28Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(y28Var);
            parcelObtain.writeInt(i);
            this.c.transact(3024, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.e38
    public final void J(y28 y28Var, int i, Bundle bundle, Bundle bundle2, boolean z) {
        Bundle bundle3 = Bundle.EMPTY;
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(y28Var);
            parcelObtain.writeInt(i);
            j2m.b(parcelObtain, bundle);
            j2m.b(parcelObtain, bundle3);
            parcelObtain.writeInt(z ? 1 : 0);
            this.c.transact(3060, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.e38
    public final void K(y28 y28Var, int i, IBinder iBinder, int i2, long j) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(y28Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeStrongBinder(iBinder);
            parcelObtain.writeInt(i2);
            parcelObtain.writeLong(j);
            this.c.transact(3012, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.e38
    public final void L(y28 y28Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(y28Var);
            parcelObtain.writeInt(i);
            this.c.transact(3043, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.e38
    public final void M(y28 y28Var, int i, float f) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(y28Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeFloat(f);
            this.c.transact(3028, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.e38
    public final void R(y28 y28Var, int i, IBinder iBinder, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(y28Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeStrongBinder(iBinder);
            parcelObtain.writeInt(1);
            this.c.transact(3011, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.e38
    public final void T(y28 y28Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(y28Var);
            parcelObtain.writeInt(i);
            this.c.transact(3047, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.e38
    public final void W(y28 y28Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(y28Var);
            parcelObtain.writeInt(i);
            this.c.transact(3036, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.e38
    public final void X(y28 y28Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(y28Var);
            parcelObtain.writeInt(i);
            this.c.transact(3042, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.e38
    public final void Z(y28 y28Var, int i, long j) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(y28Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeLong(j);
            this.c.transact(3038, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.e38
    public final void a0(y28 y28Var, int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(y28Var);
            parcelObtain.writeInt(i);
            j2m.b(parcelObtain, bundle);
            this.c.transact(3007, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.c;
    }

    @Override // defpackage.e38
    public final void b0(y28 y28Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(y28Var);
            parcelObtain.writeInt(i);
            this.c.transact(3035, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.e38
    public final void d(y28 y28Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(y28Var);
            parcelObtain.writeInt(i);
            this.c.transact(3025, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.e38
    public final void f(y28 y28Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(y28Var);
            parcelObtain.writeInt(i);
            this.c.transact(3058, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.e38
    public final void f0(y28 y28Var, int i, Surface surface) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(y28Var);
            parcelObtain.writeInt(i);
            j2m.b(parcelObtain, surface);
            this.c.transact(3044, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.e38
    public final void g0(y28 y28Var, int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(y28Var);
            parcelObtain.writeInt(i);
            j2m.b(parcelObtain, bundle);
            this.c.transact(3015, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.e38
    public final void h0(y28 y28Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(y28Var);
            parcelObtain.writeInt(i);
            this.c.transact(3046, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.e38
    public final void i0(y28 y28Var, int i, int i2) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(y28Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            this.c.transact(3017, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.e38
    public final void j(y28 y28Var, int i, float f) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(y28Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeFloat(f);
            this.c.transact(3002, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.e38
    public final void j0(y28 y28Var, int i, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(y28Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(z ? 1 : 0);
            this.c.transact(3018, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.e38
    public final void k(y28 y28Var, int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(y28Var);
            parcelObtain.writeInt(i);
            j2m.b(parcelObtain, bundle);
            this.c.transact(3048, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.e38
    public final void l(y28 y28Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(y28Var);
            parcelObtain.writeInt(i);
            this.c.transact(3041, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.e38
    public final void m(y28 y28Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(y28Var);
            parcelObtain.writeInt(i);
            this.c.transact(3040, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.e38
    public final void n(y28 y28Var, int i, int i2) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(y28Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            this.c.transact(3019, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.e38
    public final void p(y28 y28Var, int i, int i2, int i3) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(y28Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            parcelObtain.writeInt(i3);
            this.c.transact(3062, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.e38
    public final void q(y28 y28Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(y28Var);
            parcelObtain.writeInt(i);
            this.c.transact(3026, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.e38
    public final void r(y28 y28Var, int i, int i2) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(y28Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            this.c.transact(3037, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.e38
    public final void t(y28 y28Var, int i, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(y28Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(z ? 1 : 0);
            this.c.transact(3013, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.e38
    public final void u(y28 y28Var, int i, Bundle bundle, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(y28Var);
            parcelObtain.writeInt(i);
            j2m.b(parcelObtain, bundle);
            parcelObtain.writeInt(1);
            this.c.transact(3009, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.e38
    public final void v(y28 y28Var) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(y28Var);
            this.c.transact(3045, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.e38
    public final void w(y28 y28Var, int i, Bundle bundle) {
        Bundle bundle2 = Bundle.EMPTY;
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(y28Var);
            parcelObtain.writeInt(i);
            j2m.b(parcelObtain, bundle);
            j2m.b(parcelObtain, bundle2);
            this.c.transact(3016, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.e38
    public final void z(y28 y28Var, int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(y28Var);
            parcelObtain.writeInt(i);
            j2m.b(parcelObtain, bundle);
            this.c.transact(3033, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
