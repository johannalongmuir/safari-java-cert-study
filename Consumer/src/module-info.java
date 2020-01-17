import provider.Service;

module Consumer {
//  requires java.base; // unnecessary, just like java.lang
  requires Provider;
  requires java.sql;
  uses Service;
}
