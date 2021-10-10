package Java2HW8;

          Future<?> awaitingAuth = Executors.newSingleThreadExecutor ().submit (() -> {
        while (true) {
        if (inMessage.hasNext ()) {
        String clientMessage = inMessage.nextLine ();
        if (isAuth (clientMessage)) {
        return getLogin (clientMessage);
        }
        }

        }
        return null;
        });

        try {
        String login = awaitingAuth.get (120, TimeUnit.SECONDS);
        } catch (TimeoutException e) {

        }
        }
        }
        }