package defpackage;

import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class n2a extends MediaSession.Callback {
    public final /* synthetic */ o2a a;

    public n2a(o2a o2aVar) {
        this.a = o2aVar;
    }

    public static void b(q2a q2aVar) {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        MediaSession mediaSession = q2aVar.a;
        String str = null;
        try {
            str = (String) mediaSession.getClass().getMethod("getCallingPackage", null).invoke(mediaSession, null);
        } catch (Exception e) {
            lvb.l0("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e);
        }
        if (TextUtils.isEmpty(str)) {
            str = "android.media.session.MediaController";
        }
        q2aVar.c(new p3a(str, -1, -1));
    }

    public final q2a a() {
        q2a q2aVar;
        o2a o2aVar;
        synchronized (this.a.a) {
            q2aVar = (q2a) this.a.d.get();
        }
        if (q2aVar == null) {
            return null;
        }
        o2a o2aVar2 = this.a;
        synchronized (q2aVar.d) {
            o2aVar = q2aVar.l;
        }
        if (o2aVar2 == o2aVar) {
            return q2aVar;
        }
        return null;
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        ysi ysiVar;
        q2a q2aVarA = a();
        if (q2aVarA == null) {
            return;
        }
        Bundle bundleN = vqi.n(bundle);
        b(q2aVarA);
        try {
            if (str.equals(MediaControllerCompat.COMMAND_GET_EXTRA_BINDER)) {
                if (resultReceiver != null) {
                    Bundle bundle2 = new Bundle();
                    u2a u2aVar = q2aVarA.c;
                    d38 d38VarA = u2aVar.a();
                    bundle2.putBinder(MediaSessionCompat.KEY_EXTRA_BINDER, d38VarA == null ? null : d38VarA.asBinder());
                    synchronized (u2aVar.a) {
                        ysiVar = u2aVar.d;
                    }
                    mmc.f(bundle2, ysiVar);
                    resultReceiver.send(0, bundle2);
                }
            } else if (str.equals(MediaControllerCompat.COMMAND_ADD_QUEUE_ITEM)) {
                if (bundleN != null) {
                    this.a.b((uv9) tab.h(bundleN.getParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION), uv9.CREATOR));
                }
            } else if (str.equals(MediaControllerCompat.COMMAND_ADD_QUEUE_ITEM_AT)) {
                if (bundleN != null) {
                    this.a.c((uv9) tab.h(bundleN.getParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION), uv9.CREATOR), bundleN.getInt(MediaControllerCompat.COMMAND_ARGUMENT_INDEX));
                }
            } else if (str.equals(MediaControllerCompat.COMMAND_REMOVE_QUEUE_ITEM)) {
                if (bundleN != null) {
                    this.a.q((uv9) tab.h(bundleN.getParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION), uv9.CREATOR));
                }
            } else if (str.equals(MediaControllerCompat.COMMAND_REMOVE_QUEUE_ITEM_AT)) {
                List list = q2aVarA.h;
                if (list != null && bundleN != null) {
                    int i = bundleN.getInt(MediaControllerCompat.COMMAND_ARGUMENT_INDEX, -1);
                    t2a t2aVar = (i < 0 || i >= list.size()) ? null : (t2a) list.get(i);
                    if (t2aVar != null) {
                        this.a.q(t2aVar.b());
                    }
                }
            } else {
                this.a.d(str, bundleN, resultReceiver);
            }
        } catch (BadParcelableException unused) {
            lvb.k0("MediaSessionCompat", "Could not unparcel the extra data.");
        }
        q2aVarA.c(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCustomAction(String str, Bundle bundle) {
        q2a q2aVarA = a();
        if (q2aVarA == null) {
            return;
        }
        Bundle bundleN = vqi.n(bundle);
        b(q2aVarA);
        try {
            boolean zEquals = str.equals(MediaSessionCompat.ACTION_PLAY_FROM_URI);
            o2a o2aVar = this.a;
            if (zEquals) {
                if (bundleN != null) {
                    o2aVar.l((Uri) bundleN.getParcelable(MediaSessionCompat.ACTION_ARGUMENT_URI), vqi.n(bundleN.getBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS)));
                }
            } else if (str.equals(MediaSessionCompat.ACTION_PREPARE)) {
                o2aVar.m();
            } else if (str.equals(MediaSessionCompat.ACTION_PREPARE_FROM_MEDIA_ID)) {
                if (bundleN != null) {
                    o2aVar.n(bundleN.getString(MediaSessionCompat.ACTION_ARGUMENT_MEDIA_ID), vqi.n(bundleN.getBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS)));
                }
            } else if (str.equals(MediaSessionCompat.ACTION_PREPARE_FROM_SEARCH)) {
                if (bundleN != null) {
                    o2aVar.o(bundleN.getString(MediaSessionCompat.ACTION_ARGUMENT_QUERY), vqi.n(bundleN.getBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS)));
                }
            } else if (str.equals(MediaSessionCompat.ACTION_PREPARE_FROM_URI)) {
                if (bundleN != null) {
                    o2aVar.p((Uri) bundleN.getParcelable(MediaSessionCompat.ACTION_ARGUMENT_URI), vqi.n(bundleN.getBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS)));
                }
            } else if (str.equals(MediaSessionCompat.ACTION_SET_CAPTIONING_ENABLED)) {
                if (bundleN != null) {
                    bundleN.getBoolean(MediaSessionCompat.ACTION_ARGUMENT_CAPTIONING_ENABLED);
                }
            } else if (str.equals(MediaSessionCompat.ACTION_SET_REPEAT_MODE)) {
                if (bundleN != null) {
                    o2aVar.w(bundleN.getInt(MediaSessionCompat.ACTION_ARGUMENT_REPEAT_MODE));
                }
            } else if (str.equals(MediaSessionCompat.ACTION_SET_SHUFFLE_MODE)) {
                if (bundleN != null) {
                    o2aVar.x(bundleN.getInt(MediaSessionCompat.ACTION_ARGUMENT_SHUFFLE_MODE));
                }
            } else if (str.equals(MediaSessionCompat.ACTION_SET_RATING)) {
                if (bundleN != null) {
                    d5e d5eVar = (d5e) tab.h(bundleN.getParcelable(MediaSessionCompat.ACTION_ARGUMENT_RATING), d5e.CREATOR);
                    vqi.n(bundleN.getBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS));
                    o2aVar.v(d5eVar);
                }
            } else if (!str.equals(MediaSessionCompat.ACTION_SET_PLAYBACK_SPEED)) {
                o2aVar.e(str, bundleN);
            } else if (bundleN != null) {
                o2aVar.t(bundleN.getFloat(MediaSessionCompat.ACTION_ARGUMENT_PLAYBACK_SPEED, 1.0f));
            }
        } catch (BadParcelableException unused) {
            lvb.k0("MediaSessionCompat", "Could not unparcel the data.");
        }
        q2aVarA.c(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onFastForward() {
        q2a q2aVarA = a();
        if (q2aVarA == null) {
            return;
        }
        b(q2aVarA);
        this.a.f();
        q2aVarA.c(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final boolean onMediaButtonEvent(Intent intent) {
        q2a q2aVarA = a();
        if (q2aVarA == null) {
            return false;
        }
        b(q2aVarA);
        boolean zG = this.a.g(intent);
        q2aVarA.c(null);
        return zG || super.onMediaButtonEvent(intent);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPause() {
        q2a q2aVarA = a();
        if (q2aVarA == null) {
            return;
        }
        b(q2aVarA);
        this.a.h();
        q2aVarA.c(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlay() {
        q2a q2aVarA = a();
        if (q2aVarA == null) {
            return;
        }
        b(q2aVarA);
        this.a.i();
        q2aVarA.c(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromMediaId(String str, Bundle bundle) {
        q2a q2aVarA = a();
        if (q2aVarA == null) {
            return;
        }
        Bundle bundleN = vqi.n(bundle);
        b(q2aVarA);
        this.a.j(str, bundleN);
        q2aVarA.c(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromSearch(String str, Bundle bundle) {
        q2a q2aVarA = a();
        if (q2aVarA == null) {
            return;
        }
        Bundle bundleN = vqi.n(bundle);
        b(q2aVarA);
        this.a.k(str, bundleN);
        q2aVarA.c(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromUri(Uri uri, Bundle bundle) {
        q2a q2aVarA = a();
        if (q2aVarA == null) {
            return;
        }
        Bundle bundleN = vqi.n(bundle);
        b(q2aVarA);
        this.a.l(uri, bundleN);
        q2aVarA.c(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepare() {
        q2a q2aVarA = a();
        if (q2aVarA == null) {
            return;
        }
        b(q2aVarA);
        this.a.m();
        q2aVarA.c(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromMediaId(String str, Bundle bundle) {
        q2a q2aVarA = a();
        if (q2aVarA == null) {
            return;
        }
        Bundle bundleN = vqi.n(bundle);
        b(q2aVarA);
        this.a.n(str, bundleN);
        q2aVarA.c(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromSearch(String str, Bundle bundle) {
        q2a q2aVarA = a();
        if (q2aVarA == null) {
            return;
        }
        Bundle bundleN = vqi.n(bundle);
        b(q2aVarA);
        this.a.o(str, bundleN);
        q2aVarA.c(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromUri(Uri uri, Bundle bundle) {
        q2a q2aVarA = a();
        if (q2aVarA == null) {
            return;
        }
        Bundle bundleN = vqi.n(bundle);
        b(q2aVarA);
        this.a.p(uri, bundleN);
        q2aVarA.c(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onRewind() {
        q2a q2aVarA = a();
        if (q2aVarA == null) {
            return;
        }
        b(q2aVarA);
        this.a.r();
        q2aVarA.c(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSeekTo(long j) {
        q2a q2aVarA = a();
        if (q2aVarA == null) {
            return;
        }
        b(q2aVarA);
        this.a.s(j);
        q2aVarA.c(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetPlaybackSpeed(float f) {
        q2a q2aVarA = a();
        if (q2aVarA == null) {
            return;
        }
        b(q2aVarA);
        this.a.t(f);
        q2aVarA.c(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetRating(Rating rating) {
        q2a q2aVarA = a();
        if (q2aVarA == null) {
            return;
        }
        b(q2aVarA);
        this.a.u(d5e.a(rating));
        q2aVarA.c(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToNext() {
        q2a q2aVarA = a();
        if (q2aVarA == null) {
            return;
        }
        b(q2aVarA);
        this.a.y();
        q2aVarA.c(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToPrevious() {
        q2a q2aVarA = a();
        if (q2aVarA == null) {
            return;
        }
        b(q2aVarA);
        this.a.z();
        q2aVarA.c(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToQueueItem(long j) {
        q2a q2aVarA = a();
        if (q2aVarA == null) {
            return;
        }
        b(q2aVarA);
        this.a.A(j);
        q2aVarA.c(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onStop() {
        q2a q2aVarA = a();
        if (q2aVarA == null) {
            return;
        }
        b(q2aVarA);
        this.a.B();
        q2aVarA.c(null);
    }
}
