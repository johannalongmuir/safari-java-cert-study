import provider.Service;

module Consumer {
  requires Provider;
  uses Service;
}
