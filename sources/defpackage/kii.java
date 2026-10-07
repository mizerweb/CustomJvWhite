package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.net.URI;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class kii {
    public final u1i a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final ifh m = new ifh(new jii(this, 1));
    public final ifh n = new ifh(new jii(this, 2));
    public final ifh o = new ifh(new jii(this, 3));

    public kii(u1i u1iVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9, ny8 ny8Var10, ny8 ny8Var11) {
        this.a = u1iVar;
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = ny8Var3;
        this.e = ny8Var4;
        this.f = ny8Var5;
        this.g = ny8Var6;
        this.h = ny8Var7;
        this.i = ny8Var8;
        this.j = ny8Var9;
        this.k = ny8Var10;
        this.l = ny8Var11;
    }

    public static final zt6 b(String str, kii kiiVar, wze wzeVar, mt6 mt6Var, lt6 lt6Var) {
        URI uri = new URI(str);
        ny8 ny8Var = kiiVar.d;
        ny8 ny8Var2 = kiiVar.e;
        ifh ifhVar = kiiVar.m;
        ifh ifhVar2 = kiiVar.n;
        ifh ifhVar3 = kiiVar.o;
        u1i u1iVar = kiiVar.a;
        final int i = 0;
        jii jiiVar = new jii(kiiVar, 0);
        final z18 z18Var = new z18();
        z18Var.a = uri;
        z18Var.b = mt6Var;
        z18Var.c = lt6Var;
        z18Var.d = jiiVar;
        z18Var.e = new ifh(new af7() { // from class: y18
            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                z18 z18Var2 = z18Var;
                switch (i2) {
                    case 0:
                        StringBuilder sb = new StringBuilder();
                        URI uri2 = (URI) z18Var2.a;
                        sb.append("POST " + uri2.getRawPath());
                        if (uri2.getRawQuery() != null) {
                            sb.append('?');
                            sb.append(uri2.getRawQuery());
                        }
                        sb.append(" HTTP/1.1\n");
                        sb.append("Host: " + uri2.getHost() + "\n");
                        sb.append("Content-Type: " + ((lt6) z18Var2.c).g + "\n");
                        sb.append("Content-Disposition: attachment; filename=" + ((mt6) z18Var2.b).d + "\n");
                        sb.append("User-Agent: " + ((jii) z18Var2.d).invoke() + "\n");
                        sb.append("Connection: keep-alive\n\n");
                        return sb.toString();
                    case 1:
                        StringBuilder sb2 = new StringBuilder();
                        URI uri3 = (URI) z18Var2.a;
                        mt6 mt6Var2 = (mt6) z18Var2.b;
                        sb2.append("GET " + uri3.getRawPath());
                        if (uri3.getRawQuery() != null) {
                            sb2.append('?');
                            sb2.append(uri3.getRawQuery());
                        }
                        sb2.append(" HTTP/1.1\n");
                        sb2.append("Host: " + uri3.getHost() + "\n");
                        sb2.append("Content-Disposition: attachment; filename=" + mt6Var2.d + "\n");
                        sb2.append("Content-Range: bytes 0-/" + mt6Var2.e + "\n");
                        sb2.append("User-Agent: " + ((jii) z18Var2.d).invoke() + "\n");
                        sb2.append("Connection: keep-alive\n\n");
                        return sb2.toString();
                    case 2:
                        StringBuilder sb3 = new StringBuilder();
                        URI uri4 = (URI) z18Var2.a;
                        lt6 lt6Var2 = (lt6) z18Var2.c;
                        sb3.append("GET " + uri4.getRawPath());
                        if (uri4.getRawQuery() != null) {
                            sb3.append('?');
                            sb3.append(uri4.getRawQuery());
                        }
                        sb3.append(" HTTP/1.1\n");
                        sb3.append("Host: " + uri4.getHost() + "\n");
                        sb3.append("Content-Type: " + lt6Var2.g + "\n");
                        sb3.append("Content-Disposition: attachment; filename=" + ((mt6) z18Var2.b).d + "\n");
                        sb3.append("Content-Length: 0\nConnection: keep-alive\n");
                        if (!lt6Var2.d) {
                            sb3.append("X-Uploading-Mode: parallel\n");
                        }
                        sb3.append('\n');
                        return sb3.toString();
                    case 3:
                        StringBuilder sb4 = new StringBuilder();
                        URI uri5 = (URI) z18Var2.a;
                        sb4.append("POST " + uri5.getRawPath());
                        if (uri5.getRawQuery() != null) {
                            sb4.append('?');
                            sb4.append(uri5.getRawQuery());
                        }
                        sb4.append(" HTTP/1.1\n");
                        sb4.append("Host: " + uri5.getHost() + "\n");
                        sb4.append("Content-Type: " + ((lt6) z18Var2.c).g + "\n");
                        sb4.append("Content-Disposition: attachment; filename=" + ((mt6) z18Var2.b).d + "\n");
                        sb4.append("User-Agent: " + ((jii) z18Var2.d).invoke() + "\n");
                        sb4.append("Connection: keep-alive\n");
                        return sb4.toString();
                    default:
                        StringBuilder sb5 = new StringBuilder();
                        URI uri6 = (URI) z18Var2.a;
                        lt6 lt6Var3 = (lt6) z18Var2.c;
                        sb5.append("POST " + uri6.getRawPath());
                        if (uri6.getRawQuery() != null) {
                            sb5.append('?');
                            sb5.append(uri6.getRawQuery());
                        }
                        sb5.append(" HTTP/1.1\n");
                        sb5.append("Host: " + uri6.getHost() + "\n");
                        sb5.append("Content-Type: " + lt6Var3.g + "\n");
                        sb5.append("Content-Disposition: attachment; filename=" + ((mt6) z18Var2.b).d + "\n");
                        sb5.append("Connection: keep-alive\n");
                        if (!lt6Var3.d) {
                            sb5.append("X-Uploading-Mode: parallel\n");
                        }
                        return sb5.toString();
                }
            }
        });
        final int i2 = 1;
        z18Var.f = new ifh(new af7() { // from class: y18
            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                z18 z18Var2 = z18Var;
                switch (i3) {
                    case 0:
                        StringBuilder sb = new StringBuilder();
                        URI uri2 = (URI) z18Var2.a;
                        sb.append("POST " + uri2.getRawPath());
                        if (uri2.getRawQuery() != null) {
                            sb.append('?');
                            sb.append(uri2.getRawQuery());
                        }
                        sb.append(" HTTP/1.1\n");
                        sb.append("Host: " + uri2.getHost() + "\n");
                        sb.append("Content-Type: " + ((lt6) z18Var2.c).g + "\n");
                        sb.append("Content-Disposition: attachment; filename=" + ((mt6) z18Var2.b).d + "\n");
                        sb.append("User-Agent: " + ((jii) z18Var2.d).invoke() + "\n");
                        sb.append("Connection: keep-alive\n\n");
                        return sb.toString();
                    case 1:
                        StringBuilder sb2 = new StringBuilder();
                        URI uri3 = (URI) z18Var2.a;
                        mt6 mt6Var2 = (mt6) z18Var2.b;
                        sb2.append("GET " + uri3.getRawPath());
                        if (uri3.getRawQuery() != null) {
                            sb2.append('?');
                            sb2.append(uri3.getRawQuery());
                        }
                        sb2.append(" HTTP/1.1\n");
                        sb2.append("Host: " + uri3.getHost() + "\n");
                        sb2.append("Content-Disposition: attachment; filename=" + mt6Var2.d + "\n");
                        sb2.append("Content-Range: bytes 0-/" + mt6Var2.e + "\n");
                        sb2.append("User-Agent: " + ((jii) z18Var2.d).invoke() + "\n");
                        sb2.append("Connection: keep-alive\n\n");
                        return sb2.toString();
                    case 2:
                        StringBuilder sb3 = new StringBuilder();
                        URI uri4 = (URI) z18Var2.a;
                        lt6 lt6Var2 = (lt6) z18Var2.c;
                        sb3.append("GET " + uri4.getRawPath());
                        if (uri4.getRawQuery() != null) {
                            sb3.append('?');
                            sb3.append(uri4.getRawQuery());
                        }
                        sb3.append(" HTTP/1.1\n");
                        sb3.append("Host: " + uri4.getHost() + "\n");
                        sb3.append("Content-Type: " + lt6Var2.g + "\n");
                        sb3.append("Content-Disposition: attachment; filename=" + ((mt6) z18Var2.b).d + "\n");
                        sb3.append("Content-Length: 0\nConnection: keep-alive\n");
                        if (!lt6Var2.d) {
                            sb3.append("X-Uploading-Mode: parallel\n");
                        }
                        sb3.append('\n');
                        return sb3.toString();
                    case 3:
                        StringBuilder sb4 = new StringBuilder();
                        URI uri5 = (URI) z18Var2.a;
                        sb4.append("POST " + uri5.getRawPath());
                        if (uri5.getRawQuery() != null) {
                            sb4.append('?');
                            sb4.append(uri5.getRawQuery());
                        }
                        sb4.append(" HTTP/1.1\n");
                        sb4.append("Host: " + uri5.getHost() + "\n");
                        sb4.append("Content-Type: " + ((lt6) z18Var2.c).g + "\n");
                        sb4.append("Content-Disposition: attachment; filename=" + ((mt6) z18Var2.b).d + "\n");
                        sb4.append("User-Agent: " + ((jii) z18Var2.d).invoke() + "\n");
                        sb4.append("Connection: keep-alive\n");
                        return sb4.toString();
                    default:
                        StringBuilder sb5 = new StringBuilder();
                        URI uri6 = (URI) z18Var2.a;
                        lt6 lt6Var3 = (lt6) z18Var2.c;
                        sb5.append("POST " + uri6.getRawPath());
                        if (uri6.getRawQuery() != null) {
                            sb5.append('?');
                            sb5.append(uri6.getRawQuery());
                        }
                        sb5.append(" HTTP/1.1\n");
                        sb5.append("Host: " + uri6.getHost() + "\n");
                        sb5.append("Content-Type: " + lt6Var3.g + "\n");
                        sb5.append("Content-Disposition: attachment; filename=" + ((mt6) z18Var2.b).d + "\n");
                        sb5.append("Connection: keep-alive\n");
                        if (!lt6Var3.d) {
                            sb5.append("X-Uploading-Mode: parallel\n");
                        }
                        return sb5.toString();
                }
            }
        });
        final int i3 = 2;
        z18Var.g = new ifh(new af7() { // from class: y18
            @Override // defpackage.af7
            public final Object invoke() {
                int i4 = i3;
                z18 z18Var2 = z18Var;
                switch (i4) {
                    case 0:
                        StringBuilder sb = new StringBuilder();
                        URI uri2 = (URI) z18Var2.a;
                        sb.append("POST " + uri2.getRawPath());
                        if (uri2.getRawQuery() != null) {
                            sb.append('?');
                            sb.append(uri2.getRawQuery());
                        }
                        sb.append(" HTTP/1.1\n");
                        sb.append("Host: " + uri2.getHost() + "\n");
                        sb.append("Content-Type: " + ((lt6) z18Var2.c).g + "\n");
                        sb.append("Content-Disposition: attachment; filename=" + ((mt6) z18Var2.b).d + "\n");
                        sb.append("User-Agent: " + ((jii) z18Var2.d).invoke() + "\n");
                        sb.append("Connection: keep-alive\n\n");
                        return sb.toString();
                    case 1:
                        StringBuilder sb2 = new StringBuilder();
                        URI uri3 = (URI) z18Var2.a;
                        mt6 mt6Var2 = (mt6) z18Var2.b;
                        sb2.append("GET " + uri3.getRawPath());
                        if (uri3.getRawQuery() != null) {
                            sb2.append('?');
                            sb2.append(uri3.getRawQuery());
                        }
                        sb2.append(" HTTP/1.1\n");
                        sb2.append("Host: " + uri3.getHost() + "\n");
                        sb2.append("Content-Disposition: attachment; filename=" + mt6Var2.d + "\n");
                        sb2.append("Content-Range: bytes 0-/" + mt6Var2.e + "\n");
                        sb2.append("User-Agent: " + ((jii) z18Var2.d).invoke() + "\n");
                        sb2.append("Connection: keep-alive\n\n");
                        return sb2.toString();
                    case 2:
                        StringBuilder sb3 = new StringBuilder();
                        URI uri4 = (URI) z18Var2.a;
                        lt6 lt6Var2 = (lt6) z18Var2.c;
                        sb3.append("GET " + uri4.getRawPath());
                        if (uri4.getRawQuery() != null) {
                            sb3.append('?');
                            sb3.append(uri4.getRawQuery());
                        }
                        sb3.append(" HTTP/1.1\n");
                        sb3.append("Host: " + uri4.getHost() + "\n");
                        sb3.append("Content-Type: " + lt6Var2.g + "\n");
                        sb3.append("Content-Disposition: attachment; filename=" + ((mt6) z18Var2.b).d + "\n");
                        sb3.append("Content-Length: 0\nConnection: keep-alive\n");
                        if (!lt6Var2.d) {
                            sb3.append("X-Uploading-Mode: parallel\n");
                        }
                        sb3.append('\n');
                        return sb3.toString();
                    case 3:
                        StringBuilder sb4 = new StringBuilder();
                        URI uri5 = (URI) z18Var2.a;
                        sb4.append("POST " + uri5.getRawPath());
                        if (uri5.getRawQuery() != null) {
                            sb4.append('?');
                            sb4.append(uri5.getRawQuery());
                        }
                        sb4.append(" HTTP/1.1\n");
                        sb4.append("Host: " + uri5.getHost() + "\n");
                        sb4.append("Content-Type: " + ((lt6) z18Var2.c).g + "\n");
                        sb4.append("Content-Disposition: attachment; filename=" + ((mt6) z18Var2.b).d + "\n");
                        sb4.append("User-Agent: " + ((jii) z18Var2.d).invoke() + "\n");
                        sb4.append("Connection: keep-alive\n");
                        return sb4.toString();
                    default:
                        StringBuilder sb5 = new StringBuilder();
                        URI uri6 = (URI) z18Var2.a;
                        lt6 lt6Var3 = (lt6) z18Var2.c;
                        sb5.append("POST " + uri6.getRawPath());
                        if (uri6.getRawQuery() != null) {
                            sb5.append('?');
                            sb5.append(uri6.getRawQuery());
                        }
                        sb5.append(" HTTP/1.1\n");
                        sb5.append("Host: " + uri6.getHost() + "\n");
                        sb5.append("Content-Type: " + lt6Var3.g + "\n");
                        sb5.append("Content-Disposition: attachment; filename=" + ((mt6) z18Var2.b).d + "\n");
                        sb5.append("Connection: keep-alive\n");
                        if (!lt6Var3.d) {
                            sb5.append("X-Uploading-Mode: parallel\n");
                        }
                        return sb5.toString();
                }
            }
        });
        final int i4 = 3;
        z18Var.h = new ifh(new af7() { // from class: y18
            @Override // defpackage.af7
            public final Object invoke() {
                int i5 = i4;
                z18 z18Var2 = z18Var;
                switch (i5) {
                    case 0:
                        StringBuilder sb = new StringBuilder();
                        URI uri2 = (URI) z18Var2.a;
                        sb.append("POST " + uri2.getRawPath());
                        if (uri2.getRawQuery() != null) {
                            sb.append('?');
                            sb.append(uri2.getRawQuery());
                        }
                        sb.append(" HTTP/1.1\n");
                        sb.append("Host: " + uri2.getHost() + "\n");
                        sb.append("Content-Type: " + ((lt6) z18Var2.c).g + "\n");
                        sb.append("Content-Disposition: attachment; filename=" + ((mt6) z18Var2.b).d + "\n");
                        sb.append("User-Agent: " + ((jii) z18Var2.d).invoke() + "\n");
                        sb.append("Connection: keep-alive\n\n");
                        return sb.toString();
                    case 1:
                        StringBuilder sb2 = new StringBuilder();
                        URI uri3 = (URI) z18Var2.a;
                        mt6 mt6Var2 = (mt6) z18Var2.b;
                        sb2.append("GET " + uri3.getRawPath());
                        if (uri3.getRawQuery() != null) {
                            sb2.append('?');
                            sb2.append(uri3.getRawQuery());
                        }
                        sb2.append(" HTTP/1.1\n");
                        sb2.append("Host: " + uri3.getHost() + "\n");
                        sb2.append("Content-Disposition: attachment; filename=" + mt6Var2.d + "\n");
                        sb2.append("Content-Range: bytes 0-/" + mt6Var2.e + "\n");
                        sb2.append("User-Agent: " + ((jii) z18Var2.d).invoke() + "\n");
                        sb2.append("Connection: keep-alive\n\n");
                        return sb2.toString();
                    case 2:
                        StringBuilder sb3 = new StringBuilder();
                        URI uri4 = (URI) z18Var2.a;
                        lt6 lt6Var2 = (lt6) z18Var2.c;
                        sb3.append("GET " + uri4.getRawPath());
                        if (uri4.getRawQuery() != null) {
                            sb3.append('?');
                            sb3.append(uri4.getRawQuery());
                        }
                        sb3.append(" HTTP/1.1\n");
                        sb3.append("Host: " + uri4.getHost() + "\n");
                        sb3.append("Content-Type: " + lt6Var2.g + "\n");
                        sb3.append("Content-Disposition: attachment; filename=" + ((mt6) z18Var2.b).d + "\n");
                        sb3.append("Content-Length: 0\nConnection: keep-alive\n");
                        if (!lt6Var2.d) {
                            sb3.append("X-Uploading-Mode: parallel\n");
                        }
                        sb3.append('\n');
                        return sb3.toString();
                    case 3:
                        StringBuilder sb4 = new StringBuilder();
                        URI uri5 = (URI) z18Var2.a;
                        sb4.append("POST " + uri5.getRawPath());
                        if (uri5.getRawQuery() != null) {
                            sb4.append('?');
                            sb4.append(uri5.getRawQuery());
                        }
                        sb4.append(" HTTP/1.1\n");
                        sb4.append("Host: " + uri5.getHost() + "\n");
                        sb4.append("Content-Type: " + ((lt6) z18Var2.c).g + "\n");
                        sb4.append("Content-Disposition: attachment; filename=" + ((mt6) z18Var2.b).d + "\n");
                        sb4.append("User-Agent: " + ((jii) z18Var2.d).invoke() + "\n");
                        sb4.append("Connection: keep-alive\n");
                        return sb4.toString();
                    default:
                        StringBuilder sb5 = new StringBuilder();
                        URI uri6 = (URI) z18Var2.a;
                        lt6 lt6Var3 = (lt6) z18Var2.c;
                        sb5.append("POST " + uri6.getRawPath());
                        if (uri6.getRawQuery() != null) {
                            sb5.append('?');
                            sb5.append(uri6.getRawQuery());
                        }
                        sb5.append(" HTTP/1.1\n");
                        sb5.append("Host: " + uri6.getHost() + "\n");
                        sb5.append("Content-Type: " + lt6Var3.g + "\n");
                        sb5.append("Content-Disposition: attachment; filename=" + ((mt6) z18Var2.b).d + "\n");
                        sb5.append("Connection: keep-alive\n");
                        if (!lt6Var3.d) {
                            sb5.append("X-Uploading-Mode: parallel\n");
                        }
                        return sb5.toString();
                }
            }
        });
        final int i5 = 4;
        z18Var.i = new ifh(new af7() { // from class: y18
            @Override // defpackage.af7
            public final Object invoke() {
                int i6 = i5;
                z18 z18Var2 = z18Var;
                switch (i6) {
                    case 0:
                        StringBuilder sb = new StringBuilder();
                        URI uri2 = (URI) z18Var2.a;
                        sb.append("POST " + uri2.getRawPath());
                        if (uri2.getRawQuery() != null) {
                            sb.append('?');
                            sb.append(uri2.getRawQuery());
                        }
                        sb.append(" HTTP/1.1\n");
                        sb.append("Host: " + uri2.getHost() + "\n");
                        sb.append("Content-Type: " + ((lt6) z18Var2.c).g + "\n");
                        sb.append("Content-Disposition: attachment; filename=" + ((mt6) z18Var2.b).d + "\n");
                        sb.append("User-Agent: " + ((jii) z18Var2.d).invoke() + "\n");
                        sb.append("Connection: keep-alive\n\n");
                        return sb.toString();
                    case 1:
                        StringBuilder sb2 = new StringBuilder();
                        URI uri3 = (URI) z18Var2.a;
                        mt6 mt6Var2 = (mt6) z18Var2.b;
                        sb2.append("GET " + uri3.getRawPath());
                        if (uri3.getRawQuery() != null) {
                            sb2.append('?');
                            sb2.append(uri3.getRawQuery());
                        }
                        sb2.append(" HTTP/1.1\n");
                        sb2.append("Host: " + uri3.getHost() + "\n");
                        sb2.append("Content-Disposition: attachment; filename=" + mt6Var2.d + "\n");
                        sb2.append("Content-Range: bytes 0-/" + mt6Var2.e + "\n");
                        sb2.append("User-Agent: " + ((jii) z18Var2.d).invoke() + "\n");
                        sb2.append("Connection: keep-alive\n\n");
                        return sb2.toString();
                    case 2:
                        StringBuilder sb3 = new StringBuilder();
                        URI uri4 = (URI) z18Var2.a;
                        lt6 lt6Var2 = (lt6) z18Var2.c;
                        sb3.append("GET " + uri4.getRawPath());
                        if (uri4.getRawQuery() != null) {
                            sb3.append('?');
                            sb3.append(uri4.getRawQuery());
                        }
                        sb3.append(" HTTP/1.1\n");
                        sb3.append("Host: " + uri4.getHost() + "\n");
                        sb3.append("Content-Type: " + lt6Var2.g + "\n");
                        sb3.append("Content-Disposition: attachment; filename=" + ((mt6) z18Var2.b).d + "\n");
                        sb3.append("Content-Length: 0\nConnection: keep-alive\n");
                        if (!lt6Var2.d) {
                            sb3.append("X-Uploading-Mode: parallel\n");
                        }
                        sb3.append('\n');
                        return sb3.toString();
                    case 3:
                        StringBuilder sb4 = new StringBuilder();
                        URI uri5 = (URI) z18Var2.a;
                        sb4.append("POST " + uri5.getRawPath());
                        if (uri5.getRawQuery() != null) {
                            sb4.append('?');
                            sb4.append(uri5.getRawQuery());
                        }
                        sb4.append(" HTTP/1.1\n");
                        sb4.append("Host: " + uri5.getHost() + "\n");
                        sb4.append("Content-Type: " + ((lt6) z18Var2.c).g + "\n");
                        sb4.append("Content-Disposition: attachment; filename=" + ((mt6) z18Var2.b).d + "\n");
                        sb4.append("User-Agent: " + ((jii) z18Var2.d).invoke() + "\n");
                        sb4.append("Connection: keep-alive\n");
                        return sb4.toString();
                    default:
                        StringBuilder sb5 = new StringBuilder();
                        URI uri6 = (URI) z18Var2.a;
                        lt6 lt6Var3 = (lt6) z18Var2.c;
                        sb5.append("POST " + uri6.getRawPath());
                        if (uri6.getRawQuery() != null) {
                            sb5.append('?');
                            sb5.append(uri6.getRawQuery());
                        }
                        sb5.append(" HTTP/1.1\n");
                        sb5.append("Host: " + uri6.getHost() + "\n");
                        sb5.append("Content-Type: " + lt6Var3.g + "\n");
                        sb5.append("Content-Disposition: attachment; filename=" + ((mt6) z18Var2.b).d + "\n");
                        sb5.append("Connection: keep-alive\n");
                        if (!lt6Var3.d) {
                            sb5.append("X-Uploading-Mode: parallel\n");
                        }
                        return sb5.toString();
                }
            }
        });
        return new zt6(ny8Var, ny8Var2, ifhVar, ifhVar2, ifhVar3, kiiVar.k, uri, u1iVar, wzeVar, mt6Var, lt6Var, z18Var);
    }

    public final iii a(String str, boolean z, String str2, String str3, String str4, int i, oji ojiVar, aji ajiVar, wze wzeVar) {
        int i2;
        uji ujiVar;
        lt6 lt6Var;
        int i3;
        int i4;
        wo6 wo6Var = (wo6) this.g.getValue();
        e5d e5dVar = (e5d) this.f.getValue();
        int iD = qt4.D(i);
        ny8 ny8Var = this.l;
        dii diiVar = dii.b;
        dii diiVar2 = dii.a;
        switch (iD) {
            case 0:
            case 4:
            case 5:
                return b(str2, this, wzeVar, new mt6(i, str3, str4), new lt6(i, diiVar2, 1, true, BuildConfig.MAX_TIME_TO_UPLOAD, z));
            case 1:
                if (ajiVar == null || (i2 = ajiVar.a) == 0) {
                    i2 = 1;
                }
                int iD2 = qt4.D(i2);
                if (iD2 == 0 || iD2 == 1) {
                    return ((cfc) e5dVar.m().i()).c > 0 ? new zec(str3, this.i, this.j, this.h, str2, ((wji) ny8Var.getValue()).a, str4, this.a, wzeVar, 1, ojiVar, i, str) : b(str2, this, wzeVar, new mt6(i, str3, str4), new lt6(i, diiVar, 1, false, BuildConfig.MAX_TIME_TO_UPLOAD, z));
                }
                if (iD2 == 2) {
                    return b(str2, this, wzeVar, new mt6(i, str3, str4), new lt6(i, diiVar2, 1, true, BuildConfig.MAX_TIME_TO_UPLOAD, z));
                }
                ore.o();
                return null;
            case 2:
                f5d f5dVar = (f5d) wo6Var;
                boolean z2 = f5dVar.l().a;
                long j = PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID;
                int i5 = 10;
                u1i u1iVar = this.a;
                if (!z2) {
                    if (((cfc) e5dVar.m().i()).a > 0) {
                        return new zec(str3, this.i, this.j, this.h, str2, ((wji) ny8Var.getValue()).a, str4, this.a, wzeVar, ((cfc) e5dVar.m().i()).b, ojiVar, i, str);
                    }
                    mt6 mt6Var = new mt6(i, str3, str4);
                    we4 we4VarB = u1iVar.b();
                    int[] iArr = jd4.$EnumSwitchMapping$0;
                    int i6 = iArr[we4VarB.ordinal()];
                    if (i6 != 1 && i6 != 2) {
                        i5 = 7;
                    }
                    int i7 = iArr[we4VarB.ordinal()];
                    if (i7 == 1 || i7 == 2) {
                        j = PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE;
                    } else if (i7 != 3) {
                        j = 16384;
                    }
                    return b(str2, this, wzeVar, mt6Var, new lt6(i, diiVar, i5, false, j, z));
                }
                we4 we4VarB2 = u1iVar.b();
                int iOrdinal = we4VarB2.ordinal();
                if (iOrdinal != 1) {
                    ujiVar = iOrdinal != 4 ? f5dVar.l().d : f5dVar.l().c;
                } else {
                    ujiVar = f5dVar.l().b;
                }
                if (ujiVar.a) {
                    lt6Var = new lt6(i, diiVar, ujiVar.b, ujiVar.c, ujiVar.d, z);
                    i3 = i;
                } else {
                    int[] iArr2 = jd4.$EnumSwitchMapping$0;
                    int i8 = iArr2[we4VarB2.ordinal()];
                    if (i8 != 1 && i8 != 2) {
                        i5 = 7;
                    }
                    int i9 = iArr2[we4VarB2.ordinal()];
                    if (i9 == 1 || i9 == 2) {
                        j = PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE;
                    } else if (i9 != 3) {
                        j = 16384;
                    }
                    lt6Var = new lt6(i, diiVar, i5, false, j, z);
                    i3 = i;
                }
                return b(str2, this, wzeVar, new mt6(i3, str3, str4), lt6Var);
            case 3:
                if (ajiVar == null || (i4 = ajiVar.a) == 0) {
                    i4 = 1;
                }
                int iD3 = qt4.D(i4);
                if (iD3 == 0 || iD3 == 1) {
                    return a(str, z, str2, str3, str4, 3, ojiVar, ajiVar, wzeVar);
                }
                if (iD3 == 2) {
                    return b(str2, this, wzeVar, new mt6(i, str3, str4), new lt6(i, diiVar2, 1, true, BuildConfig.MAX_TIME_TO_UPLOAD, z));
                }
                ore.o();
                return null;
            case 6:
                return b(str2, this, wzeVar, new mt6(i, str3, str4), new lt6(i, diiVar2, 1, true, BuildConfig.MAX_TIME_TO_UPLOAD, z));
            default:
                ore.o();
                return null;
        }
    }
}
