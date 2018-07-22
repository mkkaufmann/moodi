package com.example.administrator.feelings;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Random rng = new Random();
    Boolean explicit = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

    }
    private boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager
                = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo;
        try {
            activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        }catch(NullPointerException e) {
            Log.d("ERROR","null pointer i guess");
        }
        return false;
    }
    public void randomButtonPress(View v){
        if (isNetworkAvailable()){
            switch(rng.nextInt(6)){
                case (0):
                    angryButtonPress(v);
                    break;
                case (1):
                    happyButtonPress(v);
                    break;
                case (2):
                    sadButtonPress(v);
                    break;
                case (3):
                    disgustedButtonPress(v);
                    break;
                case (4):
                    fearfulButtonPress(v);
                    break;
                case (5):
                    String[] links;
                    String url;
                    if (explicit) {
                        links = new String[]{"https://media.discordapp.net/attachments/364794799741730816/463922098918785027/unknown.png","https://www.memedroid.com/memes/detail/2214342/sorry-Im-G-A-Y","https://www.youtube.com/watch?v=vdhF4O54YjU","https://www.youtube.com/watch?v=MYpnINrZM_M","https://www.youtube.com/watch?v=MYpnINrZM_M","http://www.peopleofwalmart.com/","http://mylifeisaverage.com/","http://www.passiveaggressivenotes.com/","http://www.fmylife.com/","https://www.youtube.com/watch?v=2oBPK_iqBZc","http://www.textsfromlastnight.com/","https://www.google.com/search?rlz=1C1GGRV_enUS806US806&biw=1366&bih=662&tbm=isch&sa=1&ei=Gj5UW9rqM-bTjwSF_axo&q=what+is+life+meme&oq=what+is+life+meme&gs_l=img.3..0j0i8i30k1l4.4265.5318.0.5862.5.5.0.0.0.0.70.286.5.5.0....0...1c.1.64.img..0.5.286...0i67k1j0i30k1j0i24k1.0.1paPlOTZdKw#imgrc=QUf_ZfR_15ScyM","https://www.boredpanda.com/?utm_source=direct&utm_medium=link&utm_campaign=direct","https://www.brainpickings.org/","https://www.cheezburger.com","https://www.google.com/search?q=mine+mine+mine+meme&hl=en&rlz=1C1GGRV_enUS806US806&tbm=isch&tbo=u&source=univ&sa=X&sqi=2&ved=2ahUKEwiVrYLfo7LcAhXr6oMKHQqZDQwQsAR6BAgEEAE&biw=1366&bih=662","https://www.google.com/search?q=mine+mine+mine+meme&hl=en&rlz=1C1GGRV_enUS806US806&tbm=isch&tbo=u&source=univ&sa=X&sqi=2&ved=2ahUKEwiVrYLfo7LcAhXr6oMKHQqZDQwQsAR6BAgEEAE&biw=1366&bih=662#imgrc=XlIegTNz9ziFmM","https://www.youtube.com/watch?v=gyv0RWmEomk","https://www.google.com/search?q=mine+mine+mine+meme&hl=en&rlz=1C1GGRV_enUS806US806&tbm=isch&tbo=u&source=univ&sa=X&sqi=2&ved=2ahUKEwiVrYLfo7LcAhXr6oMKHQqZDQwQsAR6BAgEEAE&biw=1366&bih=662#imgrc=IHQiT2Zp5ZaAxM","https://www.google.com/search?q=mine+mine+mine+meme&hl=en&rlz=1C1GGRV_enUS806US806&tbm=isch&tbo=u&source=univ&sa=X&sqi=2&ved=2ahUKEwiVrYLfo7LcAhXr6oMKHQqZDQwQsAR6BAgEEAE&biw=1366&bih=662#imgrc=UmxRO0VUfsY5xM","https://www.google.com/search?hl=en&rlz=1C1GGRV_enUS806US806&biw=1366&bih=662&tbm=isch&sa=1&ei=2z5UW7WvCOmwjwTg_pqIDQ&q=random+crap&oq=random+crap&gs_l=img.3..0l5j0i30k1l3j0i5i30k1j0i24k1.273533.282314.0.282674.17.13.3.1.2.0.256.784.12j0j1.13.0....0...1c.1.64.img..0.17.793...35i39k1j0i67k1j0i10k1j0i10i30k1j0i10i24k1.0.drn7GcpITFo#imgrc=b8CuGZdFM4hkFM","https://www.google.com/search?hl=en&rlz=1C1GGRV_enUS806US806&biw=1366&bih=662&tbm=isch&sa=1&ei=2z5UW7WvCOmwjwTg_pqIDQ&q=random+crap&oq=random+crap&gs_l=img.3..0l5j0i30k1l3j0i5i30k1j0i24k1.273533.282314.0.282674.17.13.3.1.2.0.256.784.12j0j1.13.0....0...1c.1.64.img..0.17.793...35i39k1j0i67k1j0i10k1j0i10i30k1j0i10i24k1.0.drn7GcpITFo#imgrc=V6se5JuSXB6PwM","https://www.youtube.com/watch?v=MX0Uwtru560","https://www.youtube.com/watch?v=VP7CR5XpywE","http://www.fanpop.com/clubs/the-no-life-club/answers/show/303596/doing-random-crap","https://www.youtube.com/watch?v=GLlLQ3LmZWU"};
                    } else {
                        links = new String[]{"https://www.google.com/"};
                    }
                    url = links[rng.nextInt(links.length)];
                    runURL(url);
                    break;
            }
        }
    }
    public void angryButtonPress(View v) {
        if (isNetworkAvailable()) {
            String url = "";
            int bound = 5;
            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                //permission denied
                bound = 4;//location will not be picked
            }

            Log.d("url[", url);
            int category = rng.nextInt(bound);
            Log.d("cat", String.valueOf(category));

            switch (category) {
                case (0)://music
                    String[] music;
                    if (explicit) {
                        music = new String[]{"https://www.youtube.com/watch?v=XblV5A1PlDo","https://www.youtube.com/watch?v=x-64CaD8GXw","https://www.youtube.com/watch?v=x-64CaD8GXw","https://www.youtube.com/watch?v=AkFqg5wAuFk","https://www.youtube.com/watch?v=AkFqg5wAuFk","https://www.youtube.com/watch?v=XE4BxPwu4zI","https://www.youtube.com/watch?v=ytQ5CYE1VZw","https://www.youtube.com/watch?v=Jm932Sqwf5E","https://www.youtube.com/watch?v=5zIH9m7Y0MA","https://www.youtube.com/watch?v=KTuzXdlStMk","https://www.youtube.com/watch?v=9LF7ScsZhoY","https://www.youtube.com/watch?v=TPSenKymLwk","https://www.youtube.com/watch?v=cKVBtXZRzpk","https://www.youtube.com/watch?v=9GUWqs3Ozto","https://www.youtube.com/watch?v=5abamRO41fE","https://www.youtube.com/watch?v=L-iepu3EtyE","https://www.youtube.com/watch?v=zUzd9KyIDrM","https://www.youtube.com/watch?v=MH9FyLsfDzw"};
                    } else {
                        music = new String[]{"https://www.youtube.com/watch?v=MH9FyLsfDzw"};
                    }
                    url = music[rng.nextInt(music.length)];
                    break;
                case (1)://websites
                    String[] websites;
                    if (explicit) {
                        websites = new String[]{"https://www.tumblr.com/","https://www.reddit.com/"};
                    } else {
                        websites = new String[]{"https://store.steampowered.com/app/240720/Getting_Over_It_with_Bennett_Foddy/"};
                    }
                    url = websites[rng.nextInt(websites.length)];
                    break;
                case (2)://games
                    String[] games;
                    if (explicit) {
                        games = new String[]{"https://store.steampowered.com/app/374320/DARK_SOULS_III/", "https://store.steampowered.com/app/377160/Fallout_4/","https://store.steampowered.com/app/379720/DOOM/","https://store.steampowered.com/app/730/CounterStrike_Global_Offensive/","https://store.steampowered.com/app/578080/PLAYERUNKNOWNS_BATTLEGROUNDS/","https://store.steampowered.com/app/240720/Getting_Over_It_with_Bennett_Foddy/"};
                    } else {
                        games = new String[]{"https://store.steampowered.com/app/240720/Getting_Over_It_with_Bennett_Foddy/"};
                    }
                    url = games[rng.nextInt(games.length)];
                    break;
                case (3)://movies
                    String[] movies;
                    if (explicit) {
                        movies = new String[]{"https://www.google.com/search?q=The Punisher","https://www.google.com/search?q=The Twilight Zone"};
                    } else {
                        movies = new String[]{"https://store.steampowered.com/app/240720/Getting_Over_It_with_Bennett_Foddy/"};
                    }
                    url = movies[rng.nextInt(movies.length)];
                    break;
                case (4)://places
                    String[] places;
                    if (explicit) {
                        places = new String[]{"https://www.google.com/maps/search/gym+near+me/","https://www.google.com/maps/search/bar+near+me/","https://www.google.com/maps/search/paintball+near+me/","https://www.google.com/maps/search/laser+tag+near+me/"};
                    } else {
                        places = new String[]{"https://www.google.com/maps/search/gym+near+me/","https://www.google.com/maps/search/bar+near+me/","https://www.google.com/maps/search/paintball+near+me/","https://www.google.com/maps/search/laser+tag+near+me/"};
                    }
                    url = places[rng.nextInt(places.length)];
                    break;
            }
            runURL(url);
        }
    }
    public void happyButtonPress(View v) {
        if (isNetworkAvailable()) {
            String url = "";
            int bound = 5;
            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                //permission denied
                bound = 4;//location will not be picked
            }

            Log.d("url[", url);
            int category = rng.nextInt(bound);
            Log.d("cat", String.valueOf(category));

            switch (category) {
                case (0)://music
                    String[] music;
                    if (explicit) {
                        music = new String[]{"https://www.youtube.com/watch?v=k7LvjhASLIg", "https://www.youtube.com/watch?v=y6Sxv-sUYtM", "https://www.youtube.com/watch?v=DC_TrsY7U3A", "http://24hoursofhappy.com/", "https://www.youtube.com/watch?v=eT3BFzSD6YY", "https://www.youtube.com/watch?v=V-_O7nl0Ii0", "https://www.youtube.com/watch?v=XbGs_qK2PQA", "https://www.youtube.com/watch?v=13wd8KvOt58", "https://www.youtube.com/watch?v=N9qYF9DZPdw", "https://www.youtube.com/watch?v=ScNNfyq3d_w", "https://www.youtube.com/watch?v=h4UqMyldS7Q", "https://www.youtube.com/watch?v=ozbnTScWups", "https://www.youtube.com/watch?v=GYFJjwXtsU4", "https://www.youtube.com/watch?v=8LFWYsUtfV0", "https://www.youtube.com/watch?v=nw1_rUNHR3Q", "https://www.youtube.com/watch?v=wfXupu60v-Q", "https://www.youtube.com/watch?v=ZI8tFthAZ5M", "https://www.youtube.com/watch?v=HCDxY1AO9OE"};
                    } else {
                        music = new String[]{"https://www.google.com/"};
                    }
                    url = music[rng.nextInt(music.length)];
                    break;
                case (1)://websites
                    String[] websites;
                    if (explicit) {
                        websites = new String[]{"https://www.youtube.com/user/PewDiePie","https://www.youtube.com/channel/UCNh0n1JrLYL4kReyplDzFfA","http://www.damnyouautocorrect.com/","https://overheardinnewyork.com/","https://www.youtube.com/user/Vsauce","https://www.youtube.com/channel/UCU_W0oE_ock8bWKjALiGs8Q","https://www.youtube.com/channel/UCtb8P4rf_1n8KS8eZk_lNNw","https://www.youtube.com/channel/UCMdGPato0IC5-zZjJIf-P9w" ,"http://www.picturesofwalls.com/","https://awkwardfamilyphotos.com/","https://www.youtube.com/user/numberphile","https://www.youtube.com/channel/UCNqRS1gSJFMNPVwye1gyI_g","http://theoatmeal.com/","https://www.youtube.com/user/rhettandlink2","http://bit.ly/AsherPYRE","https://awkwardfamilyphotos.com/","http://www.collegehumor.com/"};
                    } else {
                        websites = new String[]{"https://www.google.com/"};
                    }
                    url = websites[rng.nextInt(websites.length)];
                    break;
                case (2)://games
                    String[] games;
                    if (explicit) {
                        games = new String[]{"orteil.dashnet.org/cookieclicker/", "https://play.google.com/store/apps/details?id=com.supercell.clashofclans", "https://play.google.com/store/apps/details?id=com.tencent.ig", "https://play.google.com/store/apps/details?id=sixpack.sixpackabs.absworkout", "https://play.google.com/store/apps/details?id=com.balysv.loop", "https://play.google.com/store/apps/details?id=com.rockbite.deeptown", "https://play.google.com/store/apps/details?id=com.lima.doodlejump", "https://play.google.com/store/apps/details?id=com.ChillyRoom.DungeonShooter", "https://play.google.com/store/apps/details?id=com.ninjakiwi.bloonstd6", "https://play.google.com/store/apps/details?id=com.ubisoft.hungrysharkworld", "https://play.google.com/store/apps/details?id=com.dimchi.crush", "https://play.google.com/store/apps/details?id=com.kongregate.mobile.burritobison3.google", "https://play.google.com/store/apps/details?id=com.tinder","https://play.google.com/store/apps/details?id=com.ea.game.pvzfree_row","https://play.google.com/store/apps/details?id=com.lima.doodlejump&hl=en_US","https://play.google.com/store/apps/details?id=com.netflix.mediaclient","https://www.crossyroad.com/","https://play.google.com/store/apps/details?id=com.spotify.music"};
                    }else{
                            games = new String[]{"https://www.google.com/"};
                    }
                    url = games[rng.nextInt(games.length)];
                    break;
                case(3)://movies
                            String[] movies;
                            if (explicit) {
                                movies = new String[]{"https://www.google.com/search?q=Deadpool 2", "https://www.google.com/search?q=Guardians of the Galaxy", "https://www.google.com/search?q=Bill Burr Comedy Special", "https://www.google.com/search?q=The Croods", " https://www.google.com/search?q=Planet Earth", "https://www.google.com/search?q=The office", " https://www.google.com/search?q=Ironman", "https://www.google.com/search?q=Avengers", "https://www.google.com/search?q=Skyscraper", "https://www.google.com/search?q=Annihilation", "https://www.google.com/search?q=Deadpool", "https://www.google.com/search?q=ready player one", "https://www.google.com/search?q=Friends", "https://www.google.com/search?q=Red Sparrow", "https://www.google.com/search?q=Black Panther", "https://www.google.com/search?q=Christopher Robin 2018",
                                };
                            } else {
                                movies = new String[]{"https://www.google.com/"};
                            }
                            url = movies[rng.nextInt(movies.length)];
                            break;
                        case (4)://places
                            String[] places;
                            if (explicit) {
                                places = new String[]{"https://www.google.com/maps/search/zoo+near+me/","https://www.google.com/maps/search/museum+near+me/","https://www.google.com/maps/search/beach+near+me/","https://www.google.com/maps/search/park+near+me/"};
                            } else {
                                places = new String[]{"https://www.google.com/maps/search/zoo+near+me/","https://www.google.com/maps/search/museum+near+me/","https://www.google.com/maps/search/beach+near+me/","https://www.google.com/maps/search/park+near+me/"};
                            }
                            url = places[rng.nextInt(places.length)];
                            break;
                    }
                    runURL(url);
            }
        }

    public void fearfulButtonPress(View v) {
        if(isNetworkAvailable()) {
            String url = "";
            int bound = 5;
            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                //permission denied
                bound = 4;//location will not be picked
            }

            Log.d("url[", url);
            int category = rng.nextInt(bound);
            Log.d("cat", String.valueOf(category));

            switch (category) {
                case (0)://music
                    String[] music;
                    if (explicit) {
                        music = new String[]{"https://www.youtube.com/watch?v=ZXhuso4OTG4","https://www.youtube.com/watch?v=jiwuQ6UHMQg","https://www.youtube.com/watch?v=CWz7zABB3nQ","https://www.youtube.com/watch?v=mWRsgZuwf_8","https://www.youtube.com/watch?v=JDG2m5hN1vo","https://www.youtube.com/watch?v=ClQcUyhoxTg","https://www.youtube.com/watch?v=MN3x-kAbgFU","Barbie Girl","https://www.youtube.com/watch?v=DbwIl59U-jM","https://www.youtube.com/watch?v=FTQbiNvZqaY"};
                    } else {
                            music = new String[]{""};
                        }
                        url = music[rng.nextInt(music.length)];
                        break;
                        case (1)://websites
                            String[] websites;
                            if (explicit) {
                                websites = new String[]{"http://deathdate.info/", "https://www.youtube.com/watch?v=2CQcFkOBYHg","www.screenprank.com/","https://help.ea.com/en-us/help/the-sims/the-sims-4/the-sims-4-updates/","https://www.youtube.com/watch?v=ZT28jvTU4Ms","https://www.youtube.com/watch?v=x8DJga1MIwA","https://www.youtube.com/watch?v=Nr243dc1_6U","https://www.youtube.com/watch?v=BLKV6L0sCGk","https://www.youtube.com/watch?v=1Ds9fVKCEs0","https://www.youtube.com/watch?v=hpqlSUUi6Gc","https://www.youtube.com/watch?v=fVtkAGJvNu8","https://www.youtube.com/watch?v=_3ZY3T8gE8s"};
                    } else {
                                    websites = new String[]{"https://www.google.com/"};
                                }
                                url = websites[rng.nextInt(websites.length)];
                                break;
                                case (2)://games
                                    String[] games;
                                    if (explicit) {
                                        games = new String[]{"https://store.steampowered.com/app/238320/Outlast/","https://store.steampowered.com/app/871720/Ultimate_Custom_Night/","https://store.steampowered.com/app/322500/SUPERHOT/","https://store.steampowered.com/app/48000/LIMBO/","https://store.steampowered.com/app/268050/The_Evil_Within/","https://store.steampowered.com/app/221100/DayZ/","https://store.steampowered.com/app/381210/agecheck","https://store.steampowered.com/app/251570/7_Days_to_Die/","https://www.playstation.com/en-us/games/until-dawn-ps4/","https://store.steampowered.com/app/550/Left_4_Dead_2/","https://store.steampowered.com/app/57300/Amnesia_The_Dark_Descent/","https://store.steampowered.com/app/242760/The_Forest/"};
                    } else {
                                            games = new String[]{"https://www.google.com/"};
                                        }
                                        url = games[rng.nextInt(games.length)];
                                        break;
                                        case (3)://movies
                                            String[] movies;
                                            if (explicit) {
                                                movies = new String[]{"https://www.google.com/search?q=Saw","https://www.google.com/search?q=A quiet place","https://www.google.com/search?q=The Ring","https://www.google.com/search?q=Stranger Things","https://www.google.com/search?q=Nightmare on Elm Street","https://www.google.com/search?q=Split","https://www.google.com/search?q=IT","https://www.google.com/search?q=Sherlock","https://www.google.com/search?q=Agents of SHIELD","https://www.google.com/search?q=Naruto","https://www.google.com/search?q=The conjuring","https://www.google.com/search?q=Death Note"};
                    } else {
                                                    movies = new String[]{"https://www.google.com/"};
                                                }
                                                url = movies[rng.nextInt(movies.length)];
                                                break;
                                                case (4)://places
                                                    String[] places;
                                                    if (explicit) {
                                                        places = new String[]{"https://www.google.com/maps/search/haunted+house+near+me/","https://www.google.com/maps/search/work/"};
                                                    } else {
                                                        places = new String[]{"https://www.google.com/maps/search/haunted+house+near+me/","https://www.google.com/maps/search/work/"};                            }
                                                    url = places[rng.nextInt(places.length)];
                                                    break;
                                            }
                                            runURL(url);
                                    }
                            }

    public void disgustedButtonPress(View v) {
        if(isNetworkAvailable()) {
            String url = "";
            int bound = 5;
            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                //permission denied
                bound = 4;//location will not be picked
            }

            Log.d("url[", url);
            int category = rng.nextInt(bound);
            Log.d("cat", String.valueOf(category));

            switch (category) {
                case (0)://music
                    String[] music;
                    if (explicit) {
                        music = new String[]{"https://www.youtube.com/watch?v=FTQbiNvZqaY","https://www.youtube.com/watch?v=ZyhrYis509A","https://www.youtube.com/watch?v=ZyhrYis509A",};
                    } else {
                        music = new String[]{"https://www.google.com/"};
                    }
                    url = music[rng.nextInt(music.length)];
                    break;
                case (1)://websites
                    String[] websites;
                    if (explicit) {
                        websites = new String[]{"https://www.reddit.com/r/FiftyFifty/ ","https://www.reddit.com/r/trypophobia/ ","https://www.youtube.com/channel/UC4USoIAL9qcsx5nCZV_QRnA ",};
                    } else {
                        websites = new String[]{"https://www.google.com/"};
                    }
                    url = websites[rng.nextInt(websites.length)];
                    break;
                case (2)://games
                    String[] games;
                    if (explicit) {
                        games = new String[]{"https://store.steampowered.com/app/418370/RESIDENT_EVIL_7_biohazard__BIOHAZARD_7_resident_evil/","https://store.steampowered.com/app/238320/Outlast/","https://store.steampowered.com/app/47890/The_Sims_3/ ","https://store.steampowered.com/app/582160/Assassins_Creed_Origins/"};
                    } else {
                            games = new String[]{"https://www.google.com/"};
                        }
                        url = games[rng.nextInt(games.length)];
                        break;
                        case (3)://movies
                            String[] movies;
                            if (explicit) {
                                movies = new String[]{"https://www.google.com/search?q=Thor the Dark world","https://www.google.com/search?q=The justice League","https://www.google.com/search?q=Batman v superman","Fifty Shades Darker","Geostorm","https://www.google.com/search?q=The emoji movie","https://www.google.com/search?q=Shrek",};
                            } else {
                                movies = new String[]{"https://www.google.com/"};
                            }
                            url = movies[rng.nextInt(movies.length)];
                            break;
                        case (4)://places
                            String[] places;
                            if (explicit) {
                                places = new String[]{"https://www.google.com/maps/search/butcher+shop+near+me/","https://www.google.com/maps/search/landfill+near+me/"};
                            } else {
                                places = new String[]{"https://www.google.com/maps/search/butcher+shop+near+me/","https://www.google.com/maps/search/landfill+near+me/"};                            }
                            url = places[rng.nextInt(places.length)];
                            break;
                    }
                    runURL(url);
            }
        }
    public void sadButtonPress(View v) {
        if(isNetworkAvailable()) {
            String url = "";
            int bound = 5;
            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                //permission denied
                bound = 4;//location will not be picked
            }

            Log.d("url[", url);
            int category = rng.nextInt(bound);
            Log.d("cat", String.valueOf(category));

            switch (category) {
                case (0)://music
                    String[] music;
                    if (explicit) {
                        music = new String[]{"https://www.youtube.com/watch?v=Aztiwn17vpE","https://www.youtube.com/watch?v=FTQbiNvZqaY","https://www.youtube.com/watch?v=UAsTlnjvetI","https://www.youtube.com/watch?v=JW3_okyWWsY","https://www.youtube.com/watch?v=u9Dg-g7t2l4","https://www.youtube.com/watch?v=Kb24RrHIbFk","https://www.youtube.com/watch?v=FywSzjRq0e4","https://www.youtube.com/watch?v=Soa3gO7tL-c","https://www.youtube.com/watch?v=o11LvhD2Gjg","https://www.youtube.com/watch?v=CPY9pQVzx9s","https://www.youtube.com/watch?v=r00yUkLDJsw"};
                    } else {
                        music = new String[]{"https://www.google.com/"};
                    }
                    url = music[rng.nextInt(music.length)];
                    break;
                case (1)://websites
                    String[] websites;
                    if (explicit) {
                        websites = new String[]{"http://stars.chromeexperiments.com/","http://www.ferryhalim.com/orisinal/g3/casanova.htm","http://www.barcinski-jeanjean.com/entries/line3d/","http://www.recommendmeabook.com/","http://www.lookingatsomething.com/","http://weavesilk.com/","https://sciencevsmagic.net/castles/","http://wxs.ca/iso/","https://armorgames.com/play/1623/music-catch","http://cabbi.bo/light/","https://asoftmurmur.com/"};
                    } else {
                        websites = new String[]{"https://www.google.com/"};
                    }
                    url = websites[rng.nextInt(websites.length)];
                    break;
                case (2)://games
                    String[] games;
                    if (explicit) {
                        games = new String[]{"https://www.google.com/search?q=Pokemon GO","https://www.google.com/search?q=Limbo","https://www.google.com/search?q=Dumb Ways to Die 2","https://www.google.com/search?q=Dumb Ways to Die","Hole.io","https://www.google.com/search?q=Emily is Away","https://www.google.com/search?q=Flip the Gun","https://www.google.com/search?q=2048 Huge","https://www.google.com/search?q=Lapse: A Forgotten Future","https://www.google.com/search?q=AdVenture Capitalist","https://www.google.com/search?q=RUST","https://www.google.com/search?q=This war of mine"};
                    } else {
                        games = new String[]{"https://www.google.com/"};
                    }
                    url = games[rng.nextInt(games.length)];
                    break;
                case (3)://movies
                    String[] movies;
                    if (explicit) {
                        movies = new String[]{"https://www.google.com/search?q=One Punch Man","https://www.google.com/search?q=A Dog's Purpose","https://www.google.com/search?q=Hachi","https://www.google.com/search?q=Marley and Me","https://www.google.com/search?q=The Notebook","https://www.google.com/search?q=Titanic","https://www.google.com/search?q=Toy Story 3","https://www.google.com/search?q=Up","https://www.google.com/search?q=Avengers: Infinity War","https://www.google.com/search?q=About Time","https://www.google.com/search?q=Mystery Science theater 3000","https://www.google.com/search?q=A Monster Calls"};
                    } else {
                        movies = new String[]{"https://www.google.com/"};
                    }
                    url = movies[rng.nextInt(movies.length)];
                    break;
                case (4)://places
                    String[] places;
                    if (explicit) {
                        places = new String[]{"https://www.google.com/maps/search/war+memorial+near+me/","https://www.google.com/maps/search/cemetery+near+me/"};
                    } else {
                        places = new String[]{"https://www.google.com/maps/search/war+memorial+near+me/","https://www.google.com/maps/search/cemetery+near+me/"};
                    }
                    url = places[rng.nextInt(places.length)];
                    break;
            }
            runURL(url);
        }
    }
    public void settingsButtonPress(View v){
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }
    public void runURL(String url){
        if(!url.equals("")){
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(browserIntent);
        }
    }
}
