package defpackage;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class sv9 extends Binder implements y28 {
    public final WeakReference c;

    public sv9(jv9 jv9Var) {
        attachInterface(this, "androidx.media3.session.IMediaController");
        this.c = new WeakReference(jv9Var);
    }

    public static y28 G(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaController");
        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof y28)) ? new x28(iBinder) : (y28) iInterfaceQueryLocalInterface;
    }

    @Override // defpackage.y28
    public final void C(int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            l0(i, wmf.a(bundle));
        } catch (RuntimeException e) {
            lvb.H0("MediaControllerStub", "Ignoring malformed Bundle for SessionResult", e);
        }
    }

    @Override // defpackage.y28
    public final void N(int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            V(new oo6(19, h3d.b(bundle)));
        } catch (RuntimeException e) {
            lvb.H0("MediaControllerStub", "Ignoring malformed Bundle for Commands", e);
        }
    }

    @Override // defpackage.y28
    public final void O(int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            V(new oo6(18, umf.b(bundle)));
        } catch (RuntimeException e) {
            lvb.H0("MediaControllerStub", "Ignoring malformed Bundle for SessionPositionInfo", e);
        }
    }

    @Override // defpackage.y28
    public final void P(int i, Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            lvb.G0("MediaControllerStub", "Ignoring custom command with null args.");
            return;
        }
        try {
            V(new iw2(i, emf.a(bundle), bundle2));
        } catch (RuntimeException e) {
            lvb.H0("MediaControllerStub", "Ignoring malformed Bundle for SessionCommand", e);
        }
    }

    @Override // defpackage.y28
    public final void Q(int i, Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return;
        }
        try {
            int iK0 = k0();
            if (iK0 == -1) {
                return;
            }
            try {
                V(new fv9(c4d.p(iK0, bundle), 3, a4d.a(bundle2)));
            } catch (RuntimeException e) {
                lvb.H0("MediaControllerStub", "Ignoring malformed Bundle for BundlingExclusions", e);
            }
        } catch (RuntimeException e2) {
            lvb.H0("MediaControllerStub", "Ignoring malformed Bundle for PlayerInfo", e2);
        }
    }

    public final void V(rv9 rv9Var) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            jv9 jv9Var = (jv9) this.c.get();
            if (jv9Var == null) {
                return;
            }
            vqi.d0(jv9Var.a.f, new o90(jv9Var, 10, rv9Var));
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // defpackage.y28
    public final void a(int i, PendingIntent pendingIntent) {
        V(new qv9(i, pendingIntent));
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // defpackage.y28
    public final void b(int i) {
        V(new ch9(6));
    }

    @Override // defpackage.y28
    public final void c(int i, int i2, int i3) {
        V(new yu9(i2, i3, 1));
    }

    @Override // defpackage.y28
    public final void i(int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            V(new gve(re4.a(bundle)));
        } catch (RuntimeException e) {
            lvb.H0("MediaControllerStub", "Malformed Bundle for ConnectionResult. Disconnected from the session.", e);
            onDisconnected();
        }
    }

    public final int k0() {
        xnf xnfVar;
        jv9 jv9Var = (jv9) this.c.get();
        if (jv9Var == null || (xnfVar = jv9Var.n) == null) {
            return -1;
        }
        return xnfVar.a.e();
    }

    public final void l0(int i, Object obj) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            jv9 jv9Var = (jv9) this.c.get();
            if (jv9Var == null) {
                return;
            }
            jv9Var.b.d(i, obj);
            jv9Var.a.S(new ai(jv9Var, i, 15));
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // defpackage.y28
    public final void o(int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            l0(i, e09.a(bundle));
        } catch (RuntimeException e) {
            lvb.H0("MediaControllerStub", "Ignoring malformed Bundle for LibraryResult", e);
        }
    }

    @Override // defpackage.y28
    public final void onDisconnected() {
        V(new ch9(7));
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        String str;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("androidx.media3.session.IMediaController");
        }
        if (i == 1598968902) {
            parcel2.writeString("androidx.media3.session.IMediaController");
            return true;
        }
        tz9 tz9VarA = null;
        if (i == 4001) {
            parcel.readInt();
            String string = parcel.readString();
            i3 = parcel.readInt();
            Bundle bundle = (Bundle) pqi.a(parcel, Bundle.CREATOR);
            if (TextUtils.isEmpty(string)) {
                lvb.G0("MediaControllerStub", "onChildrenChanged(): Ignoring empty parentId");
            } else if (i3 < 0) {
                str = "onChildrenChanged(): Ignoring negative itemCount: ";
                qt4.y(i3, str, "MediaControllerStub");
            } else {
                if (bundle != null) {
                    try {
                        tz9VarA = tz9.a(bundle);
                    } catch (RuntimeException e) {
                        lvb.H0("MediaControllerStub", "Ignoring malformed Bundle for LibraryParams", e);
                    }
                }
                V(new ch9(string, i3, tz9VarA));
            }
        } else if (i != 4002) {
            int i4 = 4;
            switch (i) {
                case 3001:
                    i(parcel.readInt(), (Bundle) pqi.a(parcel, Bundle.CREATOR));
                    return true;
                case 3002:
                    C(parcel.readInt(), (Bundle) pqi.a(parcel, Bundle.CREATOR));
                    return true;
                case 3003:
                    o(parcel.readInt(), (Bundle) pqi.a(parcel, Bundle.CREATOR));
                    return true;
                case 3004:
                    int i5 = parcel.readInt();
                    ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Bundle.CREATOR);
                    if (arrayListCreateTypedArrayList != null) {
                        try {
                            int iK0 = k0();
                            if (iK0 != -1) {
                                V(new ew2(i5, l51.a(new jn4(iK0, 6), arrayListCreateTypedArrayList)));
                            }
                        } catch (RuntimeException e2) {
                            lvb.H0("MediaControllerStub", "Ignoring malformed Bundle for CommandButton", e2);
                        }
                    }
                    break;
                case 3005:
                    int i6 = parcel.readInt();
                    Parcelable.Creator creator = Bundle.CREATOR;
                    P(i6, (Bundle) pqi.a(parcel, creator), (Bundle) pqi.a(parcel, creator));
                    return true;
                case 3006:
                    parcel.readInt();
                    onDisconnected();
                    return true;
                case 3007:
                    s((Bundle) pqi.a(parcel, Bundle.CREATOR), parcel.readInt(), parcel.readInt() != 0);
                    return true;
                case 3008:
                    O(parcel.readInt(), (Bundle) pqi.a(parcel, Bundle.CREATOR));
                    return true;
                case 3009:
                    N(parcel.readInt(), (Bundle) pqi.a(parcel, Bundle.CREATOR));
                    return true;
                case 3010:
                    parcel.readInt();
                    Parcelable.Creator creator2 = Bundle.CREATOR;
                    Bundle bundle2 = (Bundle) pqi.a(parcel, creator2);
                    Bundle bundle3 = (Bundle) pqi.a(parcel, creator2);
                    if (bundle2 != null && bundle3 != null) {
                        try {
                            try {
                                V(new fv9(fmf.a(bundle2), i4, h3d.b(bundle3)));
                            } catch (RuntimeException e3) {
                                lvb.H0("MediaControllerStub", "Ignoring malformed Bundle for Commands", e3);
                            }
                        } catch (RuntimeException e4) {
                            lvb.H0("MediaControllerStub", "Ignoring malformed Bundle for SessionCommands", e4);
                        }
                    }
                    break;
                case 3011:
                    b(parcel.readInt());
                    return true;
                case 3012:
                    parcel.readInt();
                    Bundle bundleN = vqi.n((Bundle) pqi.a(parcel, Bundle.CREATOR));
                    if (bundleN == null) {
                        lvb.G0("MediaControllerStub", "Ignoring null Bundle for extras");
                        return true;
                    }
                    V(new yj1(8, bundleN));
                    return true;
                case 3013:
                    int i7 = parcel.readInt();
                    Parcelable.Creator creator3 = Bundle.CREATOR;
                    Q(i7, (Bundle) pqi.a(parcel, creator3), (Bundle) pqi.a(parcel, creator3));
                    return true;
                case 3014:
                    a(parcel.readInt(), (PendingIntent) pqi.a(parcel, PendingIntent.CREATOR));
                    return true;
                case 3015:
                    try {
                        V(new oo6(parcel.readInt(), pmf.a((Bundle) pqi.a(parcel, Bundle.CREATOR))));
                    } catch (RuntimeException e5) {
                        lvb.H0("MediaControllerStub", "Ignoring malformed Bundle for SessionError", e5);
                    }
                    break;
                case 3016:
                    int i8 = parcel.readInt();
                    ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(Bundle.CREATOR);
                    if (arrayListCreateTypedArrayList2 != null) {
                        try {
                            int iK1 = k0();
                            if (iK1 != -1) {
                                V(new iw2(i8, l51.a(new jn4(iK1, i4), arrayListCreateTypedArrayList2)));
                            }
                        } catch (RuntimeException e6) {
                            lvb.H0("MediaControllerStub", "Ignoring malformed Bundle for CommandButton", e6);
                        }
                    }
                    break;
                case 3017:
                    int i9 = parcel.readInt();
                    Parcelable.Creator creator4 = Bundle.CREATOR;
                    Bundle bundle4 = (Bundle) pqi.a(parcel, creator4);
                    Bundle bundle5 = (Bundle) pqi.a(parcel, creator4);
                    Bundle bundle6 = (Bundle) pqi.a(parcel, creator4);
                    if (bundle4 == null || bundle5 == null) {
                        lvb.G0("MediaControllerStub", "Ignoring custom command progress update with null args.");
                    } else {
                        try {
                            V(new jn4(i9, emf.a(bundle4), bundle5, bundle6));
                        } catch (RuntimeException e7) {
                            lvb.H0("MediaControllerStub", "Ignoring malformed Bundle for SessionCommand", e7);
                        }
                    }
                    break;
                case 3018:
                    c(parcel.readInt(), parcel.readInt(), parcel.readInt());
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        } else {
            parcel.readInt();
            String string2 = parcel.readString();
            i3 = parcel.readInt();
            Bundle bundle7 = (Bundle) pqi.a(parcel, Bundle.CREATOR);
            if (TextUtils.isEmpty(string2)) {
                lvb.G0("MediaControllerStub", "onSearchResultChanged(): Ignoring empty query");
            } else if (i3 < 0) {
                str = "onSearchResultChanged(): Ignoring negative itemCount: ";
                qt4.y(i3, str, "MediaControllerStub");
            } else {
                if (bundle7 != null) {
                    try {
                        tz9VarA = tz9.a(bundle7);
                    } catch (RuntimeException e8) {
                        lvb.H0("MediaControllerStub", "Ignoring malformed Bundle for LibraryParams", e8);
                    }
                }
                V(new ch9(string2, i3, tz9VarA));
            }
        }
        return true;
    }

    @Override // defpackage.y28
    public final void s(Bundle bundle, int i, boolean z) {
        Q(i, bundle, new a4d(z, true).b());
    }
}
